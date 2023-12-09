package org.example.codeWars;

public class Square {
    public static void main(String[] args) {
//        System.out.println(square(-10,-2,7));
        sudha(100,2);
    }
    static String square(int x,int y,int length){
        int topX = x+length;
        int topY = y+length;
        return topX+"\n"+topY;
    }
    static void sudha(int M , int B ){
        for(int i = 0 ; i < B ; i++){
            M =M*2;
        }
        System.out.println(M);
    }

}
