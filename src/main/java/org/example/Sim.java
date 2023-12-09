package org.example;

import org.w3c.dom.ls.LSOutput;

public class Sim {
    public static void main(String[] args) {
        String s = "program";
        final int mid = s.length()/2;
        boolean i = true;
        String result = s.charAt(mid)+"$";
        int temp = mid+1;
        while(i) {
            if (temp == mid) {
                break;
            }
            if (temp == s.length()) {
                temp = 0;
            }
            result += s.charAt(temp) + "$";
            temp++;
        }
        System.out.println(result);
    }
}
