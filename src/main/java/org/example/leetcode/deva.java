package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deva {
    public static void main(String[] args) {
//     String[] words = {"the","dog","got","a","bone"};
//     String letters = "ae";
//     int i = 3;
//     int j = 4;
//     System.out.println(a(i,j));
        int[] a = {10,20,30,40};
        int[] b = {50,60,70};
        int [] result = new int[a.length+b.length];
        int m = b.length-1;
        for(int i = 0 ; i < result.length ; i++){
            if(i < a.length){
                result[i] = a[i];
            }else{
                result[i] = b[m];
                m--;
            }
        }
        System.out.println(Arrays.toString(result));

    }

    static String[] sneha(String[] words, String letters){
        char [] array = letters.toCharArray();
        List<String> list = new ArrayList<>();
        for(String s : words){
            for(char c : array){
                if(s.contains(c+"")){
                    list.add(s);
                }
            }
        }
        String [] answer = new String[list.size()];
        int i = 0 ;
        for(String s : list){
            answer[i] = s;
            i++;
        }
        return answer;
    }
    static boolean a(int i , int j){
        if(i == 1 || j == 1 || i+j == 1)return true;
        else return false;
    }
}
