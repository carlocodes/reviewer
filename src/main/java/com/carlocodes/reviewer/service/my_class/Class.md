# Class

In Java, a class is a fundamental concept and a blueprint for
creating objects. It defines the properties (attributes) and
behaviors (methods) that objects of that class will have.
Classes are a fundamental part of object-oriented programming
(OOP) and are used to model real-world entities or concepts
in a software program.

Here's a breakdown of what a class consists of in Java:

1. **Class Declaration:** To declare a class in Java, you use
the `'class'` keyword followed by the class name. The class
name should start with an uppercase letter, and by convention,
it should use CamelCase naming, e.g. `'MyClass'`.
```
public class MyClass {
    // Class members go here
}
```
2. **Fields/Attributes/Properties:** Inside a class, you can
define fields, which represent the attributes or properties
of objects created from that class. These fields store data
related to the class.
```
public class Person {
    String name;
    int age;
}
```
3. **Constructors:** Constructors are special methods in a
class used to initialize objects when they are created. They
have the same name as the class and are responsible for
setting initial values for the object's fields.
```
public class Person {
    String name;
    int age;
    
    // Constructor
    public Person(String n, int a) {
        name = n;
        age = a;
    }
}
```
4. **Methods/Functions:** Methods are functions defined
within a class that perform a specific task or operations
related to the class. They define the behavior of the objects
created from the class.
```
public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}
```
5. **Access Modifiers:** Java uses access modifiers like
`'public'`, `'private'`, and `'protected'` to control the
visibility of class members. For example `'public'` members
can be accessed from outside the class, while `'private'`
members are only accessible within the class.
```
public class MyClass {
    public int publicField;
    private int privateField;
}
```
6. **Object Creation:** To use a class and its members, you
need to create objects (instances) of tha class using the
`'new'` keyword.
```
MyClass obj = new MyClass();
```
7. **Inheritance:** Java supports inheritance, which allows
you to create new classes based on existing classes. This
promotes code reuse and hierarchical organization of classes.
```
public class ChildClass extends ParentClass {
    // Additional members and methods
}
```

Classes provide a way to structure your code and create
reusable components in Java. They are essential for building
complex software systems and implementing object-oriented
design principles like encapsulation, inheritance, and
polymorphism.
