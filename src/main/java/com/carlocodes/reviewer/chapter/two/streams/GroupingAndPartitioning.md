# Grouping and Partitioning

In the context of Java streams, grouping and partitioning operations are used to organize
elements into groups based on certain criteria. These operations are powerful for categorizing
and organizing data in a streamlined manner.

1. Grouping By:
The `'groupingBy'` collector is used to group elements of a stream by a classifier function.
The result is a `'Map'` where keys are the result of applying the classifier function, and
the values are Lists of items that share the same key.
```
// Example: Grouping strings by their length
List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
Map<Integer, List<String>> groupedByLength = words.stream()
                                                    .collect(Collectors.groupingBy(String::length));
```
In this example, `'groupedByLength'` will be a `'Map'` where keys are the lengths of strings,
and values are Lists of strings with the corresponding length.

2. Partitioning By:
The `'partitioningBy'` collector is a special case of grouping where the classifier function
is a predicate. It divides the elements of the stream into two groups: those that satisfy the
predicate and those that do not.
```
// Example: Partitioning numbers into even and odd
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
Map<Boolean, List<Integer>> partitionedEvenOdd = numbers.stream()
                                                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
```
In this example, `'partitionedEvenOdd'` will be a `'Map'` with keys `'true'` and `'false'`,
where `'true'` corresponds to even numbers, and `'false'` corresponds to odd numbers.

### Use cases for Streams Grouping and Partitioning

1. Categorization:
Grouping and partitioning are useful for categorizing elements based on certain properties or
criteria.
```
// Example: Grouping persons by their age range
List<Person> persons = /* ... */;
Map<AgeRange, List<Person>> groupedByAgeRange = persons.stream()
                                                        .collect(Collectors.groupingBy(Person::getAgeRange));
```

2. Statistics and Aggregation:
These operations are helpful when you want to compute statistics or aggregate data within
each group.
```
// Example: Computing average salary by department
List<Employee> employees = /* ... */;
Map<Department, Double> averageSalaryByDepartment = employees.stream()
                                                                .collect(Collectors.groupingBy(Employee:getDepartment, Collectors.averagingDouble(Employee:getSalary)));
```

3. Efficient Filtering:
Partitioning is beneficial when you want to efficiently filter elements based on a condition.
```
// Example: Partitioning students into pass and fail based on a threshold
List<Students> students = /* ... */;
double passThreshold = 60.0;
Map<Boolean, List<Student>> passAndFail = students.stream()
                                                    .collect(Collectors.partioningBy(s -> s.getScore >= passThreshold));
```

4. Custom Data Structures:
Grouping and partitioning allow you to create custom data structures that organize data in a
way that suits your application.
```
// Example: Grouping books by genre and partitioning by availability
List<Book> books = /* ... */;
Map<Genre, Map<Boolean, List<Book>>> booksByGenreAndAvailability = books.stream()
                                                                            .collect(Collectors.groupingBy(Book:getGenre, Collectors.partitioningBy(Book::isAvailable)));
```

### Appreciation for Streams Grouping and Partitioning

1. Structured Data Organization:
These operations provide a structured way to organize and categorize data, making it easier
to work with.

2. Custom Aggregation:
You can perform custom aggregations and computations with each group or partition.

3. Flexibility:
Grouping and partitioning are highly flexible and can be adapted to various use cases,
allowing for diverse and complex data categorization.

4. Reduced Complexity:
These operations help reduce the complexity of data processing tasks, especially when dealing
with large datasets.

In summary, grouping and partitioning operations in Java streams are powerful tools for
organizing and categorizing data based on specific criteria. They are valuable for a wide
range of applications, from simple categorization tasks to more complex data analysis and
aggregation scenarios.
