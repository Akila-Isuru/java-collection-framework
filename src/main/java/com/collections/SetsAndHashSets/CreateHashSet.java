package com.collections.SetsAndHashSets;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSet {
    public static void main(String[] args) {

//        create a HashSet using the HashSet() constructor
//        add new elements to it using the add() method

//        unordered collection
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");

        System.out.println(programmingLanguages);

//        lets add duplicate element

        programmingLanguages.add("Java");
        System.out.println(programmingLanguages);    //[Java, C++, C, Python]
    }
}
