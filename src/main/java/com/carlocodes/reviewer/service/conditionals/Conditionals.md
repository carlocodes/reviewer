# Conditionals

Conditional statements in Java are constructs that
allow you to make decisions in your code based on
certain conditions. They help your program branch into
different paths and execute specific code blocks
depending on whether the conditions are met or not.

Here are the conditional statements we have in Java:

1. `'if'` statement:
The `'if'` statement is the most basic conditional in
Java. It checks a condition and executes a block of
code if the condition is true. If the condition is
false, the code block is skipped.
```
int age = 28;
if (age >= 18) {
    System.our.println("You are an adult!");
}
```
Use case:
- Validating user-input, e.g., checking if an entered
age is greater than or equal to 18 to determine if the
user is an adult.

2. `'else if'` statement:
The `'else if'` statement allows you to check multiple
conditions in a sequence. It is used when you have
multiple conditions to evaluate, and you want to
execute the code block associated with the first true
condition.
```
int score = 75;
if (score >= 90) {
    System.out.println("A Grade");
} else if (score >= 80) {
    System.out.println("B Grade");
} else if (score >= 70) {
    System.out.println("C Grade");
} else {
    System.out.println("Fail");
}
```
Use case:
- Grading students based on their exam scores in a
hierarchical manner.

3. `'else'` statement:
The `'else'` statement is used as a catch-all for
conditions that weren't met by the `'if'` or `'else if'`
statements. If none of the preceding conditions are
true, the code block associated with the `'else'`
statement is executed.
```
int temperature = 28;
if (temperature > 30) {
    System.out.println("It's hot outside.");
} else {
    System.out.println("It's cold outside.");
}
```
Use case:
- Providing a default action when no specific conditions
are met.

4. `'switch'` statement:
The `'switch'` statement is used when you have multiple
values to compare against a single expression. It's
particularly useful when you want to test a single value
against a set of possible constant values.
```
int day = 3;
String dayName;
switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
    default:
        dayName = "Unknown";
        break;
}
System.out.println("Today is " + dayName);
```
Use case:
- Converting numerical values into corresponding textual
representations (e.g. days of the week).

5. Ternary Operator:
The ternary operator, also known as the conditional
operator or the shorthand if-else, is a concise way
to express a simple conditional. It allows you to
assign a value to a variable based on a condition.
```
int age = 20;
String message = (age >= 18)
    ? "You are an adult."
    : "You are not an adult.";

System.out.println(message);
```
Use case:
- Setting a variable to one of two values based on a
condition, typically used for simple one-liner
assignments.

While `'if'`, `'else if'`, and `'else'` statements
are versatile and suitable for most conditional logic
needs, `'switch'` statements are more efficient when
you have multiple options for a single value. Ternary
operators are handy for compact conditional assignments
and are often used when you need to set a variable's
value based on a simple condition.