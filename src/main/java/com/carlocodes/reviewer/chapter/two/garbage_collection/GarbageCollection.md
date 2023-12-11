# Garbage Collection

Garbage Collection is a crucial aspect of memory management in Java. It is the process by which
the Java Virtual Machine (JVM) automatically identifies and reclaims memory that is no longer
in use by the program, preventing memory leaks and improving overall application performance.

### How Garbage Collection Works:

1. Memory Allocation:
When you create objects in Java, memory is allocated in the heap for these objects.

2. Reference Tracking:
The JVM keeps track of all references to objects. An object is considered reachable if there is
at least one reference to it.

3. Mark and Sweep:
Garbage collection involves a process called "mark and sweep". The JVM identifies and marks all
the objects that are reachable from the root of the application (such as static variables,
method parameters, etc.). Once the reachable objects are marked, the JVM sweeps through the
heap and removes the unmarked (unreachable) objects.

4. Memory Compaction:
After removing the unreachable objects, the JVM might perform memory compaction to consolidate
the remaining memory, reducing fragmentation.

### Why Garbage Collection Is Needed:

1. Prevents Memory Leaks:
Garbage collection ensures that objects no longer needed by the program are automatically
identified and reclaimed, preventing memory leaks.

2. Simplifies Memory Management:
Developers don't have to manually free up memory as the JVM takes care of it, making memory
management less error-prone.

3. Improves Performance:
Automatic memory management helps in optimizing application performance by minimizing the time
spent on memory-related tasks.

### Parts of JVM Involved in Garbage Collection:

1. Young Generation:
Newly created objects are initially allocated in the young generation. Garbage collection in
this space is known as a minor collection.

2. Survivor Spaces:
Objects that survive the first few garbage collections in the young generation are moved to
the survivor spaces.

3. Old Generation:
Objects that persist for a more extended period are eventually moved to the old generation.
Garbage collection in this space is known as a major collection.

4. Permanent Generation (or Metaspace in Java 8+):
It holds metadata related to the classes and methods in the application.

Understanding these components helps in tuning garbage collection for optimal performance.
You can use JVM flags and parameters to configure garbage collection strategies based on the
characteristics of your application.

For further studies, consider exploring specific garbage collection algorithms like the
Garbage-First (G1) collector, tuning options, and monitoring tools to analyze garbage
collection behavior in your applications.
