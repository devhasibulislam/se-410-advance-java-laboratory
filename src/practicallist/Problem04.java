/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallist;

/**
 * Write an application that illustrates how to access a hidden variable. Class
 * A declares a static variable x. The class B extends A and declares an
 * instance variable x, display() method in class B displays both of these
 * variables.
 *
 * @author hasib
 */
// Class A declares a static variable x
class A {

    static int x = 10;
}

// Class B extends A and declares an instance variable x
class B extends A {

    int x = 20;

    // Method to display both variables
    void display() {
        // Accessing the static variable x from class A
        System.out.println("Static variable x from Class A: " + A.x);

        // Accessing the instance variable x from class B
        System.out.println("Instance variable x from Class B: " + this.x);

        // To access the hidden static variable x from class B (Child)
        // you can use the super keyword to refer to the parent class A.
        System.out.println("Hidden Static variable x from Class A in Class B: " + super.x);
    }
}

// Main class to test the functionality
public class Problem04 {

    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

/**
 * Let's analyze the time and space complexity:
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
