package com.collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList is a resizeable array also called dynamic array
 * it grows when you add new elements nd it shrinks when elements are removed
 * it allows duplicates and null values
 * it maintains the insertion order and we cannot create an arraylist with primitive data Types
 * java ArrayLists are npt synchronized
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Pineapple");

        System.out.println(arrayList);

    }
}
