# Parallel Streams

1. Overview
    - Java introduced parallel streams as part of the Stream API to leverage
   multicore processors and enhance the performance of certain operations
   on large datasets.
    - Parallel streams enable the parallelization of stream operations,
   allowing them to be executed concurrently on multiple threads.

2. How to create Parallel Streams:
   - To create a parallel stream, you can use the `'parallelStream()'`
   method instead of the regular `'stream()'` method on a collection or
   other data source.
   ```
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   Stream<Integer> parallelStream = numbers.paralellStream(); 
   ```

3. Parallelization of Stream Operations:
   - Many operations on parallel streams, like `'map'`, `'filter'`, and
   `'reduce'`, are automatically parallelized.
   - The parallelization is handled by the underlying ForkJoinPool, which
   manages worker threads to process tasks concurrently.

4. When to use Parallel Streams:
   - Large Datasets:
     - Parallel streams are most effective with large datasets. The overhead
     of parallelization can outweigh the benefits on smaller datasets.
   - CPU-Bound Operations:
     - Operations that are CPU-Bound (e.g., heavy computations) tend to
     benefit more from parallelization.
   - Independence of Operations:
     - Operations should be independent of each other. Parallel streams
     work by dividing the data and processing parts concurrently, so
     operations must not depend on the state modified by other operations.
   - Embarrassingly Parallel Problems:
     - Problems that can easily be divided into independent sub-problems
     are well suited for parallel processing.

5. Pros of Parallel Streams:
   - Performance Improvement:
     - Parallel streams can significantly improve the performance of certain
     operations, especially on multicore machines.
   - Conciseness:
     - Parallel streams provide a concise and readable syntax for expressing
     parallelizable operations.

6. Cons of Parallel Stream:
   - Overhead:
     - Parallelization comes with overhead, and in some cases, the cost of
     managing threads may outweigh the performance gain.
   - Complexity:
     - Parallelizing operations:introduce complexity. Operations must be
     thread-safe, and there is a potential for race conditions.
   - Limiting Gains for I/O-Bound Operations:
     - For I/O-Bound operations, where the bottleneck is reading and writing
     data, parallelization might not offer significant benefits.
   - Thread Safety:
     - Operations must be carefully designed to be thread-safe. Shared state
     and mutable data can lead to unpredictable behavior.

7. Example: Parallelizing a Stream Operation:
Let's consider an example where we calculate the sum of squares of a list
of numbers:
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Sequential Stream
int sumSequential = numbers.stream()
                            .mapToInt(n -> n * n)
                            .sum();

// Parallel Stream
int sumParallel = numbers.parallelStream()
                            .mapToInt(n -> n * n)
                            .sum();
```
In this example, the `'mapToInt'` operation is automatically parallelized
when using a parallel stream.

### Conclusion:

- Parallel streams are a powerful feature for improving the performance of
certain operations, particularly on large datasets and CPU-Bound tasks.
- Careful consideration and testing are required to determine when parallel
streams are appropriate, and attention must be given to thread safety and
potential issues related to parallelization overhead.
- In practice, it's advisable to profile and measure the performance to
ensure that parallel streams provide the expected benefits.

Parallel streams can be a valuable tool in your toolkit, but like any
powerful tool, they should be used judiciously based on the specific
characteristics of the problem you're solving.
