# Data Type

Data types in Java are a fundamental concept that specifies the type of
data a variable can hold. They define the size, format, and range of
values that can be stored in a variable. Java supports two categories
of data types: primitive data types and reference data types.

**Primitive Data Types:**
Java has eight primitive data types. These are the building blocks for
data manipulation in the language. They are called "primitive" because
they represent simple values.

1. **byte:**
   - **Size:** 8 bits (1 byte)
   - **Range:** -128 to 127
   - **Sample use case:** Storing small integers, such as age or
   byte-sized data from a file.
```
byte myAge = 20;
```

2. **short:**
   - **Size:** 16 bits (2 bytes)
   - **Range:** -32,768 to 32,767
   - **Sample use case:** Handling small-to-medium-sized integers in
   applications like video games.
```
short temperature = -200
```

3. **int:**
   - **Size:** 32 bits (4 bytes)
   - **Range:** -2^31 to 2^31-1
   - **Sample use case:** Storing whole numbers, like quantities,
   counts, or indices.
```
int population = 1500000;
```

4. **long:**
   - **Size:** 64 bits (8 bytes)
   - **Range:** -2^63 to 2^63-1
   - **Sample use case:** Handling large integers, such as timestamps
   or very large numbers.
```
long bigNumber = 123456789012345L;
```

5. **float:**
   - **Size:** 32 bits (8 bytes)
   - **Sample use case:** Storing decimal numbers with single
   precision, like scientific measurements.
```
float pi = 3.14159265359f;
```

6. **double:**
   - **Size:** 64 bits (8 bytes)
   - **Sample use case:** Handling decimal numbers with double
   precision, like financial calculations.
```
double bankBalance = 12345.67;
```

7. **char:**
   - **Size:** 16 bits (2 bytes)
   - Represents a single Unicode character.
   - **Sample use case:** Storing individual characters, like letters
   or symbols.
```
char grade = 'A';
```

8. **boolean:**
   - Represents true or false values;
   - **Sample use case:** Storing conditions or flags, like whether
   a user is logged in or not.
```
boolean isJavaFun = true;
```

**Reference Data Types:**
Reference data types are used to create objects and work with them.
They are more complex than primitive data types and hold references
(memory addresses) to objects in memory.

Common reference data types include:

1. **Classes:**
   - User-defined data types created using the `'class'` keyword.
   - **Sample use case:** Defining custom data structures, like a
   `'Person'` class to store personal information.
```
class Person {
   String name;
   int age;
}
```

2. **Interfaces:**
   - Similar to classes but with abstract methods.
   - **Sample use case:** Creating interfaces to define contracts
   for implementing classes.
```
interface Printable {
   void print();
}
```

3. **Arrays:**
   - Ordered collections of elements of the same type.
   - **Sample use case:** Storing lists of data, like an array of
   numbers or strings.
```
int[] numbers = {1, 2, 3, 4, 5};
```

4. **Enumerations (Enums):**
   - Special data types for defining a set of named constants.
   - **Sample use case:** Representing a limited set of options, like
   days of the week.
```
enum Day {
   SUNDAY,
   MONDAY,
   TUESDAY,
   WEDNESDAY,
   THURSDAY,
   FRIDAY,
   SATURDAY
}
```

5. **Other Reference Types:**
   - Java allows you to create custom reference data types using
   classes and interfaces you define.

These data types, both primitive and reference, enable Java
programmers to work with various types of data efficiently and
accurately. Choosing the right data type is essential for optimizing
memory usage and ensuring the data is correctly represented and
processed in Java applications.
