package org.example.leetcode;

public class new2 {
    public static void main(String[] args) {
        String s = "aaabaaaa";
//        System.out.println(string(s));
    }

    public static String string(String s) {
        for(int i = 0 ; i < s.length()-2 ; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                s = s.substring(0,i)+" "+s.substring(i+1,s.length());
            }
        }
        s = s.replaceAll("\\s","");
        return s;
    }
}
