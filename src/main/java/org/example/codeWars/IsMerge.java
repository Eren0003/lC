package org.example.codeWars;

public class IsMerge {
    public static void main(String[] args) {
//        System.out.println(merge("xfm,FXt(g*584m","mfm,Fg*584","Xt(x"));
        int r = 255,g = 255,b = 255;
        System.out.println(String. format("#%02x%02x%02x", r, g, b).toUpperCase()
        );
    }

    static boolean merge(String s,String part1,String part2){
        for(int i = 0 ; i < part1.length() ; i++){
            s = s.replaceFirst(String.valueOf(part1.charAt(i)),"");
        }for(int j = 0 ; j < part2.length() ; j++){
            s = s.replaceFirst(String.valueOf(part2.charAt(j)),"");
        }
        if(s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
