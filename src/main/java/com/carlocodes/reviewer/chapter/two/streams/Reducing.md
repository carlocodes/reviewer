# Reducing

In the context of Java streams, reducing is an operation that combines the elements of a
stream to produce a single result. It's often used for tasks like finding the sum or the
product of elements, concatenating strings, or determining the minimum or maximum value. The
reduction process involves iteratively applying an associative accumulation function to the
elements of the stream.

### How Reducing Works in Streams:
In Java streams, the primary method for reducing is the `'.reduce()'` operation. The `'reduce'`
operation takes two parameters:

1. An identity value (also known as the identity element or initial value), which is an
element that does not change the result when combined with another element. For addition, the
identity element is 0; for multiplication, it's 1.

2. An associative accumulation function, which takes to parameters and combines them into a
single result.

The general form of the `'reduct'` method is:
```
T result = stream.reduce(identity, (a, b) -> accumulatorFunction);
```
Here, `'T'` is the type of the elements in the stream, and the `'accumulatorFunction'` is a
lambda expression or method reference that combines two elements.

### Commonly Used Methods/Operations for Reducing:

1. `'.reduct(T identity, BinaryOperator<T> accumulator)'`:
Performs a reduction on the elements of the stream using an associative accumulation function
and returns an `'Optional'`.
```
// Example: Finding the sum of integers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sumOptional = numbers.stream()
                                        .reduce(Integer::sum);
int sum = sumOptional.orElse(0);
```

2. `'.collect(Collectors.reducing(identity, mapper, accumulator))'`:
Performs a reduction on the elements of the stream using a mapping function and an
associative accumulation function. It returns a `'Collector'` that can be used with the
`'collect' operation.
```
// Example: Finding the product of integers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int product = numbers.stream()
                        .collect(Collectors.reducing(1, (a, b) -> a * b));
```

### Use cases for Streams Reducing:

1. Summation:
Finding the sum of elements in a collection.
```
// Example: Finding the sum of integers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                    .reduce(0, Integer::sum);
```

2. Multiplication:
Calculating the product of elements in a collection.
```
// Example: Finding the product of integers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int product = numbers.stream()
                        .reduce(1, (a, b) -> a * b);
```

3. Finding the Maximum or Minimum:
Determining the maximum or minimum value in a collection.
```
// Example: Finding the maximum of integers
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> max = numbers.stream()
                                .reduct(Integer::max);
```

4. String Concatenation:
Concatenating strings in a collection.
```
// Example: Concatenating strings
List<String> strings = Arrays.asList("Java", "is", "awesome");
String concatenated = strings.stream()
                                .reduce("", String.concat);
```

5. Custom Reductions:
Perform custom aggregations based on specific criteria.
```
// Example: Custom reduction (finding the length of the longest string)
List<String> strings = Arrays.asList("Java", "is", "awesome");
int maxLength = strings.stream()
                        .map(String::length)
                        .reduce(0, Integer::max);
```

### Appreciation for Streams Reducing:

1. Conciseness:
Reducing allows you to express complex aggregation operations in a concise and readable
manner.

2. Versatility:
The flexibility of the `'reduce'` operation enables a wide range of aggregation tasks,
from simple summation to custom reductions.

3. Parallel Processing:
Reduction operations can be easily parallelized, leading to improved performance for large
datasets.

4. Integrations with Collectors:
The `'Collectors.reducing'` collector provides additional flexibility for combining mapping
and aggregation in a single operation.

In summary, reducing in streams is a powerful operation for aggregating elements into a
single result. Whether you're calculating sums, products, finding maximum values, or
performing custom reductions, the `'reduce'` operation provides a versatile and expressive
way to handle aggregation tasks in a declarative manner.
