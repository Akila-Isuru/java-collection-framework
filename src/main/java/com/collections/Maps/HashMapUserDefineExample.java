package com.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefineExample {
    public static void main(String[] args) {

//        Create HashMap
        Map<Integer,Student> studentMap= new HashMap<>();

        studentMap.put(1,new Student("Akila","Isuru"));
        studentMap.put(2,new Student("Bob","Karim"));
        studentMap.put(3,new Student("Pathum","Nissanka"));

        System.out.println(studentMap.values());
    }
}
