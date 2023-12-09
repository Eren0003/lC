package org.example.leetcode.twopointer;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(permutation(s1,s2));
    }
    static boolean permutation(String s1, String s2){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        int i = 0 ;
        int j = s1.length();
        while(j <= s2.length()){
            char[] c2 = s2.substring(i,j).toCharArray();
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

}
