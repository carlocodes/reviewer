# Function

Functions in Java are referred to as methods. They are blocks of code
that perform a specific task and can be called or invoked when needed.
Methods are a fundamental concept in Java and are used extensively in
Java programming.

**Syntax of a Java Method:**
Here's the basic syntax of a Java method:
```
accessModifier returnType methodName(parameters) {
    // Method body
    // Code to perform a specific task
    // Optionally, return a value using 'return'
}
```

Breaking down each part:

1. `'accessModifier'`: This defines the visibility or accessibility of
the method. Common access modifiers are `'public'`, `'private'`,
`'protected'`, and package-private (no modifier). They control where
the method can be accessed from.

2. `'returnType'`: It specifies the data type of the value that the
method will return. If the method doesn't return anything, you use the
`'void'` keyword.

3. `'methodName'`: This is the name of the method. It should be a
meaningful name that describes what the method does.

4. `'parameters'`: These are optional. You can pass values to a method
using parameters. Parameters are enclosed in parentheses, and multiple
parameters are separated by commas.

5. Method body: This is where you write the code to perform the desired
task.

6. `'return'`: If the method has a return type other than `'void'`, it
should return a value using the `'return'` statement.

Examples:

1. Simple method without parameters and return value:
```
public void greet() {
    System.out.println("Hello, World!");
}
```
In this example, the `'greet'` method doesn't take any parameters
and doesn't return anything. It simply prints a greeting message.

2. Method with parameters and return value:
```
public int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```
In this example, the `'add'` method takes two integer parameters and
returns their sum. You can call this method like this:
```
int result = add(5, 3);
System.out.println("Sum is: " + result) // Output: Sum is: 8
```

3. Method in a Class:
Methods are typically defined within classes. For example, you might
have a `'BankAccount'` class with methods like `'deposit'`, `'withdraw'`,
and `'getBalance'`.

4. Method Overloading:
You can define multiple methods with the same name but different
parameter lists. This is called method overloading. For example, you
can have `'calculateArea(int sideLength)'` and
`'calculateArea(double radius)'` methods in the same class.

You might use methods extensively to perform financial calculations,
validate transactions, and interact with databases. Methods help in
organizing and reusing code, making your Java applications more
maintainable and efficient.
