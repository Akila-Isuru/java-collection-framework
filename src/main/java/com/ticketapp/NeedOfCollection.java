package com.ticketapp;

public class NeedOfCollection {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30 ;
        int d = 40;
        int e = 50;

        int [] arr = new int[100000];

//       <------  Limitations of an array ------>

//        1.Arrays are fixed size
//        2.Arrays can holds same type of data elements
//        3.does not provide utility methods

        Student []  students = new Student[10];
        students[0] = new Student();
        students[1]= new Student();

//        students[2]= new Book();  this is not allow you cant store
//        different type data in an array


//        but you can solve it like this

        Object [] objects = new Object[10];
        objects[0] = new Student();
        objects[1]= new Student();
        objects[2]= new Book();
    }


    static class Student{

    }

    static class Book{

    }
}
//So we need collection framework to overcome the limitations of an array
//Collections were introduced in java 1.2
