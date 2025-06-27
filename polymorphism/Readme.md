In Java, method overloading and method overriding are two important concepts related to polymorphism. Here's a detailed explanation with examples:

✅ Method Overloading (Compile-Time Polymorphism)
Definition: Method overloading occurs within the same class when multiple methods have the same name but different parameters (type, number, or order).

Key Points:

Happens at compile time.

Methods must have different parameter lists.

Return type can be different, but is not sufficient alone to overload.

Example:

java
Copy
Edit
class Calculator {
    // Method with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));         // Outputs 15
        System.out.println(calc.add(5, 10, 15));     // Outputs 30
        System.out.println(calc.add(2.5, 3.5));      // Outputs 6.0
    }
}
✅ Method Overriding (Run-Time Polymorphism)
Definition: Method overriding happens when a subclass provides a specific implementation of a method that is already defined in its superclass.

Key Points:

Happens at runtime.

Method name, return type, and parameters must be exactly the same.

The method in the superclass must be inheritable (not private, not static, and not final).

Use @Override annotation for clarity.

Example:

java
Copy
Edit
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        a.sound();              // Outputs "Dog barks"
    }
}
🔁 Difference Table
Feature	Overloading	Overriding
Class Relationship	Same class	Parent-child (inheritance)
Parameters	Must be different	Must be same
Return Type	Can be different	Must be same or subtype
Access Modifier	Can be any	Cannot reduce visibility
Static Allowed?	Yes (can overload static methods)	No (cannot override static methods)
Binding Time	Compile-time	Run-time