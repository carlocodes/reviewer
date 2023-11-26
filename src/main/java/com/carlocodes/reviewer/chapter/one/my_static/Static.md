# Static

In Java, the `'static'` keyword is used to create members (variables
and method) that belong to the class itself rather than to instances
(objects) of the class. When a member is declared as `'static'`, it
means there is only one instance of that member shared among all
instances of the class.

Here's what `'static'` means in different contexts:

1. **Static Variables (Class Variables):**
   - When a variable is declared as `'static'` within a class, it
   becomes a class variable.
   - Class variables are shared among all instances of the class.
   - They are associated with the class rather than with individual
   objects.
   - Class variables are typically used for data that should be
   common across all instances of the class, such as constants,
   counters, or configuration settings.

**Example:**
```
public class MyClass {
    static int classVariable = 42;
}
```

2. **Static Methods:**
   - When a method is declared as `'static'` within a class, it
   becomes a class method.
   - Class methods are associated with the class and can be called
   using the class name without creating an instance of the class.
   - They cannot access or modify instance-specific data because they
   don't have access to `'this'`.
   - Common use cases include utility methods that don't require
   access to instance-specific state.

**Example:**
```
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

3. **Static Blocks:**
   - Static blocks are used to initialize class variables or perform
   one-time setup for a class.
   - They are executed when the class is loaded into memory, before
   any instances are created or any static methods are called.
   - Static blocks are defined using the `'static'` keyword and
   enclosed in curly braces `'{}'`.

**Example:**
```
public class Configuration {
    static {
        // Perform one-time initialization here
        // e.g., loading configuration settings from a file
    }
}
```

In summary, the `'static'` keyword in Java is used to define members
(variables and methods) that are associated with the class itself
rather than with instances of the class. They are shared among all
instances of the class and can be accessed using the class name. This
makes them useful for situations where you want to maintain shared
data or utility methods that don't rely on instance-specific state.
