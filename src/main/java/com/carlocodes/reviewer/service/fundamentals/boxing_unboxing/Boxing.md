# Boxing

Boxing in Java refers to the process of converting a primitive data type
into its corresponding wrapper class object. This conversion allows you
to treat primitive values as objects, enabling you to use them in
situations where objects are required. Boxing is a feature introduced
in Java to bridge the gap between primitive data types and reference
data types (objects).

Here's how boxing works:

1. **Primitive to Wrapper Conversion:** When you assign a primitive
value to a reference variable of the corresponding wrapper class, Java
automatically boxes the primitive value by creating an object of the
wrapper class and storing the primitive value inside it.
```
int primitiveInt = 42;
Integer boxedInt = primitiveInt; // Boxing: int to Integer
```
In this example, `'primitiveInt'` is an `'int'`, and '`boxedInt'` is
an `'Integer'`. The assignment of `'primitiveInt'` to `'boxedInt'`
results in boxing, where `'primitiveInt'` is wrapped in an `'Integer'`
object.

2. **Auto-Boxing:** Java provides auto-boxing, which is a convenient
feature where the boxing process is done automatically by the compiler.
You don;t need to explicitly create wrapper objects; Java does it for
you when necessary.
```
int x = 10;
Integer y = x; // Auto-boxing: int to Integer
```
In this example, the assignment of `'x'` to `'y'` triggers auto-boxing,
and `'x'` is automatically wrapped in an `'Integer'` object.

Boxing is often used when you need to work with collections (like
ArrayList or HashMap) that store objects rather than primitives. It
also enables you to take advantage of the additional methods and
capabilities provided by wrapper classes for primitive data types.

However, it's important to be aware of the potential overhead associated
with boxing, as it involves creation of objects and can impact memory
usage and performance. In situations where performance is critical,
you may need to consider the trade-offs between using primitive data
types and their wrapper classes.
