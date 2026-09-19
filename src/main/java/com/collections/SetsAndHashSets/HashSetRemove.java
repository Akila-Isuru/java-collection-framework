package com.collections.SetsAndHashSets;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemove {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("numbers :"+numbers);

//        Using remove() method

        boolean result = numbers.remove(1);
        System.out.println("remove method result :"+result);
        System.out.println("After removing 1 :"+numbers);

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

//        Using removeAll() numbers
        numbers.removeAll(evenNumbers);
        System.out.println("After removing even numbers :"+numbers);

//        clear() method
        numbers.clear();
        System.out.println("After clear() method :"+numbers);
    }
}
