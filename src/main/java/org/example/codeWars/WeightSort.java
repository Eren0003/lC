package org.example.codeWars;

import java.util.HashMap;
import java.util.Map;

public class WeightSort {
    public static void main(String[] args) {

        System.out.println(sort("2000 10003 1234000 44444444 9999 11 11 22 123z"));
    }
    static String sort(String string){
        String[] array = string.split(" ");
        int [] nums = new int[array.length];
        for(int i = 0 ; i < array.length ; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length(); j++) {
                int num = Integer.parseInt(String.valueOf(array[i].charAt(j)));
                sum += num;
            }
            nums[i] = sum;
        }
        for(int i : nums) {
            System.out.println(i);
        }
        String str = "";
        int index = 0;
        for(int i = 0 ; i < array.length ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < array.length ; j++){
                if(min > nums[j]) {
                    min = nums[j];
                    index = j;
                }
            }
            str += array[index]+" ";
            nums[index] = Integer.MAX_VALUE;
        }
        return str.trim();
    }
}
