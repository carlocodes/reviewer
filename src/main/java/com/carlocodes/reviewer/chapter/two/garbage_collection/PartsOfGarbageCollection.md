# Parts of Garbage Collection

Let's delve into more detail about the different parts of the Java Virtual Machine (JVM)
involved in garbage collection:

1. Young Generation:
- Allocation of Objects:
  - The young generation is the area where newly created objects are initially allocated.
  This area is further divided into three spaces: Eden space and two survivor spaces (S0 and
  S1).
  - Objects are created in the Eden space, and after each garbage collection cycle, surviving
  objects are moved between the Eden space and the survivor spaces.
- Minor Garbage Collection (Minor Collection):
  - Garbage collection in the young generation is known as a minor collection. It is a
  frequent and fast process, as it targets short-lived objects.
  - During a minor collection, live objects in the Eden space and one of the survivor spaces
  are identified and moved to the other survivor space or directly to the old generation.
- Purpose:
  - The young generation is designed to quickly identify and reclaim memory occupied by
  others with short lifetimes, promoting the efficient use of memory.

2. Survivor Spaces:
- Allocation of Surviving Objects:
  - Survivor spaces (S0 and S1) act as intermediate areas for objects that survive one or
  more minor garbage collections in the young generation.
  - After each minor collection, surviving objects from the Eden space and one survivor space
  are moved to the other survivor space.
- Aging and Promotion:
  - Objects in survivor spaces go through a process called aging. As objects survive multiple
  garbage collection cycles, they are eventually promoted to the old generation.
- Purpose:
  - Survivor spaces provide a way to identify objects with slightly longer lifetimes,
  allowing them to be promoted to the old generation if they persist beyond a certain
  threshold.

3. Old Generation:
- Long-Lived Objects:
  - The old generation, also known as the tenured generation, is where long-lived objects end
  up after surviving multiple garbage collection cycles in the young generation.
  - Major garbage collections are performed in the old generation to identify and reclaim
  memory occupied by long-lived objects.
- Major Garbage Collection (Major Collection):
  - Garbage collection in the old generation is known as a major collection. It is a less
  frequent but more resource-intensive process compared to minor collection.
- Purpose:
  - The old generation is designed to accommodate objects with longer lifetimes, preventing
  unnecessary movement of long-lived objects in frequent garbage collections.

4. Permanent Generation (or Metaspace in Java 8+):
- Holding Metadata:
  - In earlier Java versions (Java 7 and below), the permanent generation held metadata
  related to classes and methods, such as class definitions and bytecode.
  - In Java 8 and later versions, the permanent generation has been replaced by Metaspace,
  which dynamically adjusts its size based on the application's requirements.

### Why these designated parts?

The generational garbage collection model with the young generation, survivor spaces, and
old generation is based on the observation that most objects have a short lifespan. By
segregating objects based on their age, the JVM can apply different garbage collection
strategies to each generation, optimizing the trade-off between collection frequency and
efficiency.

- Young Generation:
  - Frequent minor collections quickly reclaim short-lived objects, minimizing the impact on
  the application.
- Survivor Spaces:
  - Provide a buffer for objects with slightly longer lifetimes before promotion to the old
  generation.
- Old Generation:
  - Houses long-lived objects and undergoes less frequent but more intensive major
  collections.
- Permanent Generation (or Metaspace):
  - Separately manages metadata related to classes and methods.

This design helps strike a balance between minimizing pause times, conserving resources, and
efficiently managing memory in the diverse lifecycle of objects within a Java application.
