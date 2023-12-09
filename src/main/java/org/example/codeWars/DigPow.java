package org.example.codeWars;

public class DigPow {
    public static void main(String[] args) {
        System.out.println(pow(694,2));
    }
    static int pow(int n , int p){
        String temp = n+"";
        String[] array = temp.split("");
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum += Math.pow(Integer.parseInt(array[i]),p);
            p++;
        }
        if(sum%n == 0){
            return sum/n;
        }
        return -1;
    }
}
