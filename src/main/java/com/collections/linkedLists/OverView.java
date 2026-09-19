package com.collections.linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * java LinkedList can contain duplicate values
 * and its maintain the insertion order
 * The linkedList class implements Queue and Deque interfaces.thereFore it can be used as a Queue and Deque or Stack
 * Java LinkedList is not thread safe
 *
 * Difference between arraylist and linkedList in java
 *
 * arrayList -
 * Dynamic Array එකක් භාවිත කරයි.
 * ඉතා වේගවත්ය -Index එක මගින් සෘජුවම Element එකට access කළ හැක.
 * Element එකක් මධ්‍යයෙන් ඉවත් කිරීමේදී අනෙක් Elements Shift කිරීමට සිදු වේ.
 * අඩු මතකයක් ගනී.
 *
 * LinkedList -
 * Doubly Linked List එකක් භාවිත කරයි.
 * අදාළ ස්ථානයට යන තෙක් Elements එකින් එක සෙවිය යුතුය. in data search
 * Nodes අතර Pointers (Links) වෙනස් කිරීම පමණක් සිදු වේ. in data insertion
 *වැඩි මතකයක් ගනී.දත්ත මෙන්ම ඊළඟ සහ පෙර Node එකට අදාළ Pointers ද ගබඩා කරයි.
 *
 * ArrayList භාවිතා කරන්න:
 * ඔබට දත්ත ගොඩක් Search/Access කිරීමට අවශ්‍ය වන විට.
 * දත්ත අගට එකතු කිරීම ($O(1)$) පමණක් වැඩිපුර සිදු වන විට.
 *
 * LinkedList භාවිතා කරන්න:
 * ලැයිස්තුවේ මුලට, මැදට හෝ අගට නිතරම දත්ත ඇතුළත් කිරීම (Insert) සහ ඉවත් කිරීම (Delete) සිදු වන විට.
 *
 */

/**
 * add()
 * add(2,element)
 * addFirst()-comes from Deque interface not in the list interface
 * addLast()-comes from Deque interface not in the list interface
 */
public class OverView {
    public static void main(String[] args) {

      LinkedList<String> fruits = new LinkedList<>();
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Orange");

        System.out.println(fruits);

//        Adding element to specific position in the Linked list

        fruits.add(2,"Watermelon");
        System.out.println("After adding watermelon :"+fruits);

//        Adding element at the beginning of the linked list

        fruits.addFirst("Avacado");
        System.out.println("After adding Avacado to the front of the list :"+fruits);

        fruits.addLast("Papaya");
        System.out.println("After adding Papaya to the list :"+fruits);

    }
}
