package org.example.codeWars;

public class IpBinary {
    public static void main(String[] args) {
        System.out.println(binary(0));
    }
    static String binary(long ip){
        String str = Long.toBinaryString(ip);
        String ans = "";
        if(ip == 0){
            return "0.0.0.0";
        }
        int len = str.length()/4;
        int end = len;
        int start = 0 ;
        for(int i = 0 ; i < 4 ; i++){
            String temp = str.substring(start,end);
            start += len;
            end += len;
            int binary = Integer.parseInt(temp,2);
            if(i == 3){
                ans +=String.valueOf(binary);
            }else{
                ans += binary+".";
            }
        }
        return ans;
    }
}
