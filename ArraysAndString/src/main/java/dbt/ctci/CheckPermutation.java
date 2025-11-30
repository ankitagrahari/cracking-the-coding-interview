package dbt.ctci;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class CheckPermutation {

    /**
     * Assumption: "GOD" == "dog" AND "god    " != "dog"
     * Sort the string and compare
     * Not very efficient
     *
     * @param s
     * @param t
     * @return boolean
     */
    public boolean solution1(@NotNull String s, @NotNull String t){

        if(s.length() != t.length() || s.isEmpty() || t.isEmpty())
            return false;
        return sort(s).equals(sort(t));
    }

    protected String sort(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    /**
     * Assumption: "GOD" == "dog" AND "god    " != "dog"
     *              AND String comprises only characters
     * Iterate through the string to count the occurrence of each character.
     *
     * @param s
     * @param t
     * @return boolean
     */
    public boolean solution2(@NotNull String s, @NotNull String t){
        if(s.length() != t.length() || s.isEmpty() || t.isEmpty()) return false;

        int[] ascii = new int[128];
        for(char c: s.toCharArray()){
            ascii[c]++;
        }

        for(int i=0; i<t.length(); i++){
            ascii[t.charAt(i)]--;
            if(ascii[t.charAt(i)] < 0)
                return false;
        }

        return true;
    }

}
