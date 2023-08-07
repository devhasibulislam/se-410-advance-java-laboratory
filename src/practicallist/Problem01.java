/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicallist;

/**
 * Write a program in Java to demonstrate single inheritance, multilevel
 * inheritance & hierarchical inheritance.
 *
 * @author hasib
 */
// Parent class for Single Inheritance
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal for Single Inheritance
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

// Parent class for Multilevel Inheritance
class Bird extends Animal {

    void sound() {
        System.out.println("Bird chirps");
    }
}

// Child class inheriting from Bird for Multilevel Inheritance
class Parrot extends Bird {

    void sound() {
        System.out.println("Parrot talks");
    }
}

// Parent class for Hierarchical Inheritance
class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class inheriting from Animal for Hierarchical Inheritance
class Lion extends Animal {

    void sound() {
        System.out.println("Lion roars");
    }
}

public class Problem01 {

    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.sound();

        // Multilevel Inheritance
        Parrot parrot = new Parrot();
        parrot.sound();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.sound();

        Lion lion = new Lion();
        lion.sound();
    }
}

/**
 * Let's analyze the time and space complexity:
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
