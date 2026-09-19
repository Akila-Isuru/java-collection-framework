package com.collections.linkedLists;

import java.util.LinkedList;

/**
 * How to remove the first element in the LinkedList
 * How to remove the last element in the LinkedList
 * How to remove the first occurrence of the given element in the LinkedList
 * How to clear the LinkedList Completely
 */
public class RemoveElementsFromLinkedList {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

//        Remove the first element in the LinkedList

        String firstElement = fruits.removeFirst();
        System.out.println("After remove the first element :"+firstElement);

//        Remove the last element in the LinkedList
        String lastElement = fruits.removeLast();
        System.out.println("After remove the last element :"+lastElement);

//        Clear the linkedlist

        fruits.clear();
        System.out.println("After remove all fruits :"+fruits);


    }
}
