package org.example.codeWars;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camel("ab  c"));
    }
    static String camel(String str){
        str = str.trim();
        String[] array = str.split(" ");
        System.out.println(array.length);
        String ans = "";
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == ""){
                continue;
            }
            ans += String.valueOf(array[i].charAt(0)).toUpperCase().concat(array[i].substring(1,array[i].length()));
        }
        return ans;
    }
}
