# Map

In Java, the `'Map'` interface is part of the Java Collections Framework
and represents a collection of key-value pairs. Each key is associated
with a value, and you can use the key to retrieve the corresponding
value. The `'Map'` interface provides a way to store and manipulate data
where each element has a unique key.

There are several implementations of the `'Map'` interface in Java,
each with its characteristics and use cases. Let's explore each
implementation with examples and use cases:

1. **HashMap:**
   - **Implementation:** `'HashMap'` is a hash table-based
   implementation of the `'Map'` interface. It offers fast retrieval
   of values based on keys.

Example:
```
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Alice", 25);
hashMap.put("Bob", 30);
hashMap.put("Charlie", 28);
```

Use cases:
- When you need fast key-value retrieval and don't require a specific
order of keys.
- For general-purpose key-value storage.

2. **TreeMap:**
   - **Implementation:** `'TreeMap'` is a sorted implementation of the
   `'Map'` interface that stores keys in a natural order or using a
   custom comparator.

Example:
```
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Bob", 30);
treeMap.put("Alice", 25);
treeMap.put("Charlie", 28);
```

Use cases:
- When you need key-value pairs sorted by keys.
- For scenarios where you require keys to be in a specific order.

3. **LinkedHashMap:**
   - **Implementation:** `'LinkedHashMap'` is a has table-based
   implementation like `'HashMap'`, but it maintains the order of key-
   value pairs based on insertion order.

Examples:
```
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Alice", 25);
linkedHashMap.put("Bob", 30);
linkedHashMap.put("Charlie, 28);
```

4. **ConcurrentHashMap:**
   - **Implementation:** `'ConcurrentHashMap'` is a thread-safe version
   of `'HashMap'`, designed for concurrent access by multiple threads.

Example:
```
Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
concurrentHashMap.put("Alice", 25);
concurrentHashMap.put("Bob", 30);
concurrentHashMap.put("Charlie", 28);
```

Use cases:
- When you need thread-safe key-value storage with good concurrency
performance.
- For scenarios where multiple threads read and write to the map
concurrently.

5. **Hashtable:**
   - **Implementation:** `'Hashtable'` is an older, thread-safe
   implementation of the `'Map'` interface, similar to `'HashMap'`.
   However, it's less efficient and less commonly used in modern Java
   development due to its performance overhead.

Example:
```
Map<String, Integer> hashtable = new HashTable<>();
hashtable.put("Alice", 25);
hashtable.put("Bob", 30);
hashtable.put("Charlie", 28);
```

Use cases:
- In legacy codebases or situations where backward compatibility with
older Java versions is necessary.
- When you need a thread-safe map but `'ConcurrentHashMap'` is not an
option.

Each implementation of the `'Map'` interface has its strengths and
weaknesses, and the choice of which to use depends on your specific
use case. Consider factors like performance, thread safety, key order,
and concurrency requirements when selecting the appropriate `'Map'`
implementation.
