# Lambda Expressions

Lambda expressions, introduced in Java 8, provide a concise way to express instances of
single-method interfaces (functional interfaces). They allow you to treat functionality as a
method argument, or to create a concise way to represent instances of single-method interfaces.

### Anatomy of a Lambda Expression:

A lambda expression has three main parts:

1. Parameters:
Like methods, lambda expressions can have parameters.

2. Arrow Operator (`'->'`):
It separates the parameter list from the body of the lambda expression.

3. Body:
Contains the actual code or expression that represents the functionality of the lambda.

Here's the general syntax:
```
(parameters) -> expression
```
or
```
(parameters) -> { statements; }
```

### Example:

Let's look at a simple example to illustrate the basic structure of a lambda expression.
Suppose you have a functional interface `'Calculator'` with a single method `'calculate'`:
```
@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}
```
Now you can create a lambda expression to represent an instance of this interface:
```
Calculator add = (a, b) -> a + b;
```
Here, `'(a, b) -> a + b'` is a lambda expression. It takes two parameters (`'a'` and `'b'`),
adds them together, and returns a result.

### When to use Lambda Expressions:

1. Functional Interfaces:
- Lambda Expressions are most commonly used when working with functional interfaces, which
have a single abstract method.
- They allow you to provide a more concise and expressive implementation of that single
method.

2. Collections and Streams:
- Lambda expressions are widely used when working with collections and streams in Java.
- They provide a concise syntax for operations such as filtering, mapping, and reducing.

### Use Cases:

1. With Collections:
```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Use Lambda Expression for forEach
names.forEach(name -> System.out.println("Hello, " + name));
```

2. With Streams:
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using Lambda Expression for filtering and printing
numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
```

3. With Runnable Interface:
```
// Using Lambda Expression for Runnable
Runnable myRunnable = () -> System.out.println("Hello, Lambda!");
```

### Benefits of Lambda Expressions:

1. Conciseness:
Lambda Expressions allow you to write more concise code, especially when dealing with
single-method interfaces.

2. Readability:
They enhance code readability by reducing boilerplate code.

3. Flexibility:
Lambda expressions make it easier to express instances of functional interfaces without the
need for explicit class declarations.

### Conclusion:

Lambda expressions are a powerful feature introduced in Java 8, enabling a more functional
and expressive style of programming. They are particularly useful in scenarios involving
functional interfaces, collections, and streams. As you become more familiar with lambda
expressions, you'll find them to be a valuable tool for writing, clean, concise, and
readable code in Java.
