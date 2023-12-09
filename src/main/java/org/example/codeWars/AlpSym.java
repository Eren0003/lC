package org.example.codeWars;

public class AlpSym {
    public static void main(String[] args) {
        String [] arr = {"abode","ABc","xyzD"};
        int [] result = sym(arr);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    static int[] sym(String [] arr){
        int [] result  = new int[arr.length];
        for(int m = 0 ; m < arr.length ; m++){
            int counter = 0;
            int i = 97 ,j = 65;
            for(char c : arr[m].toCharArray()){
                if(Integer.valueOf(c) == i || Integer.valueOf(c) == j){
                    counter++;
                }
                i += 1;
                j += 1;
            }
            result[m] = counter;
        }
        return result;
    }
}
