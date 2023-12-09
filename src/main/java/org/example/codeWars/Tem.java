package org.example.codeWars;

public class Tem {
    public static void main(String[] args) {
        System.out.println(meth("20.0.0.10","20.0.1.0"));
    }
    static long meth(String start , String end){
        System.out.println(start+" "+end);
        String [] sArray = start.split("\\.");
        String [] eArray = end.split("\\.");
        System.out.println(sArray.length+" "+eArray.length);
        long result = Integer.parseInt(eArray[3]) - Integer.parseInt(sArray[3]);
        result += (Integer.parseInt(eArray[2]) - Integer.parseInt(sArray[2]))* 256L;
        result += (long) (Integer.parseInt(eArray[1]) - Integer.parseInt(sArray[1])) *256*256;
        result += (long) (Integer.parseInt(eArray[0]) - Integer.parseInt(sArray[0])) *256*256*256;
        return result;
    }
}

