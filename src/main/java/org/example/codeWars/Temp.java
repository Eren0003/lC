package org.example.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        String ans = "";
        String s = "10.0.0.0";
        String [] array = s.split("\\.");
        for(String a: array){
            System.out.println(a);
        }
//        for(int i = 0 ; i < str.length() ;i++){
//            if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o'
//                    || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'A' ||
//                    str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
//                    str.charAt(i) == 'U')){
//                ans += str.charAt(i);
//            }
//        }
//        System.out.println(ans);
//        System.out.println((int)'0');
//        System.out.println(alphanumeric("7fj9iJgnSTrcqP8c88ZQg0qwIlg"));
//        List<Integer> binary = Arrays.asList(1,1,1,1);
//        int sum = 1 ;
//        int result = 0 ;
//        for(int i = binary.size()-1 ; i >= 0 ; i--){
//            if(binary.get(i) == 1){
//                result += sum;
//            }
//            sum += sum ;
//        }
//        System.out.println(result);
    }
    public static boolean alphanumeric(String s){
        if(s.length() == 0){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(!((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 65 && s.charAt(i) <= 90))){
                return false;
            }
        }
        return true;
    }
}
