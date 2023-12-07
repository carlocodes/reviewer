# Collections Framework

The Java Collections Framework is a comprehensive set of classes and interfaces that provide
commonly reusable data structures. It is part of the `'java.util'` package and is designed to
simplify the manipulation and storage of data in a program. The framework consists of several
interfaces and classes, each serving a specific purpose.

Here are some key interfaces in the Java Collections Framework:

1. List
- Ordered collection of elements where duplicates are allowed.
- Examples are `'ArrayList'`, `'LinkedList'`.
- Used when you need an ordered collection with the ability to have duplicate elements.

Example:
```
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Spring");
myList.add("Hibernate");
```

2. Set
- Unordered collection of unique elements.
- Examples are `'HashSet'`, `'LinkedHashSet'`, `'TreeSet'`.
- Used when you need a collection without duplicates.

Example:
```
Set<String> mySet = new HashSet<>();
mySet.add("Apple");
mySet.add("Orange");
mySet.add("Banana");
```

3. Map
- Collection of key-value pairs.
- Examples are `'HashMap'`, `'LinkedHashMap'`, `'TreeMap'`.
- Used when you need to associate values with unique keys.

Example:
```
Map<String, Integer> myMap = new HashMap<>();
myMap.put("Java", 1);
myMap.put("Spring", 2);
myMap.put("Hibernate", 3);
```

4. Queue:
- Represents a collection of elements for processing in a specific order.
- Examples are `'LinkedList'`, `'PriorityQueue'`.
- Used when you need to process elements in a specific order such as in a queue.

Example:
```
Queue<String> myQueue = new LinkedList<>();
myQueue.add("Task 1");
myQueue.add("Task 2");
myQueue.add("Task 3");
```

5. Deque:
- A double-ended queue that allows insertion and removal from both ends.
- Examples are `'ArrayDeque'`, `'LinkedList'`.
- Used when you need a queue with the ability to insert and remove elements from both ends.

Example:
```
Deque<String> myDeque = new LinkedList<>();
myDeque.addFirst("First");
myDeque.addLast("Last");
```

These are the core interfaces, and there are many classes that implement them. It's essential
to choose the right collection based on the requirements of your program to achieve optimal
performance and maintainability. You may encounter scenarios where efficient data manipulation
and retrieval are crucial, making a solid understanding of the Collections Framework essential
for your work.
