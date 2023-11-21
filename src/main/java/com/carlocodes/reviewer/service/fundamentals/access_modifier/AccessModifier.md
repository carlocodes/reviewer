# Access Modifier

Access modifiers in Java determine the visibility and accessibility of
class members (variables, methods, and inner classes) from other classes.

There are four main access modifiers in Java:

1. **Default (Package-Private) Access (No Modifier):**
   - **Visibility:** Members with default access are visible only
   within the same package. They are not visible to classes in other
   packages.

**Example:**
```
// In a class within the same package
class MyClass {
    int myVariable; // Default access
}
```

2. **Public Access:**
   - **Visibility:** Members with public access are visible to all
   classes, both within and outside the package.

**Example:**
```
public class MyPublicClass {
    public int myVariable; // Public access
}
```

3. **Private Access:**
   - **Visibility:** Members with private access are visible only
   within the class in which they are declared. They are not accessible
   from any other class.

**Example:**
```
public class MyClass {
    private int myVariable; // Private access
}
```

4. **Protected Access:**
   - **Visibility:** Members with protected access are visible within
   the same package and can also be accessed by subclasses (regardless
   of whether they are in the same package or not).

**Example:**
```
package a;

public class Superclass {
    protected int protectedField; // Protected access
    
    protected void protectedMethod() {
        System.out.println("This is a protected method in Superclass.");
    }
}

package b;

public class SubClass extends Superclass {
    public void accessProtectedMember() {
        // Accessing the protected field from the superclass
        protectedField = 42;
        
        // Invoking the protected method from the superclass
        protectedMethod();
        
        System.out.println("Value of protectedField in Subclass: " +
        protectedField);
    }
}
```

These access modifiers provide control over the visibility and access
to class members, allowing you to implement encapsulation and control
the interaction between different parts of your code.

Here's a summary:

- Default access is the second most restrictive, limiting visibility
to the same package.
- Public access provides the widest visibility, allowing access from
anywhere.
- Private access is the most restrictive, limiting visibility to the
declaring class only.
- Protected access is a middle ground, allowing access within the same
package and to subclasses, promoting encapsulation while supporting
inheritance.
