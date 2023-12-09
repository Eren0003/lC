package org.example.codeWars;

public class YourOrder {
    public static void main(String[] args) {
        System.out.println(order("Empty input should return empty string"));
    }
    static String order(String words){
        String[] array = words.split(" ");
        int num = 49 ;
        String ans= "";
        int i = 0 ;
        while( i < array.length){
            boolean flag = false;
            for(int j = 0 ; j < array[i].length() ; j++) {
                char temp = array[i].charAt(j);
                if (temp == num) {
                    ans += (array[i])+" ";
                    num++;
                    i = 0 ;
                    flag = true;
                }
            }
            if(!flag){
                i++;
            }
        }
        if(num != 49) {
            return ans.trim();
        }else{
            return words;
        }
    }
}
