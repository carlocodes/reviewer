# Data Structures

Data structures are essential components in computer
science and programming. They provide a way to organize
and store data efficiently, enabling operations like
insertion, retrieval, and deletion.

1. Arrays:
Arrays are a fundamental data structure that stores elements of the same
data type in contiguous memory locations. Use when you know the size of
the data in advance.

Use cases:
- Storing a collection of numbers, characters, or any homogenous data.

```
int[] numbers = new int[5];
```

2. Linked List:
Linked lists consist of nodes where each node contains data and a
reference to the next node. Use when you need efficient insertion and
deletion of elements.

Use cases:
- Implementing dynamic lists, undo functionality.

```
class Node {
    int data;
    Node next;
}
```

3. Heaps:
Heaps are binary trees with specific properties (min-heap or max-heap)
often used for priority queues. Use when you need efficient retrieval of
the minimum or maximum element.

Use cases:
- Implementing priority queues, finding the smallest/largest element.

```
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```

4. Queues:
Queues follow the First-In-First-Out (FIFO) principle and are used for
managing tasks in an ordered manner. Use when you need to maintain order
and manage tasks in sequence.

Use cases:
- Task scheduling, print job queues.

```
Queue<String> taskQueue = new LinkedList<>();
```

5. Binary Trees:
Binary trees consist of nodes with at most two children, making them
useful for hierarchical data structures. Use when you need to represent
hierarchical data or perform efficient searches.

Use cases:
- Directory structures, decision trees.

```
class Node {
    int data;
    Node left, right;
}
```

6. Hash Tables:
Hash tables use a hash function to map keys to values, providing fast
access. Use when you need efficient key-value pair storage.

Use cases:
- Implementing dictionaries, associative arrays.

```
HashMap<String, Integer> ageMap = new HashMap<>();
```

7. Graphs:
Graphs represent relationships between nodes (vertices) with edges. Use
when you need to model complex relationships, such as in social networks
or network routing.

Use cases:
- Social networks, maps, network topology.

Implementing graphs require custom classes for vertices and edges, rather
than a built-in data structure.

8. Stacks:
Stacks use the Last-In-First-Out (LIFO) principle and are often used for
managing function calls and undo functionality. Use when you need to
manage function call history or maintain a specific order.

Use cases:
- Function call history, browser back functionality.

```
Stack<Integer> callStack = new Stack<>();
```

These data structures are fundamental building blocks in computer
science and are used in various real-world applications. Choosing the
right data structure depends on the specific requirements of your
project, and understanding their characteristics is crucial for
efficient and effective programming.
