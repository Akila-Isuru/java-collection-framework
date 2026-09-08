package com.collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
//        Create a list

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(40);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//
//        Collections.sort(list);   //Ascending order
//        System.out.println(list);
//
//        Collections.reverse(list);  //Descending order
//        System.out.println(list);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Akila",23,80000));
        employees.add(new Employee(10,"Nissnaka",23,70000));
        employees.add(new Employee(10,"Madushanka",31,35000));
        employees.add(new Employee(10,"suboda",20,20000));

        Collections.sort(employees,new MySort());
        System.out.println(employees);

    }

    static class MySort implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary()- o2.getSalary();
        }
    }
}
