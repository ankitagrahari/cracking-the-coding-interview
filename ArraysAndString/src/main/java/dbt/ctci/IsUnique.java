package dbt.ctci;

import java.util.Locale;

public class IsUnique {

    static boolean isUnique(String input){
        boolean[] charArr = new boolean[128];
        input = input.toLowerCase(Locale.ROOT);

        if(input.length()>128) return false;

        for(int i=0; i< input.length(); i++){
            char c = input.charAt(i);
            if(c>='a' && c<='z') {
                if (charArr[c - 'a']) return false;
                charArr[c] = true;
            }
        }

        return true;
    }

    static boolean isUniqueChars(String input){
        int checker = 0;
        for(int i=0; i<input.length(); i++){
            int val = input.charAt(i) - 'a';
            if((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        String input = "Subdermatoglyphic";
        System.out.println(IsUnique.isUnique(input));
        long freeMemory = runtime.freeMemory();

        long usedMemory = (totalMemory-freeMemory)/(1024*1024);
        System.out.println("User Memory:"+ usedMemory);

        long totalMemory1 = runtime.totalMemory();
        System.out.println(IsUnique.isUniqueChars(input));
        long freeMemory1 = runtime.freeMemory();

        long usedMemory1 = (totalMemory1-freeMemory1)/(1024*1024);
        System.out.println("User Memory with bit:"+ usedMemory1);


    }
}
