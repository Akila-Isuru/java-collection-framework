package com.collections.arrayLists;

import java.util.Arrays;
import java.util.List;

public class DifferentWaysToIterateOverList {
    public static void main(String[] args) {

        List<String> courses =  Arrays.asList("C","C++","JAVA","Spring");

//                               Basic for loop

        for(int i=0;i<courses.size();i++){
            System.out.println(courses.get(i));
        }

//                               Enhanced for loop
//
        for(String course:courses){
            System.out.println(course);
        }

//                   Java 8 stream +lambda expressions


        courses.stream().forEach((course)->System.out.println(course));

//              java 8 foreach + lambda expressions

        courses.forEach((course)-> System.out.println(course));








    }
}
