package com.collections.arrayLists;


import java.util.ArrayList;
import java.util.List;

/**
   remove()
   removeAll()
   clear()
 */
public class RemoveElementsArrayList {
    public static void main(String[] args) {

        List<String> programmingLanguage = new ArrayList<>();

        programmingLanguage.add("Java");
        programmingLanguage.add("Python");
        programmingLanguage.add("C#");
        programmingLanguage.add("JavaScript");
        programmingLanguage.add("PHP");

        System.out.println("Programming language arrayList: " + programmingLanguage);

        programmingLanguage.remove(3);
        System.out.println("after removing the element at index 3: " + programmingLanguage);

        programmingLanguage.remove("PHP");
        System.out.println("after removing the element PHP: " + programmingLanguage);

        List<String> subprogrammingLang = new ArrayList<>();
        subprogrammingLang.add("Java");
        subprogrammingLang.add("Python");

        programmingLanguage.removeAll(subprogrammingLang);
        System.out.println("after removing the subArraylist elements : " + programmingLanguage);

        programmingLanguage.removeAll(programmingLanguage);
        System.out.println("after removing all elements : " + programmingLanguage);

    }
}
