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
}
