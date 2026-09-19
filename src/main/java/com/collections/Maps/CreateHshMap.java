package com.collections.Maps;

import java.util.*;

public class CreateHshMap {
    public static void main(String[] args) {

        Map<String,Integer> numberMapping = new HashMap<>();

//        add key-value pair to map

        numberMapping.put("One",1);
        numberMapping.put("Two",2);
        numberMapping.put("Three",3);
        numberMapping.put("Four",4);
        numberMapping.put("Five",5);

        numberMapping.put(null,6);

        System.out.println(numberMapping);  //{null=6, Five=5, One=1, Four=4, Two=2, Three=3}

//        when you are trying to add duplicate key it replace the existing value

        numberMapping.put(null,7);
        System.out.println(numberMapping);  //{null=7, Five=5, One=1, Four=4, Two=2, Three=3}

//        Check is hashMap is empty

        boolean isEmpty = numberMapping.isEmpty();
        System.out.println(isEmpty); //false

//        Check  if a key exists in the HashMap
        boolean isContains = numberMapping.containsKey("One");
        System.out.println(isContains); //ture

//        check if a value exists in a HashMap
        boolean isExist = numberMapping.containsValue(1);
        System.out.println(isExist); //true

//        get value by its key

        Integer number = numberMapping.get("One");
        System.out.println("Number :"+number);

        //How to remove Keys from HashMaps

        numberMapping.remove("One");
        System.out.println("After removing key :"+ numberMapping);

        //get only keys from HashMap
//        keySet() method return Set.Because keys of map cannot be duplicate thats why its returning a key

        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

//        Get only values from HashMap
//        Values can be duplicate in hashmaps thats why its returning Collection

        Collection<Integer> numValues = numberMapping.values();
        System.out.println(numValues);


//        Different ways to iterate over hashmap

//       forEach method

        for(Map.Entry<String,Integer> entry : numberMapping.entrySet()){
            System.out.println("key->"+entry.getKey()+" value->"+entry.getValue());
        }

//        ForEach lambda expressions

        numberMapping.forEach((k,v)->{
            System.out.println("key->"+k+" value->"+v);
        });



    }
}
