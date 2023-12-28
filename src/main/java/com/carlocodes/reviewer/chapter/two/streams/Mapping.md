# Mapping

In the context of Java streams, mapping is a powerful operation that transforms elements of a
stream from one type to another or applies a function to each element to derive a new value.
The primary purpose of mapping is to convert or transform the elements in a stream, creating
a new stream with the transformed values.

### How Mapping Works in Streams:
In Java streams, mapping is often performed using the `'.map()'` operation. The `'map'`
operation takes a function as an argument and applies that function to each element in the
stream, producing a new stream of the transformed values.
```
List<String> words = Arrays.asList("hello", "world", "java");

// Example: Convert each word to uppercase
List<String> uppercaseWords = words.stream()
                                    .map(String::toUppercase)
                                    .collect(Collectors.toList());
```
In this example, the `'toUpperCase'` method is applied to each string in the stream,
converting each word to uppercase.

### Commonly Used Methods/Operations for Mapping:

1. `'.map(Function<T, R> mapper)'`:
Applies the provided function to each element in the stream, transforming each element into
a new type.
```
// Example: Convert integers to their squares
List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5);
List<Integer> squares = numbers.stream()
                                .map(n -> n * n)
                                .collect(Collectors.toList());
```

2. `'.flatMap(Function<T, Stream<R>> mapper)'`:
Applies the provided function to each element, resulting in a stream of streams. It flattens
these streams into a single stream of resulting values.
```
// Example: Flatten a list of lists
List<List<String> nestedLists = Arrays.asList(
    Arrays.asList("apple", "orange"),
    Arrays.asList("banana", "grape"),
    Arrays.asList("cherry", "pear")
);

List<String> flatList = nestedLists.stream()
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());
```

### Use Cases for Streams Mapping:

1. Data Transformation:
Converts elements from one type to another, such as converting a list of objects to a list of
their properties.

2. Normalization:
Standardize or normalize data, for example, converting all string elements to lowercase or
uppercase.

3. Calculations:
Apply mathematical or logical operations to elements, like squaring numbers or computing
derived values.

4. Extraction:
Extract specific attributes or fields from objects, creating a new stream with only those
attributes.

5. Flattening Nested Structures:
Flatten nested collections or structures, transforming a collection of collections into a
single flat collection.

### Appreciation for Streams Mapping:

1. Conciseness:
Mapping allows you to express complex transformations in a concise and readable manner,
reducing boilerplate code.

2. Readability:
The use of mapping operations contribute to code that closely resembles the problem domain,
improving readability.

3. Chaining:
Mapping can be easily chained with other stream operations, allowing the creation of powerful
and expressive pipelines for data processing.

4. Functional Style:
Mapping aligns well with the functional programming style, promoting a focus on
transformations and immutability.

5. Parallel Processing:
Mapping operations can take advantage of parallel processing, improving performance for large
datasets.

In summary, mapping in streams is a versatile operation for transforming elements in a stream,
allowing you to convert data, calculate derived values, or extract specific attributes. It
plays a key role in making code concise, readable, and expressive in the context of data
transformation and processing.
