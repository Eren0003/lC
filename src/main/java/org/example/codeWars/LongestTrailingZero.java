package org.example.codeWars;

public class LongestTrailingZero {
    public static void main(String[] args) {
//        System.out.println(zero(25));
        System.out.println("A->"+(int)+'A'+"E->"+(int)'E'+"I->"+(int)'I'+"O->"+(int)'O'+"z->"+(int)'Z');
        String str = "XaeiouX";
        int counter = 0;
        for(int i = 0 ; i < str.length() ;i++){
            if ((str.charAt(i) > 97  && str.charAt(i) < 101) || (str.charAt(i) > 101 && str.charAt(i) < 105)
            || (str.charAt(i) > 105 && str.charAt(i) < 111) || (str.charAt(i) > 111 && str.charAt(i) < 117)
            || (str.charAt(i) > 117 && str.charAt(i) <= 122) || (str.charAt(i) > 65 && str.charAt(i) < 69) || (str.charAt(i) > 69 && str.charAt(i) < 73)|| (str.charAt(i) > 73 && str.charAt(i) < 79)
            || (str.charAt(i) > 79 && str.charAt(i) < 85) || (str.charAt(i) > 85 && str.charAt(i) <= 90)){
                counter++;
            }
        }
        System.out.println(counter);
    }
    static int zero(int n){
        int i = 1;
        int sum = 1;
        while(i <= n){
            sum *= i;
            i++;
        }
        return sum;
    }
}
