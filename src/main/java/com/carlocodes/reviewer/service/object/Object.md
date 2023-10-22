# Object

In Java, an object is a fundamental concept that represents
a real-world entity or concept in your software. Objects are
instances of classes, and they are used to interact with
and manipulate data and perform operations in an object-
oriented program.

Here are the key points to understand  about objects in Java:

1. **Instance of Classes:** Objects are created from classes.
A class serves as a blueprint or template for creating objects.
When you create an object, you are creating an instance of
that class.
```
// Creating an object (instanec) of the Person class
Person person1 = new Person("Alice", 30);
```
2. **Properties (Fields):** Objects have properties, also
known as fields or attributes. These properties represent
the data associated with the object. You can access and
modify these properties using dot notation.
```
// Accessing object properties
String name = person1.name;
int age = person1.age;

// Modifying object properties
person1.age = 31;
```
3. **Behaviors (Methods):** Objects have behaviors, which
are defined by methods in the class. Methods represent the
actions or operations that objects of the class can perform.
You invoke methods on objects to perform specific tasks.
```
// Invoking a method on an object
int result = calculator.add(5, 3);
```
4. **Identity:** Each object has a unique identity. Even
if two objects have the same data (property values), they
are distinct objects with different identities.
```
Person person2 = new Person("Bob", 35);
boolean areEqual = (person1 == person2);
// false, because they are different objects
```
5. **Object Creation:** To create an object in Java, you
use the `'new'` keyword followed by the class constructor.
The constructor initializes the object's properties and sets
its initial state.
```
// Creating an object of the Calculator class
Calculator calculator = new Calculator();
```

6. **Reference Variables:** Objects are typically referred to
using reference variables. These variables store the memory
address where the object is located, rather than the object's
actual data. You can have multiple reference variables
referring to the same object.
```
Person person3 = person1;
// Both person3 and person1 refer to the same object
```

7. **Garbage Collection:** Java automatically manages the
memory used by objects. When there are no references to an
object, it becomes eligible for garbage collection, and the
memory it occupies is reclaimed by the Java Virtual Machine.
```
person1 = null; // Removing the reference to the object
// At some point, the object may be garbage collected
```

Objects are a fundamental building block of Java programs and
enable you to model complex systems by encapsulating data and
behavior within classes. They play a crucial role in achieving
the principles of object-oriented programming, such as
encapsulation, inheritance, and polymorphism.
