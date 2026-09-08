package com.collections.arrayLists;


import java.util.ArrayList;
import java.util.List;

/**
 * How to check if an ArrayList is empty using the isEmpty() method
 * how to find the size of an arrayList using the size() method
 * how to access the element at a particular index in an arrayList using the get() method
 * how to modify the element at a particular index in an arrayList using the set() method
 */
public class AccessElementsFromArrayList {
    public static void main(String[] args) {

        List<String> programmingLanguage = new ArrayList<>();
        Boolean isEmpty = programmingLanguage.isEmpty();

        System.out.println("Programming language arrayList isEmpty: " + isEmpty);

        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("C#");
        programmingLanguage.add("JavaScript");
        programmingLanguage.add("PHP");

        System.out.println("Programming language arrayList: " + programmingLanguage);

//        Find the size of an arrayList

        System.out.println("size: " + programmingLanguage.size());

//        Retrieve an element by given index

        System.out.println(programmingLanguage.get(0));


        // Modify the element at a given index

        programmingLanguage.set(2, "Golang");
        System.out.println("Programming language arrayList: " + programmingLanguage);


    }
}
