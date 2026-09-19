package com.collections.linkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchAndIterateLinkedList {
    public static void main(String[] args) {

        LinkedList<String> proLanguages = new LinkedList<>();
        proLanguages.add("Java");
        proLanguages.add("Python");
        proLanguages.add("C");
        proLanguages.add("C++");
        proLanguages.add("C++");   //4
        proLanguages.add("Go");

        boolean result =proLanguages.contains("C");
        System.out.println(result);

//        Find the index of the first occurrence of an element in the LinkedList

        int index = proLanguages.indexOf("Java");
        System.out.println("index :"+index);

//        Find the index of the last occurrence of an element in the Linked list

        int lastIndex = proLanguages.lastIndexOf("C++");
        System.out.println("lastIndex :"+lastIndex);

//        iterator,foreach,for each advance loop , simple for loop

//        ITERATOR

        Iterator<String> iterator = proLanguages.iterator();
        while(iterator.hasNext()){
            String prolang = (String)iterator.next();
            System.out.println(prolang);
        }

//        FOREACH
        proLanguages.forEach((element)->{
            System.out.print(element+",");
        });
        System.out.println();

//       ADVANCED  FOREACH

        for(String pro :proLanguages){
            System.out.print(pro+",");
        }

//


    }
}
