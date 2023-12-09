package org.example.codeWars;

import java.util.Objects;
import java.util.Stack;

public class DirectionReduction {
    public static void main(String[] args) {
//        String [] result = reduction(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"});
//        for(String i : result ){
//            System.out.print(i+" ");
//        }
        String [] temp = {"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"};
        red(temp);

    }
//    static String[] reduction(String [] direction){
//        Stack<String> stack = new Stack<>();
//        boolean flag = true;
//        for(int i = 0 ; i <direction.length ; i++){
//            if(!stack.isEmpty()){
//                if(stack.peek() == "NORTH" && (direction[i] == "south" || direction[i] == "SOUTH")){
//                    flag = false;
//                    stack.pop();
//                }else if(stack.peek() == "SOUTH" && (direction[i] == "north" || direction[i] == "NORTH")){
//                    flag = false;
//                    stack.pop();
//                }else if(stack.peek() == "EAST" && (direction[i] == "west" || direction[i] == "WEST")){
//                    flag = false;
//                    stack.pop();
//                }else if(stack.peek() == "WEST" && (direction[i] == "east" || direction[i] == "EAST")){
//                    flag = false;
//                    stack.pop();
//                }else {
//                    flag = true;
//                }
//            }
//            if(flag) {
//                if (direction[i].contains("NO") || direction[i].contains("no")) {
//                    stack.add("NORTH");
//                    flag = true;
//                } else if (direction[i].contains("so") || direction[i].contains("SO")) {
//                    stack.add("SOUTH");
//                    flag = true;
//                } else if (direction[i].contains("ea") || direction[i].contains("EA")) {
//                    stack.add("EAST");
//                    flag = true;
//                } else {
//                    stack.add("WEST");
//                    flag = true;
//                }
//            }else {
//                flag = true;
//            }
//        }
//        String [] result = new String[stack.size()];
//        int j = 0;
//        for(String i : stack){
//            result[j] = i;
//            j++;
//        }
//
//        return result ;
//    }
    static String[] red(String [] direction){
        Stack<String>stack = new Stack<>();

        for(int i = 0 ; i < direction.length ; i++){
            if(stack.isEmpty()){
                stack.add(direction[i]);
            }else if(direction[i].equals("NORTH") && stack.peek().equals("SOUTH")){
                stack.pop();
            }else if(direction[i].equals("SOUTH") && stack.peek().equals("NORTH")){
                stack.pop();
            }else if(direction[i].equals("EAST") && stack.peek().equals("WEST")){
                stack.pop();
            }else if(direction[i].equals("WEST") && stack.peek().equals("EAST")){
                stack.pop();
            }else{
                stack.add(direction[i]);
            }
        }
        String[] result = new String[stack.size()];
        int i = 0;
        for(String str : stack){
            result[i] = str;
            i++;
        }
        return result;
    }
}
