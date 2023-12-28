# Sorting

In the context of Java streams, sorting operations are used to arrange elements in a specific
order. The Stream API provides methods for both natural and custom sorting.

1. Natural Ordering:
The `'sorted'` method is used to sort elements in their natural order. For example, sorting a
stream of numbers will arrange them in ascending order.
```
// Example: Sorting a list of integers in ascending order
List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 7);
List<Integer> sortedNumbers = numbers.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
```
In this example, `'sortedNumbers'` will contain `'[1, 2, 5, 7, 8]'`.

2. Custom Ordering:
The `'sorted'` method can take a custom comparator to define a custom order. This is useful
when you want to sort elements based on a specific property or according to a custom rule.
```
// Example: Sorting persons by age in descending order
List<Person> persons = /* ... */;
List<Person> sortedPersons = persons.stream()
                                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                                .collect(Collectors.toList());
```
In this example, `'sortedPersons'` will contain persons sorted by age in descending order.

### Use cases for Streams Sorting:

1. Display Order:
When you want to display data in a specific order, such as sorting a list of products by price
or a list of names alphabetically.
```
// Example: Sorting products by price
List<Product> products = /* ... */;
List<Product> sortedProducts = products.stream()
                                        .sorted(Comparator.comparingDouble(Product::getPrice))
                                        .collect(Collectors.toList());
```

2. Top N Items:
Sorting is useful when you want to find the top N items based on a certain criterion, like
the highest-scoring students or the most expensive products.
```
// Example: Finding the top 3 highest-scoring students
List<Student> students = /* ... */;
List<Student> topStudents = students.stream()
                                    .sorted(Comparator.comparingDouble(Student::getScore))
                                    .collect(Collectors.toList());
```

3. Data Analysis:
When analyzing data, sorting can be applied to organize and present data in a meaningful way.
```
// Example: Sorting sales data by date
List<Sale> sales = /* ... */;
List<Sale> sortedSales = sales.stream()
                                .sorted(Comparator.comparing(Sale::getDate))
                                .collect(Collectors.toList());
```

4. Merging Sorted Streams:
Sorting is crucial when merging or combining multiple sorted streams. This ensures that the
resulting stream is also sorted.
```
// Example: Merging and sorting two lists of integers
List<Integer> list1 = Arrays.asList(2, 4, 6);
List<Integer> list2 = Arrays.asList(1, 3, 5);
List<Integer> mergeAndSorted = Stream.concat(list1.stream(), list2.stream())
                                        .sorted()
                                        .collect(Collectors.toList());
```

### Appreciation for Streams Sorting:

1. Ordering Flexibility:
Streams provide flexibility in specifying both natural and custom ordering, making it
adaptable to various use cases.

2. Readability:
Sorting operations contribute to the readability of code, especially when dealing with
ordered data.

3. Integration with other operations:
Sorting can be seamlessly integrated with other stream operations, allowing for expressive
and concise data processing.

4. Efficient Sorting:
The Stream API leverages efficient sorting algorithms, providing performance benefits,
especially for large datasets.

In summary, sorting operations in Java streams are essential for arranging elements in a
specified order, whether it's the natural order or a custom order defined by a comparator.
Sorting is particularly valuable in scenarios where the order of elements matters, such as
displaying data, analyzing data, or merging sorted streams.
