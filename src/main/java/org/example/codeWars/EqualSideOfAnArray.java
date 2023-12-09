package org.example.codeWars;

public class EqualSideOfAnArray {
    public static void main(String[] args) {
        System.out.println(equals(new int[]{20,10,-80,10,10,15,35}));
//        System.out.println(equals(new int[]{1,2,3,4,3,2,1}));
    }
    static int equals(int[] arr){
        int sum = 0 ;
        for(int i : arr){
            sum += i;
        }
        int result = -1;
        int right = sum;
        int left = 0 ;
        for(int i = arr.length-1 ; i >= 1 ; i--){
            right -= arr[i];
            if(right == left){
                result = i;
                break;
            }
            System.out.println("right-> "+right +"left-> "+ left);
            left += arr[i];
        }
        return result;
    }
}
