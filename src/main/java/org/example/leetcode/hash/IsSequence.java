package org.example.leetcode.hash;

public class IsSequence {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "ahbgddc";
        System.out.println(seq(s,t));
    }
    static boolean seq(String s , String t){
        int sIndex = 0;
        int tIndex = 0;
        int count = 0 ;
        while(tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                count++;
                tIndex++;
            }else {
                tIndex++;
            }if(sIndex == s.length() && count == s.length()){
                return true;
            }
        }
        return false;
    }
}
