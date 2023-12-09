package org.example.codeWars;


public class Tribonosis {
    public static void main(String[] args) {
        for(double i:fib(new double[]{8,6,20},7)){
            System.out.print(i+" ");
        }
    }
    static double[] fib(double[] s,int n){
        double [] ans = new double[n];
        double sum = 0 ;
        int m = 0 ;
        if(n < s.length) {
            for (int i = 0; i < n; i++) {
                sum += i;
                ans[i] = s[i];
            }
            return ans;
        }else {
            for (double i : s) {
                sum += i;
                ans[m] = i;
                m++;
            }

        }int index = 0 ;
        for(int i = s.length ; i < n ; i++){
            ans[i] = sum;
            sum += ans[i];
            sum -= ans[index];
            index++;
        }
        return ans;
    }
}
