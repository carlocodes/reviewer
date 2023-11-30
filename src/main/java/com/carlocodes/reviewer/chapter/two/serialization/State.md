# State of an Object

In Java, the "state" of an object refers to the values of its attributes (also known as fields
or properties) at a particular point in time. An object's state is defined by the data stored
in its fields, and it represents the characteristics or properties that describe the object.
The behavior of an object is determined by its methods, and these methods often operate on or
manipulate the object's state.

Here's a brief breakdown:

1. Attributes/Fields:
- These are the variables or data members within a class that define the object's properties.
For example, if you have a `'Person'` class, attributes could include `'name'`, `'age'`, and
`'address'`.

Example:
```
public class Perso {
    private String name;
    private int age;
    private String address;
}
```

2. State:
- The state of the object is the set of values of its attributes at a specific point in time.
For instance, if you create an instance of the `'Person'` class:

Example:
```
Person person = new Person();
person.setName("Gian");
person.setAge(25);
person.setAddress("Philippines);
```
The state of `'person'` at this point is "name=Gian, age=25, address=Philippines".

3. Methods:
- Methods in a class define the behavior of the object. They can perform operations, manipulate
the object's state, or provide information about the object.

Example:
```
public class Person {
    // Fields
    
    public void celebrateBirthday() {
        age++
    }
    
    // Other methods
}
```
The `'celebrateBirthday'` method, for example, modifies the state of the `'Person'` object by
incrementing the `'age'` attribute/field.

4. Encapsulation:
- In Java, the concept of encapsulation helps in controlling access to the state of an object.
By using access modifiers like `'private'`, you can restrict direct access to object's fields,
and provide methods (getters and setters) to interact with the object's state.

Example:
```
public class Person {
    private String name;
    private int age;
    private String address;
    
    // constructor, getters, setters, methods, etc
}
```

Understanding and managing the state of objects is crucial in object-oriented programming, as
it allows you to model and manipulate real-world entities effectively. It also contributes to
the principles of encapsulation and helps in creating modular and maintainable code.
