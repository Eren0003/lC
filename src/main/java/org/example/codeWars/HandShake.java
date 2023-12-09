package org.example.codeWars;

public class HandShake {
    public static void main(String[] args) {
        System.out.println(shake(11));
    }
    static int shake(int n) {
        for(int i = 1 ; i <= n ; i++){
            int handshake = (i*(i+1))/2;
            if(handshake >= n){
                return i+1;
            }
        }
        return 0;
    }
}
