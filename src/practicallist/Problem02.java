/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallist;

/**
 * Write a program in Java to develop overloaded constructor. Also develop the
 * copy constructor to create a new object with the state of the existing
 * object.
 *
 * @author hasib
 */
public class Problem02 {

    private int value;

    // Default constructor
    public Problem02() {
        this.value = 0;
    }

    // Overloaded constructor with one parameter
    public Problem02(int value) {
        this.value = value;
    }

    // Copy constructor
    public Problem02(Problem02 original) {
        this.value = original.value;
    }

    // Getter method for the 'value' field
    public int getValue() {
        return value;
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Using default constructor
        Problem02 obj1 = new Problem02();
        System.out.println("Default Constructor: " + obj1.getValue());

        // Using overloaded constructor
        Problem02 obj2 = new Problem02(42);
        System.out.println("Overloaded Constructor: " + obj2.getValue());

        // Using copy constructor
        Problem02 obj3 = new Problem02(obj2);
        System.out.println("Copy Constructor: " + obj3.getValue());
    }
}

/**
 * Let's analyze the time and space complexity:
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
