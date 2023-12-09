package org.example.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationArray {
    public static void main(String[] args) {
        int[]array  = {3,4,5};
        List<List<Integer>> list = new ArrayList<>();
//        System.out.println(permute(array));
        System.out.println(Math.ceil(5.0));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        function(list,nums,0);
        return list;
    }
    static void function(List<List<Integer>> ans, int[] arr, int start) {
        if (start == arr.length) {
            String a = "";
            List<Integer> list = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                a += arr[i];
            }
            if(Integer.parseInt(a) >= 400) {
                System.out.println(a);
            }
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            function(ans, arr, start + 1);
            swap(arr, start, i);
        }
    }
    static void swap(int[] arr, int a, int b) {
        if(a == b)return ;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
