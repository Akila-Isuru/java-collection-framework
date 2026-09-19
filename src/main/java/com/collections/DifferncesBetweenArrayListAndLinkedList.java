package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferncesBetweenArrayListAndLinkedList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        /**
         * ArrayList internally uses a dynamic array
         * Manipulation with arrayList is slow because it internally uses an array
           if any element is removed from the array all the bits are shifted in memory

         *ArrayList consumes less memory than LinkedList
         * An ArrayList class can act as a list only because it implements List only

         *ArrayList is better for storing and access data
         */
        LinkedList<String> linkedList = new LinkedList<String>();

        /**
         * LinkedList internally uses a doubly linkedList to store the elements
         *  Manipulation with Linked list faster than ArrayList because it uses a doubly
            linkedList so no bit shifting is required in memory

         * A linkedList consumes more memory than an ArrayList because it also stores the next
           and previous references along with the data

         *LinkedList class can act as a list and queue both because it implements List and Deque interfaces

         *LinkedList is better for manipulating data

         */

    }

}
