package org.example.valid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class te {
    public static void main(String[] args) {
        String name = null;
//        System.out.println(name.isBlank());
        List<String> actor = Arrays.asList(null,"surya");
        if(actor.stream().anyMatch((a)-> a == null)){
            System.out.println("null");
        }else{
            System.out.println("hw");
        }
    }
}
