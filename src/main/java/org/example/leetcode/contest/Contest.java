package org.example.leetcode.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Contest{
    public static void main(String[] args) {
        charIncrementer("3indu8");
    }
    static int minimumOneBitOperations(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        int result = 0 ;
        boolean operation = true;
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i) == '1' ){
                double pow = Math.pow(2,binary.length()-i);
                if(pow == 2 && operation){
                    pow = 1;
                }
                if(!operation){
                    result -= pow;
                }else{
                    result += pow;
                }
                operation = !operation;
            }
        }
        if(result == Math.pow(2,binary.length())){
            return result-1;
        }
        return result;
    }
    static void charIncrementer(String s){
        String result = "" ;
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isAlphabetic(s.charAt(i))) {
                if (s.charAt(i) == 'z') {
                    result += 'a';
                } else if (s.charAt(i) == 'Z') {
                    result += 'A' ;
                } else {
                    result += (char) (s.charAt(i) + 1);
                }
            }else{
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
    static void nonDuplicate(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
            }
        }
    }
    static String bracketReverse(String s){
        Stack<String> stack = new Stack<>();
        String curr = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                String temp = curr;
                stack.push(temp);
                curr = "";
            }else if(s.charAt(i) == ')'){
                curr = stack.pop()+rev(curr);
            }else{
                curr += s.charAt(i);
            }
        }
        return curr;
    }
    static String rev(String s){
        String result = "";
        for(int i = s.length()-1 ; i >= 0 ; i--){
            result += s.charAt(i);
        }
        return result;
    }
    static int beautifulSubstrings(String s, int k) {
        int result = 0 ;
        String vowels ="aeiou";
        for(int i = 0 ; i < s.length() ; i++){
            int cons = 0 , vowel = 0 ;
            for(int j = i ; j < s.length() ; j++){
                if(vowels.contains(s.charAt(j)+"")){
                    vowel += 1;
                }else{
                    cons += 1;
                }
                if (vowel == cons && (vowel * cons) % k == 0) {
                    result += 1;
                }
//                System.out.println(s.substring(i,j+1) +" vowels "+vowel+" cons "+cons);
            }
        }
        return result;
    }
    static boolean areSimilar(int[][] mat, int k) {
        int[][] check = new int[mat.length][mat[0].length];
        for(int i = 0 ; i < k  ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                int prevE = mat[j][mat[0].length-1];
                int prevO = mat[j][0];
                if(j%2 == 0) {
                    for(int m = 0 ; m < mat[0].length ; m++){
                        if(i == 0){
                            check[j][m] = mat[j][m];
                        }
                        int temp = mat[j][m];
                        mat[j][m] = prevE;
                        prevE = temp;
                    }
                }else{
                    for(int m = mat[0].length-1 ; m >= 0 ; m--){
                        if(i == 0){
                            check[j][m] = mat[j][m];
                        }
                        int temp = mat[j][m];
                        mat[j][m] = prevO;
                        prevO = temp;
                    }
                }
            }
        }
        for(int i= 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] != check[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
