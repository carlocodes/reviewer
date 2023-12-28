# Filtering

Filtering is a crucial operation in streams, and it allows you to select specific elements
from a collection based on a given condition. Let's delve deeper into how filtering works in
Java streams and explore some commonly used methods/operations.

### How Filtering Works in Streams:
In Java streams, the `'.filter()'` operation is commonly used for filtering. This operation
takes a predicate, a functional interface representing a condition, and retains only those
elements that satisfy the condition.
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Example: Filter even numbers
List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());
                                    
System.out.println(evenNumbers); // Output [2, 4]
```
In this example, the `'.filter(n -> n % 2 == 0)'` operation retains only the even numbers
from the original list.

### Commonly Used Methods/Operations for Filtering:

1. `'.filter(Predicate<T> preciate)'`:
Filters elements based on provided predicate.
```
// Example: Filter strings starting with "A"
List<String> startingWithA = list.stream()
                                    .filter(s -> s.startsWith("A"))
                                    .collect(Collectors.toList());
```

2. `'.distinct()'`:
Removes duplicate elements from the stream.
```
// Example: Filter distinct elements
List<Integer> distinctNumbers = numbers.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
```

3. `'.limit(long maxSize)'`:
```
// Example: Limit to the first three elements
List<Integer> firstThree = numbers.stream()
                                    .limit(3)
                                    .collect(Collectors.toList());;
```

4. `'.skip(long n)'`:
Skips the first n elements in the stream.
```
// Example: Skip the first two elements
List<Integer> skipTwo = numbers.stream()
                                .skip(2)
                                .collect(Collectors.toList());
```

### Use Cases for Streams Filtering:

1. Data Cleaning:
Filtering out invalid or unwanted data from a datasheet.

2. Search and Retrieval:
Retrieving elements based on search criteria.

3. Data Transformation:
Preprocessing data by selecting and transforming elements.

4. Distinct Values:
Obtaining a list of unique or distinct values from a collection.

5. Pagination:
Implementing pagination by limiting and skipping elements for display.

6. Conditional Processing:
Performing different operations on elements based on specific conditions.

7. Security
Filtering out sensitive information from a dataset before processing.

### Appreciation for Streams Filtering:
Streams filtering provides a concise and expressive way to perform data manipulation. It
enhances readability and reduces the need for explicit loops and conditionals, making the
code more declarative. The use of functional interfaces and lambda expression in filtering
operations contributes to a more functional programming style, allowing developers to focus
on expressing the logic rather than the mechanics of iteration. Additionally, the ability to
chain multiple filtering operations in a single pipeline allows for powerful and flexible
data processing.
