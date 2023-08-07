package practicallist;
/**
 * What is package?
 * Group of classes & interfaces used for organizing and managing code.
 * Types of package:
 * 1. Built-in
 * 2. User defined
 */

interface Shape {
    void draw();
}
/**
 * What is Interface
 * A blueprint for class that define methods without defining implementation
 */

class Circle implements Shape {
    public void draw(){
        System.out.println("Drawing a 300x300 PX Circle");
    }
}
/**
 * What is abstraction?
 * Handling implementation details using interface
 */

abstract class Figure{
    abstract void draw();
}

class Rectangle extends Figure {
    void draw(){
        System.out.println("Drawing a 300x3000 PX Rectangle");
    }
}
/**
 * What is abstract class
 * Incomplete class with one or more abstract methods
 * What is Extends keyword?
 * Creating a subclass that inherit from superclass
 */

class Triangle extends Figure {
    void draw() {
        System.out.println("Drawing a 400x400 PX Triangle");
    }
}
/**
 * What is Inheritance
 * Subclass acquire or inherit properties & behavior from Superclass
 */

class Sadia {
    /**
     * What is class declaration?
     * Defines a new class structure
     */
    
    private double height;
    private int weight;
    private String color;
    static int id;
    /**
     * What is instance variable?
     * Non-Static variable defined in a class
     * What is static keyword?
     * Shared class variables & methods
     */
    
    public Sadia(double height, int weight, String color) throws IllegalArgumentException {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive.");
        }
        
        this.height = height;
        this.weight = weight;
        this.color = color;
        /**
         * What is this keyword?
         * Refer the current instance of the class
         * What is constructor in java
         * Special method initialize object during creation
         */
    }
    
    public Sadia(double height, int weight) throws IllegalArgumentException {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Height and weight must be positive.");
        }
        
        this.height = height;
        this.weight = weight;
        this.color = "Beige";
    }
    /**
     * What is constructor overloading?
     * Constructors with same name but different parameters
     * Definition of Throws & Throw
     * Throws: Declare exceptions
     * Throw: Raise an exception
     */
    
    public void getSadiaWithInformation() {
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
    /**
     * What is method?
     * Inside a class that perform tasks
     * What is object?
     * An instance of a class that represent entity
     */
    
    public int sadiaDoingAddition (int x, int y){
        return x + y;
    }
    
    public int sadiaDoingAddition (int x, int y, int z){
        return x + y + z;
    }
    /**
     * What is method overloading?
     * Methods with same name but different parameters
    */
    
    public static int sadiaWithCampusID(){
        id = 1935202001;
        return id;
    }
    /**
     * What is static method?
     * Belong to the class itself
     */
}

public class PracticalList {
    /**
     * What is class?
     * Blueprint for creating objects with properties & behavior
     */

    public static void main(String[] args) {
        try {
            String msg = "Hello World!";
            System.out.println(msg);
            /**
             * Built-in Class
             * Which included in Java library
             */

            Thread thread1 = new Thread(() -> {
                Sadia sadia = new Sadia(5.4, 54, "Alabaster");
                sadia.getSadiaWithInformation();
            });
            
            Thread thread2 = new Thread(() -> {
                Sadia sadia = new Sadia(5.4, 54, "Honey");
                sadia.getSadiaWithInformation();
            });
            
            thread1.start();
            thread2.start();
            
            thread1.join();
            thread2.join();
            /**
             * What is Multi-threading?
             * Parallel execution of tasks of a program
             */
            
            Sadia sadia = new Sadia(5.4, 54, "Carotenoid");
            sadia.getSadiaWithInformation();
            /**
             * What is object declaration
             * Creating an instance of class
             */

            // Method overloading
            System.out.println("Additin Result: " + sadia.sadiaDoingAddition(5, 3));
            System.out.println("Additin Result: " + sadia.sadiaDoingAddition(5, 3, 2));

            // Constractor overloading
            Sadia dhira = new Sadia(5.4, 54);
            dhira.getSadiaWithInformation();

            // Static keyword & method
            System.out.println("Campus ID: " + Sadia.sadiaWithCampusID());

            // Abstraction
            Shape shape = new Circle();
            shape.draw();

            // Abstract class
            Figure rectangle = new Rectangle();
            rectangle.draw();

            // Inhertance
            Figure triangle = new Triangle();
            triangle.draw();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Mid Suggestion Execution completed.");
        }
    }
}
