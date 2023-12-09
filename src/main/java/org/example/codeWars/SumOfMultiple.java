package org.example.codeWars;
public class SumOfMultiple {
    public static void main(String[] args) throws Exception {
        System.out.println(sumMul(123,4567));
    }
     static long sumMul(int n, int m) throws Exception {
        if(n>m){
            throw new IllegalArgumentException();
        }
        int temp = n;
        int sum = 0 ;
        while(temp < m){
            sum += temp;
            temp += n;
        }
        return sum;
    }
}
