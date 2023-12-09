package org.example.codeWars;

public class StrInc {
    public static void main(String[] args) {
        String s = "foo";
        System.out.println(increment(s));
    }
    static String increment(String str){
        int num = 0 ;
        boolean zero = true ;
        boolean empty = true;
        String result = "";
        for(int i = 0 ; i < str.length() ; i++){
            if((int) str.charAt(i) == 48 ){
                result += str.charAt(i);
                zero = true;
            }
            else if((int) str.charAt(i) <= 57 && (int) str.charAt(i) >= 49 ){
                num = (num*10) + Integer.parseInt(str.charAt(i)+"");
                zero = false;
            }else {
                result += str.charAt(i);
            }
        }
        if(zero)
        result = result.substring(0,result.length()-1);
        num += 1;
        return  result +num;
    }
}
