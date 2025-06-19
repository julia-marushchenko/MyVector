package com.vector;// Java program to demonstrate java Vector - like resizable ArrayList

import java.util.Vector;

// Main class to run java program
public class Main {

    // Java program to run java program
    public static void main(String[] args) {

        // Creating new vector
        Vector<Integer> vector = new Vector<>();

        // Adding elements to vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        // Printing vector to console
        System.out.println(vector);

        // Removing element from vector
        vector.remove(4);

        // Printing vector to console
        System.out.println(vector);

        // Printing vector size to console
        System.out.println("Vector size is: " + vector.capacity());

        // Delete all elements from vector
        vector.clear();

        // Printing empty vector to console
        System.out.println("Empty vector is like : " + vector);

    }
}