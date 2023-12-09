package org.example.subset;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        String s ="abc";
        String a = "";
        System.out.println(subSet(s,a));
    }
     static List<String> subSet(String s, String a) {
        if(s.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = s.charAt(0);
        List<String> left = subSet(s.substring(1),a + ch);
        List<String> right = subSet(s.substring(1),a);
        left.addAll(right);
        return left;
        }
}
