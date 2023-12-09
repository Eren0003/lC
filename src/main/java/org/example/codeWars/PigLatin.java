package org.example.codeWars;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("O tempora o mores !"));
    }
    public static String pigIt(String str) {
        String [] array = str.split(" ");
        System.out.println(str);
        String result = "";
        for(int i = 0 ; i < array.length ; i++){
            if(array[i].length() == 1 && (!(array[i].charAt(0) <= 90 && array[i].charAt(0) >= 65) &&
                    !(array[i].charAt(0) <= 122 && array[i].charAt(0) >= 97))) {
                if(i == array.length-1) {
                    result += array[i];
                }else{
                    result += array[i]+" ";
                }
            }else{
                String temp = array[i].substring(1);
                char firstChar = array[i].charAt(0);
                if(i == array.length-1){
                    result += temp+firstChar+"ay";
                }else{
                    result += temp+firstChar+"ay ";
                }
            }
        }
        return result;
    }
}
