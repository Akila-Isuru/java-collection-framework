package com.collections.SetsAndHashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaystoIterateSet {
    public static void main(String[] args) {

        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C#");
        courses.add("C++");
        courses.add("Go");

//        Enhanced for loop

        for(String course: courses){
            System.out.println("Course :"+course);
        }

//        Basic loop with iterator
        for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();){
            String course = iterator.next();
            System.out.println("Course :"+course);
        }
//        While loop with iterator

        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String course = iterator.next();
            System.out.println("Course :"+course);
        }
//        JDK 8 forEach() method with lambda

        courses.forEach((course) -> System.out.println("Course :"+course));

//        JDK 8 streaming + forEach() + lambda expression

        courses.stream().filter(course->!"java".equals(course))
                .forEach(System.out::println);


    }
}
