package org.example.codeWars;

public class SplitString {
    public static void main(String[] args) {
        String s = "abcd2380";
//        System.out.println(s.length()/2);
        String[] array = split(s);
        System.out.println(Math.sqrt(10));
        for(String m : array){
            System.out.print(m+" ");
        }
    }
    static String[] split(String s){
        String []ans ;
        if(s.length()%2 == 0){
             ans = new String[s.length()/2];
        }else{
             ans = new String[(s.length()/2)+1];
             ans[ans.length-1] = s.charAt(s.length()-1)+"_";
        }
        for(int i = 0 ; i < s.length()/2 ; i++){
            ans[i] = s.substring(i*2,(i*2)+2);
        }
        return ans;
    }
}
