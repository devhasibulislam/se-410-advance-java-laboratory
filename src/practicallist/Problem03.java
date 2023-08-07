/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallist;

/**
 * Write a program in Java to demonstrate use of this keyword. Check whether this can access the private members of the class or not.
 * 
 * @author hasib
 */
public class Problem03 {

    private int privateVariable;

    // Constructor to initialize privateVariable
    public Problem03(int value) {
        this.privateVariable = value;
    }

    // Method to display the privateVariable
    public void display() {
        System.out.println("Value of privateVariable: " + this.privateVariable);
    }

    public static void main(String[] args) {
        // Creating an instance of the Problem03 class
        Problem03 obj = new Problem03(42);

        // Calling the display method to show the privateVariable value
        obj.display();
    }
}

/**
 * Let's analyze the time and space complexity:
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
