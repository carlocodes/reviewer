# Collections

In Java, collections are data structures used to store, manipulate, and
manage groups of objects. Collections provide a flexible and convenient
way to work with data, and they are an essential part of Java's
standard library. There are several collection interfaces and classes
available in Java, each designed for specific use cases.

Here, I'll list some common collection interfaces and classes, along
with examples and use cases for each:

**Collection Interfaces:**

1. **List Interface:**
   - Represents an ordered collection of elements that allows
   duplicate values.
   - Implementations include `'ArrayList'`, `'LinkedList'`, and
   `'Vector'`.
```
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");
```
Use cases:
- To maintain a dynamic list of items, such as a list of tasks,
contacts, or items in a shopping cart.

2. **Set Interface:**
    - Represents a collection of elements without duplicates.
    - Implementations include `'HashSet'`, `'LinkedHashSet'`, and
   `'TreeSet'`.
```
Set<Integer> numbers = new HashSet();
numbers.add(1);
numbers.add(2);
numbers.add(3);
```
Use cases:
- To maintain a collection of unique items, such as a set of unique
IDs or unique elements in a mathematical set.

3. **Map Interface:**
   - Represents a collection of key-value pairs.
   - Implementations include `'HashMap'`, `'LinkedHashMap'`, and
   `'TreeMap'`.
```
Map<String, Integer> scores = new HashMap();
scores.put("Alice", 95);
scores.put("Bob", 88);
scores.put("Charlie", 92);
```
Use cases:
- To store and retrieve data using a key, such as storing user
information by their username or maintaining a dictionary of words
and their meanings.
