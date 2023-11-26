# Unboxing

Unboxing in Java refers to the process of extracting the primitive
value from a wrapper class object. This allows you to work with the
primitive value as if it were a standalone primitive data type. Java
provides automatic unboxing, which means that in many cases, you can
use a wrapper object in a context where a primitive value is expected,
and the conversion from the object to the primitive type happens
automatically by the Java compiler.

Here's a more detailed explanation along with examples and use cases
for unboxing:

Example:
```
// Autoboxing: Converting int to Integer
Integer wrapperInt = 42;

// Unboxing: Converting Integer to int
int primitiveInt = wrapperInt;
```

In this example, we start with an `'Integer'` wrapper object
(`'wrapperInt'`) and unbox it by assigning it to an `'int'` variable
(`'primitiveInt'`). This unboxing operation extracts the underlying
`'int'` value from the wrapper object.

**Use cases for Unboxing:**

1. **Collections and Generics:** Unboxing is commonly used when working
with collections, as Java collections like `'ArrayList'` and
`'LinkedList'` store objects. Automatic unboxing simplifies the process
of retrieving primitive values from collections.
```
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);

// Unboxing elements when retrieving from the list
int firstNumber = numbers.get(0);
```

2. **Mathematical Calculations:** Unboxing is useful when performing
mathematical calculations that involve primitive types. You can unbox
wrapper objects to work with the primitive values directly.
```
Integer a = 5;
Integer b = 3;

// Unboxing for addition
int sum = a + b;
```

3. **Comparisons and Conditional Statements:** Unboxing allows you to
compare wrapper objects using standard operators.
```
// Unboxing for comparison
if (x > y) {
    // ...
}
```

4. **Legacy Code and APIs:** In older code or when working with APIs
that use primitive types, you may encounter situations where you need
to unbox wrapper objects to interact with such code.
```
void legacyMethod(int value) {
    // ...
}

Integer wrapperValue = 42;

// Unboxing to call the legacy method
legacyMethod(wrapperValue);
```
