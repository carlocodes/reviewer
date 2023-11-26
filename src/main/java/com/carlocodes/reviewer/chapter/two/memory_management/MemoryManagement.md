# Memory Management

Memory management in Java is a crucial aspect of the language that is primarily handled by the
Java Virtual Machine (JVM). The JVM is responsible for allocating and deallocating memory during
the execution of a Java program.

1. Java Heap:
- The Java Heap is the region of memory where objects and their instance variables are stored. It
  is the runtime data area from which memory for all class instances and arrays are allocated.
- Objects are created on the heap using the `'new'`keyword.

Example:
```
MyClass obj = new MyClass();
```
- Java uses a garbage collector to automatically identify and reclaim memory occupied by
  objects that are no longer in use.

2. Stack Memory:
- Stack memory is used for the execution of thread-specific operations, such as method calls
  and local variable storage.
- Each thread gets its own stack, and method calls create stack frames containing local
  variables and control flow data.
- Stack memory is automatically reclaimed when a method call is completed.

3. Garbage Collection:
- Garbage collection is the process by which JVM identifies and removes objects that are no
  longer reachable, freeing up memory.

Example:
```
MyClass obj = new MyClass();
obj = null; // Making the object eligible for garbage collection.
// The garbage collector will eventually reclaim the memory occupied by 'obj'
```
- Prevents memory leaks by automatically managing lifecycle of objects.

4. Memory Leaks:
- A memory leak occurs when objects are no longer needed but are not properly deallocated,
  causing the application to consume more memory over time.

Example:
```
List<String> myList = new ArrayList<>();
// Forget to clear or set 'myList' to null
```
- Proper memory management, including garbage collection, helps prevent memory leaks.

5. Manual Memory Management:
- Unlike languages like C or C++, Java abstracts away manual memory management. Developers
  don't explicitly allocate or deallocate memory; it's handles by the JVM.

Example:
```
// No need to manually allocate or deallocate memory
MyClass obj = new MyClass();
```

6. OutOfMemoryError:
- This error occurs when the JVM cannot allocate enough memory for an object, typically due to
  excessive memory usage or a memory leak.

Example:
```
try {
    List<String> myList = new ArrayList<>();
} catch (OutOfMemorryError e) {
    // Handle the error
}
```
- Monitoring and optimizing memory usage to avoid such errors.

Understanding memory management is essential for Java developers to write efficient and
scalable applications. Regularly profiling and optimizing code, along with understanding
garbage collection strategies, can contribute to better memory utilization in Java applications.
