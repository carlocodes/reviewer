# List

In Java, the `'List'` interface is part of the Java Collections
Framework and represents an ordered collection of elements. Lists allow
for duplicate elements and provide various methods for adding, accessing,
modifying, and removing elements. There are several implementations of
the `'List'` interface, each with its characteristics and use cases.

Let's explore each implementation with examples and use cases:

1. **ArrayList:**
   - **Implementation:** `'ArrayList'` is a dynamic array-based
   implementation of the `'List'` interface. It automatically resizes
   itself when needed.

Example:
```
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
```

Use cases:
- When you need fast access to elements by index.
- For scenarios where elements are frequently added or removed from
the end of the list.
- Suitable for most general-purpose list requirements.

2. **LinkedList:**
   - **Implementation:** `'LinkedList'` is a doubly-linked list-based
   implementation of the `'List'` interface. It provides efficient
   insertions and deletions, especially at the beginning or middle of
   the list.

Example:
```
List<Integer> numbers = new LinkedList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
```

Use cases:
- When you need to frequently add or remove elements from the middle of
the list.
- For implementing queues, stacks, or other specialized data structures.
- In scenarios where you don't require random access by index.

3. **Vector:**
   - **Implementation:** `'Vector'` is an older synchronized
   implementation of the `'List'` interface. It is thread-safe but less
   efficient than `'ArrayList'`. It's rarely used in modern Java
   development due to its performance overhead.

Example:
```
List<Double> vector = new Vector<>();
vector.add(3.14);
vector.add(2.71);
vector.add(1.62);
```

Use cases:
- In situations where thread safety is a crucial requirement, and the
performance impact is acceptable.
- In legacy codebases or situations where backward compatibility with
older Java versions is necessary.

4. **CopyOnWriteArrayList:**
   - **Implementation:** `'CopyOnWriteArrayList'` is a thread-safe
   variant of `'ArrayList'`. It provides thread safety by creating a
   new copy of the list when elements are modified.

Example:
```
List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
copyOnWriteList.add("Java");
copyOnWriteList.add("Python");
copyOnWriteList.add("C++");
```

Use cases:
- When you need a thread-safe list, but reads greatly outnumber writes.
- Suitable for scenarios where you want to avoid concurrent modification
exceptions.

5. **ImmutableList (from Guava library):**
   - **Implementation:** `'ImmutableList'` is part of the Google Guava
   library, not part of the standard Java library. It provides immutable
   (unchangeable) list.

Example:
```
ImmutableList<String> immutableList = ImmutableList.of(
    "Apple",
    "Banana",
    "Cherry"
);
```

Use cases:
- When you need a list that cannot be modified after creation to
ensure data integrity.
- In situations where immutability is a design requirement, especially
for functional programming practices.

Each implementation of the `'List'` interface has its strengths and
weaknesses, and the choice of which to use depends on your specific
use case. Consider factors like performance, thread safety, and the
nature of your data when selecting the appropriate `'List'`
implementation.
