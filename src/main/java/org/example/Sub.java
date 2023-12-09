package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sub {
    public static void main(String[] args) {
//        String s = "1111110011101010110011100100101110010100101110111010111110110010";
//        System.out.println(fun(s));
        System.out.println(9%10);
    }
    static long fun(String s){
        long binary =Long.parseLong(s,2);
        long counter = 0 ;
        while(binary != 1){
            if(binary%2 == 0){
                binary = binary/2;
                counter++;
            }
            else{
                binary++;
                counter++;
            }
        }
        return counter;
    }
//    static long binaryConverter(String s){
//
//    }
}
