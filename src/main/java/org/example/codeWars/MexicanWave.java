package org.example.codeWars;

public class MexicanWave {
    public static void main(String[] args) {
        String [] ans = wave("hello world");
        for(String s : ans){
            System.out.println(s+" ");
        }
//        System.out.println((int)'z');
    }
    static String[] wave (String str){
        int counter = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) <= 122 && str.charAt(i) >= 97){
                counter++;
            }
        }
        System.out.println(counter);
        String [] ans = new String[counter];
        int index = 0 ;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(str.charAt(i) <= 122 && str.charAt(i) >= 97) {
                    String temp = (str.substring(0, i).concat(String.valueOf(c).toUpperCase())).concat(str.substring(i + 1, str.length()));
                    ans[index] = temp;
                index++;
            }
        }
        return ans;
    }
}
