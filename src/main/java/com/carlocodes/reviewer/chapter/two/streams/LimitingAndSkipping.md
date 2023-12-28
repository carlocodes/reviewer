# Limiting and Skipping

In the context of Java streams, the `'limit'` and the `'skip'` operations are used to restrict
the number of elements processed in a stream. These operations are useful for scenarios where
you want to work with only a subset of the elements in a large collection.

1. `'.limit(long maxSize)'`:
The `'limit'` operation is used to reduce the size of the stream to the specified maximum
size. It returns a stream consisting of the elements up to the specified limit.
```
// Example: Limit the stream to the first 3 elements
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> limitedNumbers = numbers.stream()
                                        .limit(3)
                                        .collect(Collectors.toList());
```
In this example, `'limitedNumbers'` will contain the first three elements of the original
list: `'[1, 2, 3]'`.

2. `'.skip(long n)'`:
The `'skip'` operation is used to skip the first `'n'` elements of a stream. It returns a
stream that discards the specified number of elements.
```
// Example: Skip the first 2 elements in the stream
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> skippedNumbers = numbers.stream()
                                        .skip(2)
                                        .collect(Collectors.toList());
```
In this example, `'skippedNumbers'` will contain the elements after skipping the first two:
`'[3, 4, 5]'`.

### Use Cases for Streams Limiting and Skipping:

1. Pagination:
In scenarios where you are displaying data in pages, you can use `'limit'` and `'skip'` to
fetch and display a specific page of data.
```
// Example: Display the third page of results with 10 items per page
int pageSize = 10;
int pageToDisplay = 3;
List<Item> items = /* ... */;
List<Item> page = items.stream()
                        .skip((pageToDisplay - 1) * pageSize)
                        .limit(pageSize)
                        .collect(Collectors.toList());
```

2. Sampling
When you have a large dataset, and you want to work with only a subset of the data, you can
use the `'limit'` to sample a specified number of elements.
```
// Example: Analyze a random sample of 100 data points
List<DataPoint> dataPoints = /* ... */';
List<DataPoint> sample = datapoints.stream()
                                    .limit(100)
                                    .collect(Collectors.toList());
```

3. Bounded Processing
When processing large streams, you might want to limit the number of elements processed to
avoid excessive computation.
```
// Example: Process only the first 1000 elements in a stream
List<Record> records = /* ... */;
records.stream().limit(1000).forEarch(this::processRecord);
```

4. Combining with Filtering:
You can combine `'limit'` and `'skip'` with filtering operations to work with specific
subsets of data based on certain scenarios.
```
// Example: Process only even numbers from the second half of the list
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
numbers.stream()
        .skip(numbers.size() / 2)
        .filter(n -> n % 2 == 0)
        .limit(3)
        .forEach(System.out::println)
```
In this example, it prints the first three even numbers from the second half of the list.

### Appreciation for Streams Limiting and Skipping:

1. Efficient Processing:
Limiting and skipping operations can make stream processing more efficient, especially when
dealing with large datasets, by reducing the amount of data that needs to be processed.

2. Customized Views:
These operations allow you to create customized views of your data based on specific criteria
or requirements.

3. Flexibility in Data Exploration:
When exploring large datasets, limiting and skipping provide a way to focus on specific
portions of the data for analysis.

4. Integration with other operations:
Limiting and skipping can be combined with other stream operations, providing a flexible and
expressive way to process data in a targeted manner.

In summary, limiting and skipping operations in Java streams are valuable tools for working
with subsets of data in a flexible and efficient manner. They are particularly useful when
dealing with large datasets or when you need to focus on specific portions of your data
based on certain conditions or requirements.
