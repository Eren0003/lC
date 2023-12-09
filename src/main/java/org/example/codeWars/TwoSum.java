package org.example.codeWars;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]  num = sum(new int[]{1,2,3},4);
        for(int i : num) {
            System.out.println(i);
        }
        System.out.println(Character.toChars(97));
    }
    static int[] sum(int [] number, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0 ; i < number.length ; i++){
            if(map.containsKey(target-number[i])){
                result[0] = map.get(target-number[i]);
                result[1] = i;
                break;
            }
            map.put(number[i],i);
        }
        return result;
    }
}
