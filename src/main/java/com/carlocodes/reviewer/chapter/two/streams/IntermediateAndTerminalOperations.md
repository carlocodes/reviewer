# Intermediate and Terminal Operations

Understanding the concepts of intermediate and terminal operations is crucial
when working with Java streams. Let's delve into these concepts in detail:

1. Java Streams Overview:
Java streams provide a declarative approach to processing collections. They
allow you to express complex data manipulations concisely and often in a
more readable manner compared to traditional iterative approaches. Streams
work with various data sources, including collections, arrays, I/O channels.

2. Intermediate Operations:
Intermediate operations are operations that transform a stream into another
stream. These operations are lazy, meaning they don't execute until a
terminal operation is invoked. Intermediate operations return a new stream,
allowing you to chain multiple operations together.

Some common intermediate operations include:

- `'filter(Predicate<T> predicate)'`: Filters elements based on a condition.
- `'map(Function<T, R> mapper)'`: Transforms each element using a given
function.
- `'flatpMap(Function<T, Stream<R>> mapper`: Flattens nested streams.
- `'distinct()'`: Removes duplicate elements.
- `'sorted()' or 'sorted(Comparator<T> comparator'`: Sorts the elements.

Example:
```
List<String> result = myList.stream()
                            .filter(s -> s.length() > 3)
                            .map(String::toUpperCase)
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());
```
In this example, `'filter'`, `'map'`, `'distinct'`, and `'sorted'` are
intermediate operations.

3. Terminal Operations:
Terminal operations consume a stream and produce a result or a side effect.
They trigger the execution the entire stream pipeline. Once a terminal
operation is called, the stream is considered consumed, and you can't reuse
it.

Common terminal operations include:

- `'collect(Collector<T, A, R> collector)'`: Collects the elements of a
stream into a result.
- `'forEach(Consumer<T> action)'`: Performs an action for each element.
- `'count()'`: Counts the number of elements.
- `'anyMatch(Predicate<T> predicate)'`: Checks if any elements match a
condition.
- `'allMatch(Predicate<T> predicate)'`: Checks if all elements match a
condition.
- `'noneMatch(Predicate<T> predicate)'`: Checks if no elements match a
condition.
- `'reduce(BinaryOperator<T> accumulator)'`: Reduces the stream into a
single value.

Example:
```
long count = myList.stream()
                    .filter(s -> s.length > 3)
                    .map(String::toUpperCase)
                    .distinct()
                    .sorted()
                    .count();
```
In this example, `'count'` is a terminal operation.

4. When to use intermediate and terminal operations:
- Intermediate Operations:
  - Used for building a pipeline of transformations.
  - Do not produce a final result until a terminal operation is encountered.
  - Allow for lazy evaluation, which can improve performance by avoiding
  unnecessary processing.

- Terminal Operations:
  - Trigger the actual processing of the stream and produce a result or
  a side effect.
  - Once a terminal operation is invoked, the stream is consumed and cannot
  be reused.

5. Why these operations:
- Readability and Expressiveness:
  - Streams provide a more concise and expressive way to perform operations
  on data.
  - Chaining multiple intermediate operations in a single pipeline can lead
  to cleaner code.

- Lazy Evaluation:
  - Intermediate operations are lazily evaluated, meaning they don't execute
  until a terminal operation is invoked. This can lead to better performance,
  especially when working with large datasets.

- Parallel Processing
  - Streams can take advantage of parallel processing, automatically
  parallelizing certain operations. This can result in improved performance
  on multicore processors.

6. Example:
```
List<String> result = myList.stream()
                            .filter(s -> s.length() > 3)
                            .map(String::toUpperCase)
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());
```
In this example, `'stream()'`, `'filter'`, `'map'`, `'distinct()'`,
`'sorted'`, and `'collect'` together form a stream pipeline. `'collect'`
is the terminal operation that triggers the execution of the entire
pipeline and produces a `'List<String'` as a result.

7. Parallel Streams:
Java streams can be processed in parallel using the `'parallel()'` method
on a stream. Parallel streams can potentially enhance performance for
operations that can be parallelized, but care should be taken as
parallelism introduces overhead, and not all operations benefit from
parallel processing.

Example:
```
List<String> result = myList.parallelStream()
                            .filter(s -> s.length() > 3)
                            .map(String::toUpperCase)
                            .distinct()
                            .sorted()
                            .collect(Collectors.toList());
```

8. Handling Exceptions:
Handling exceptions in streams requires careful consideration. Checked
exceptions thrown within lambda expressions need to be caught or declared.
