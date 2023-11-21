# Exceptions

In Java, exceptions are events that occur during the execution of a
program and disrupt the normal flow of code. They can occur for various
reasons, such as invalid input, unexpected system behavior, or runtime
error. Java provides a mechanism to handle these exceptions gracefully.

Types of Exceptions:

1. Checked Exceptions:
These are exceptions that must be either caught or declared in a method's
signature using the `'throws'` keyword. Common checked exceptions include
`'IOException'` and `'SQLException'`.

2. Unchecked Exceptions:
Also known as runtime exceptions, these exceptions don't need to be
explicitly caught or declared. They usually result from programming
errors and are subclasses of `'RuntimeException'`. Examples include
`'NullPointerException'` and `'ArrayIndexOutOfBoundsException'`.

3. Errors:
Errors represent critical issues that usually can't be handled
programmatically. They often indicate problems at the system leve, such
as running out of memory (OutOfMemoryError).

How to handle exceptions:
To handle exceptions in Java, you use the `'try-catch'` and
`'try-catch-finally'` blocks.
```
try {
    // Code that may cause an exception
} catch (ExceptionType1 e) {
    // Handle ExceptionType1
} catch (ExceptionType1 e) {
    // HandleExceptionType2
} finally {
    // Code that always executes (optional)
}
```

- The `'try'` block encloses the code that may throw an exception.
- The `'catch'` block catches a specific type of exception and provides
code to handle it.
- The `'finally'` block, if used, contains code that always executes,
whether an exception occurs or not. It's typically used for cleanup tasks
like maybe closing the sftp connection or ending a file read.

Examples of when exceptions occur and how to handle them:

1. ArithmeticException:
```
int result;
try {
    result = 10 / 0; // Division by zero
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero");
    result = 0; // Handle the error
}
System.out.println("Result: " + result);
```

2. NullPointerException:
```
String str = null;
try {
    int length = str.length(); // Attempt to access a method on a null reference
} catch (NullPointerException e) {
    System.out.println("Error: Null reference");
}
```

3. IOException:
```
try {
    FileReader file = new FileReader("nonexistent.txt") // Trying to read a non-existent file
} catch (IOException e) {
    System.out.println(Error: File not found");
}
```

4. Custom Exception:
You can also create custom exceptions by extending `'Exception'` or
`'RuntimeException'` classes to handle specific cases. For example:
```
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
    
    public void process() throws MyCustomException {
        // Custom logic that may throw MyCustomException
    }
}
```
You can catch and handle this custom exception like any other exception.

Use cases for exception handling:
- File I/O:
When reading or writing files, exceptions like `'FileNotFoundException'`
and `'IOException'` may occur due to various reasons, such as a missing
file or insufficient permissions.
- Database Operations:
When working with databases, exceptions like `'SQLException'` can occur
due to connection problems, query errors, or data integrity issues.
- Input Validation:
While processing user input, exceptions can be used to catch anc handle
invalid data, preventing crashes and providing user-friendly error
messages.
- Networking:
Exception handling is crucial when dealing with network communication,
as various issues like timeouts or connection errors may occur.
- Resource Management:
When managing resources like database connections, sockets, or file
handles, it's essential to handle exceptions to ensure proper cleanup
and prevent resource leaks.
- API Integration: When integrating with external APIs, handling
exceptions gracefully ensures your application can recover from network
failures or API errors.

Exception handling is a critical aspect of robust Java programming. It
helps your application handle errors gracefully and ensures that it
continues to function even when unexpected issues arise. Proper exception
handling can improve the overall reliability and user experience of your
Java application.
