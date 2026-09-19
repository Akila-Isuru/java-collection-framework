package com.collections.linkedLists;

import java.util.LinkedList;

/**
 * How to get first Element
 * How to get  last Element
 * How to get the element at a given index in the LinkedList
 * How to get all the elements from the likedList
 */
public class RetrieveLinkedListElements {
    public static void main(String[] args) {


        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

//       Getting first element in the LinkedList using getFirst()

        String firstElement = fruits.getFirst();
        System.out.println("First Element :"+firstElement);

        // Getting last element in the LinkedList using getFirst()

        String lastElement = fruits.getLast();
        System.out.println("Last Element :"+lastElement);

        //  Getting specific element in the LinkedList using getFirst()

        String specificElement = fruits.get(1);
        System.out.println("Specific Element :"+specificElement);

        for (String fruit : fruits) {
            System.out.print(fruit+" ");
        }


    }
}
