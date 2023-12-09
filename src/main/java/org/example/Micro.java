package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Micro {
    public static void main(String[] args) {
         Name name = new Name(1,"eka");
         List<Ratings> ratings = Arrays.asList(
                 new Ratings(1,"es"),
                 new Ratings(2,"da")
         );
         ratings.stream().map(rating->{
//             ratings.
             return null;
         }).collect(Collectors.toList());

    }
}
class Ratings {
    int id;
    String user;
    public Ratings(){}
    public Ratings(int id, String user){
        this.id = id;
        this.user = user;
    }
}
class Name{

    int id;
    String name;
    public Name(){

    }
    public Name(int id,String name){
        this.id = id;
        this.name = name;
    }
    
}
