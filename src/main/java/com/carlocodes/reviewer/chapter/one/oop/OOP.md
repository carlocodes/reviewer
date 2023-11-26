# Object-Oriented Programming

Object-Oriented Programming is a programming paradigm that revolves around
the concept of objects. Objects are instances of classes, and classes define
the structure and behavior of those objects. OOP is widely used in Java and
many other programming languages. In Java, OOP is a fundamental part of the
language's design.

The four main pillars of OOP are:

1. **Encapsulation:**
Encapsulation is the practice of bundling data (attributes) and methods
(functions) that operate on that data into a single unit known as a class. It
provides data hiding, meaning that the internal details of an object are
hidden from the outside world. Only the class's methods can access and modify
its internal state.

Example:
```
public class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        // Encapsulated method to modify the balance
        balance += amount;
    }
    
    public double getBalance() {
        // Encapsulated method to retrieve the balance
        return balance;
    }
}
```

Use case:
- Encapsulation ensures that the balance of a bank account can only be
modified through controlled methods, preventing unauthorized changes.

2. **Inheritance:**
Inheritance allows a class to inherit properties and behaviors from another class. The class that
is being inherited from is called the superclass or base class, and the class inheriting from it
is the subclass or derived class. In Java, you use the `'extends'` keyword to establish
inheritance.

Example:
```
public class Shape {
    public void draw() {
        // Common draw method for all shapes
    }
}

public class Circle extends Shape {
    public void draw() {
        // Override the draw method for a specific shape
        // Additional code to draw a circle
    }
}
```

Use case:
- Inheritance allows you to create a hierarchy of related classes, reusing and extending code.
In that case, you can have various shapes like circles, squares, etc., with a common `'draw'`
method.

3. **Polymorphism:**
Polymorphism means that objects of different classes can be treated as objects of a common
superclass. In Java, polymorphism is achieved through method overriding and interfaces. It
allows you to write code that works with objects of various subclasses without needing to know
their specific types.

Example:
```
public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
```

Use case:
- Polymorphism allows you to work with a collection of different animals as if they were all
the same type, making code more flexible and extensible.

4. **Abstraction:**
Abstraction is the process of simplifying complex reality by modeling classes based on
real-world entities. It focuses on the essential properties and behaviors of an object while
hiding the unnecessary details.

Example:
```
public abstract class Shape {
    public abstract double area();
}

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}
```

Use case:
- Abstraction allows you to create a common interface (the `'area'` method in this case) for
various shapes without worrying about their specific implementations.

In Java, these pillars of OOP are fundamental for building complex and maintainable software
systems. They provide a structured and modular approach to programming, making code more
organized, reusable, and easier to understand and maintain.
