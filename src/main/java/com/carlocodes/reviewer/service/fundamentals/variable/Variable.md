# Variable

In Java, a variable is a named container that holds
a value or a reference to an object. Variables are a
fundamental concept in programming and are used to
store and manipulate data within a Java program.

Here are some key points about variables in Java:

1. **Declaration:** Before you can use a variable,
you need to declare it by specifying its data type
and name. For example:
```
int age;
// Declaration of an integer variable named "age"
```
2. **Initialization:** You can optionally initialize
a variable at the time of declaration by assigning
it a value. If you don't initialize it, the variable
will have a default value (for example, 0 for numeric
types or `'null'` for reference types).
```
int age = 30; // Initialization with a value
```
3. **Data Types:** Java has different data types for
variables, including primitive data types (like
`'int'`, `'double'`, and `'boolean'`) and reference
data types (like objects and arrays).
4. **Naming Rules:** Variable names in java must
follow certain rules:
   - They must start with a letter, underscore (_), or
   dollar sign ($).
   - After the first character, they can contain
   letters, digits, underscores, or dollar signs.
   - Variable names are case-sensitive, meaning
   "age" and "Age" are considered different variables.
5. **Scope:** Variables have a scope, which defines
where in the code they can be accessed. Local
variables are declared within a specific code block
and are only accessible within that block. Instance
variables (also known as member variables) belong to
an object and are accessible from all methods within
that object. Class variables (also known as static
variables) are shared among all instances of a class.
6. **Final Variables:** You can declare a variable as
`'final'` to indicate that its value cannot be changed
once it's initialized. This is often used for
constants.
```
    final double PI = 3.14159; // A final constant
```
7. **Variable Assignment:** You can assign new values
to variables after they have been declared and
initialized. This allows you to update and manipulate
data during the execution of your program.
```
age = 31;
// Assigning a new value to the "age" variable"
```

Here's a simple example that demonstrates the use
of variables in Java:
```
public class VariablesExample {
    public static void main(String[] args) {
        int x = 5;
        // Declaration and initialization 
        // of an integer variable
        double pi = 3.14159;
        // Declaration and initialization
        // of a double variable
        
        System.out.println("x = " + x);
        System.out.println("pi = " + pi);
        
        x = x + 1;
        // Modifying the value of the "x" variable
        System.out.println("Updated x = " + x);
    }
}
```
In this example, we declare and initialize variables,
print their values, and update the value of the "x"
variable. This demonstrates the basic concepts of
variables in Java.
