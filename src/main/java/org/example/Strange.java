package org.example;

public class Strange {
    public static void main(String[] args) {
        String s = "shsjdtssdbrsdahnger";
        System.out.println(strange(s));
    }
    static String strange(String s){
        String strange = "stranger";
        int index = 0 ;
        for(int i = 0  ; i < s.length() ; i++){
            if(s.charAt(i) == strange.charAt(index)){
                index++;
            }
        }
        if(index == strange.length()){
            return "Yes";
        }else{
            return "No";
        }
    }
}
