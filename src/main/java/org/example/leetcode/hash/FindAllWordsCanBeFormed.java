package org.example.leetcode.hash;

import java.util.Arrays;

public class FindAllWordsCanBeFormed {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","hat","tree"},"atach"));
    }
    static int countCharacters(String[] words, String chars) {
        int result = 0 ;
        int[] count = new int[26];
        for(int i = 0 ; i < chars.length() ; i++){
            count[chars.charAt(i)-'a'] += 1;
        }
        for(String word : words){
            int[] wordCount = new int[26];
            boolean flag = true;
            for(int i = 0 ; i < word.length() ; i++){
                wordCount[word.charAt(i)-'a'] += 1;
                if(wordCount[word.charAt(i)-'a'] > count[word.charAt(i)-'a']){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result += word.length();
            }
        }
        return result;
    }
}
