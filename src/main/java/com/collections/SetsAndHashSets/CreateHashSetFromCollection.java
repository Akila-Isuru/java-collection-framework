package com.collections.SetsAndHashSets;

//Create a HashSet from another collection using the HashSet(Collection c) constructor
//Add All the elements from a collection to the HashSet using the addAll() method

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollection {
    public static void main(String[] args) {

//        Set<Integer> firstFiveEvenNumbers = new HashSet();
        List<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

//        Create HashSet from another collection using the HashSet(Collection c) constructor

        Set<Integer> firstTenEvenNumbers = new HashSet(firstFiveEvenNumbers);
        System.out.println("First five even Numbers :"+firstTenEvenNumbers);

//        Set<Integer> nextFiveEvenNumbers = new HashSet();
        List<Integer> nextFiveEvenNumbers = new ArrayList<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

//     Add all the elements from a collection to the HashSet using the addAll() method
        firstTenEvenNumbers.addAll(nextFiveEvenNumbers);
        System.out.println("First ten even numbers :"+firstTenEvenNumbers);

    }

}
