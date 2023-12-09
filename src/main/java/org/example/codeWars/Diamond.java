package org.example.codeWars;

public class Diamond {
    public static void main(String[] args) {
        System.out.println(dia(5));
        System.out.println(top(5/2+1));
//        System.out.println("  *\n ***\n*****\n ***\n  *");
//        System.out.println(9/2+1);
    }
    static String dia(int n){
        int top = n/2 + 1;
        int bottom = n/2;
        String ans = "";
        if(n%2 == 0){
            return null;
        }else{
            for(int i = 1 ; i <= top ; i++){
                for(int j = top ; j > i ; j--){
                    ans += "_";
                }
                for(int j = 0 ; j < i*2-1 ; j++){
                    ans += "*";
                }
                ans += "\n";
            }for(int i = bottom ; i >= 1 ; i--){
                for(int j = i ; j <= bottom ; j++){
                    ans += "_";
                }for(int j = i*2-1 ; j > 0 ; j--){
                    ans += "*";
                }
                ans += "\n";
            }
        }
        return ans;
    }
    static String top(int n){
        String ans = "";
        for(int i = 1 ; i <= n ; i++){
            for(int j = n ; j >= i ; j--){
                ans += "_";
            }
            for(int j = 0 ; j < i*2-1 ; j++){
                ans += "*";
            }
            ans += "\n";
        }
        return ans;
    }
}
