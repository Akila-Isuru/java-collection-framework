package com.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {

//        Collection interface is the root interface of collections

        Collection<String> fruitCollection = new ArrayList<>();

        fruitCollection.add("apple");
        fruitCollection.add("orange");
        fruitCollection.add("banana");
        System.out.println(fruitCollection);

        fruitCollection.remove("apple");
        System.out.println(fruitCollection);

        Boolean isContain = fruitCollection.contains("grape");
        System.out.println(isContain);

        fruitCollection.forEach((element)-> System.out.println(element));

        fruitCollection.clear();
        System.out.println(fruitCollection);



    }
}
