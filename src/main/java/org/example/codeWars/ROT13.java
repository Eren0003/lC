package org.example.codeWars;

public class ROT13 {
    public static void main(String[] args) {
        String rot = "n";
        System.out.println(rot(rot));
    }
    static String rot(String message){
        String result = "";
        for(int i = 0 ; i < message.length() ; i++){
            if((message.charAt(i) >= 97 && message.charAt(i) < 110) ||
                    (message.charAt(i) >= 65 && message.charAt(i) < 78)){
                result += (char)((int)message.charAt(i)+13);
            }else if((message.charAt(i) >= 110 && message.charAt(i) <= 122) ||
                    (message.charAt(i) >= 78 && message.charAt(i) <= 9)){
                result += (char)((int) message.charAt(i)-13);
            }else{
                result += message.charAt(i);
            }
        }
        return result;
    }
}
