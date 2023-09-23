# Syntax

In Java, "syntax" refers to the set of rules and conventions
that dictate how Java source code should be structured. These
rules govern how you write statements, declare variables,
define classes and methods, and perform various other tasks
within the Java programming language. Adhering to proper
syntax is crucial because it ensures that your Java code is
understandable by the Java compiler, which is responsible for
translating your code into executable bytecode.

Here are some key aspects of the Java syntax:

1. **Case Sensitvity:** Java is case-sensitive, which means
that uppercase and lowercase letters are distinct. For example,
`variableName` and `variablename` are considered to be
different identifiers.
2. **Semicolons:** Java statements typically end with a
semicolon `';'`. Failing to include semicolons in the
appropriate places will result in syntax errors.
```
int x = 10; // Correct
int y = 20  // Incorrect, missing semicolon
```
3. **Braces (Curly Brackets):**: Java uses braces `'{}'` to
define blocks of code, such as class bodies, method bodies,
loops, and conditional statements. Properly nested and
balanced braces are essential for defining code blocks
correctly.
```
// Example of a method with braces
public void my Method() {
    // Code block
}
```
4. **Keywords and Reserved Words:** Java has a set of
reserved words, often referred to as keywords, that have
special meanings and cannot be used as identifiers for
variables, classes, or methods. Examples of keywords include
`'public'`, `'class'`, `'int'`, `'if'`, `'else'`, and many
others.
5. **Comments:** Java supports both single-line comments
using `'//'` and multi-line comments using `'/* */'`. Comments
are ignored by the compiler and are used for documentation and
explanatory purposes.
```
// This is a single-line comment

/*
    This is a multi-line comment
*/
```
6. **Indentation:** While not strictly enforced by the
compiler, proper indentation is essential for code readability.
It helps you and others understand the structure of your code.
```
public void exampleMethod() {
    if (condition) {
        // Proper indentation
        statement1;
        statement2;
    } else {
        // Proper indentation
        statement3;
        statement4;
    }
```
7. **Whitespace:** Java allows the use of spaces, tabs, and
line breaks to format your code for readability. Excessive or
inconsistent use of whitespace can affect code clarity.
8. **Naming Conventions:** Java has naming conventions for
variables, methods, and classes. It's common to use CamelCase
for class names `('MyClass')`, lowercase with underscores for
variables `(my_variable)`, and CamelCase or lowercase with
underscored for methods `('myMethod')` or `('my_method')`.

Understanding and following Java syntax rules is crucial for
writing error-free and maintainable code. It ensures that your
code can be compiled and executed as intended and makes it
easier for you and other developers to work with your code.
