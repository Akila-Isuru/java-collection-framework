package com.collections.interfaces;


//List is an ordered collection it maintains the insertion order
//you can access elements by their indexes and also search elements in the list
//it allows you to add duplicate elements
//list allows you to have null values
//List indexes starts from 0 like arrays
//Some of the most used List Implementations classes are ArrayList,LinkedList,Vector


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
//        List allows you to add duplicate elements adn null values and it maintains the insertion order

        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element3");

        list.add(null);
        list.add(null);
        System.out.println(list);


//        Access elements from a list

        System.out.println(list.get(0));

    }
}
