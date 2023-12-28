# Collecting

In the context of Java streams, collecting refers to the process of
transforming the elements of a stream into a different form, usually a
collection list a List, Set, or Map. The `'Collectors'` utility class
provides various factory methods for common collectors that can be used
with the `'collect'` method of the Stream API.

1. Collecting to List:
The `'toList'` collector is commonly used to collect elements into a
`'List'`.
```
// Example: Collecting even numbers into a List:
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList()); 
```
In this example, `'evenNumbers'` will contain `'[2, 4, 6, 8, 10]'`.

2. Collecting to Set:
The `'toSet'` collector is used to collect elements into a `'Set'`, which
ensures uniqueness.
```
// Example: Collecting distinct words into a set
List<String> words = Arrays.asList("apple", "banana", "orange", "banana", "kiwi");
Set<String> uniqueWords = words.stream()
                                .collect(Collectors.toSet());
```
In this example, `'uniqueWords'` will contain `'{"apple", "banana", "orange",
"kiwi"}'`.

3. Collecting to Map:
The `'toMap'` collector is used to collect elements into a `'Map'`. You
need to provide key and value mapping functions.
```
// Example: Collecting a list of persons into a Map with names as keys and ages as values
List<Person> persons = /* ... */;
Map<String, Integer> nameToAgeMap = persons.stream()
                                            .collect(Collectors.map(Person::getName, Person::getAge); 
```
In this example, `'nameToAgeMap'` will be a `'Map'` where names are keys
and ages are values.

4. Joining elements into a String:
The `'joining'` collector is used to concatenate the elements of a stream
into a single String.
```
// Example: Joining words into a comma-separated string
List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi");
String results = words.stream()
                        .collect(Collectors.joining(", "));
```
In this example, `'result'` will be `"apple, banana, orange, kiwi"`.

### Use cases for Streams Collecting:

1. Data Transformation:
Collecting is widely used for transforming the elements of a stream into a
different data structure, such as Lists, Sets, or Maps.
```
// Example: Transforming a stream of numbers into a List of their squares
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,);
List<Integer> squares = numbers.stream()
                            .map(n -> n * n)
                            .collect(Collectors.toList);
```

2. Aggregation:
Collecting is often used to aggregate data, such as finding the sum,
average, or other statistics.
```
// Example: Calculating the average score of students
List<Student> students = /* ... */;
double averageScore = students.stream()
                                .collect(Collectors.averagingDouble(Student::getScore));
```

3. Grouping and Partitioning:
Collecting is essential when performing grouping and partitioning operations.
```
// Example: Grouping books by genre
List<Book> books = /* ... */;
Map<Genre, List<Book>> booksByGenre = books.stream()
                                            .collect(Collectors.groupingBy(Book::getGenre));
```

4. Custom Aggregation:
Collectors can be combined to achieve custom aggregations to create more
complex data structures.
```
// Example: Grouping and counting words in a sentence
String sentence = "This is a simple sentence with simple words";
Map<String, Long> wordCount = Arrays.stream(sentence.split("\\s+"))
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
```

### Appreciation for Streams Collecting:

1. Conciseness:
Collectors provide a concise and expressive way to transform and aggregate
data in a stream.

2. Integration with Streams API:
Collectors seamlessly integrate with other operations in the Streams API,
making it easy to compose complex data processing pipelines.

3. Reusability:
Custom collectors can be created and reused for specific data
transformation needs.

4. Parallelism:
Certain collectors are designed to work efficiently in parallel streams,
offering performance benefits.

In summary, collecting in Java streams is a fundamental aspect of the
Streams API, allowing you to transform, aggregate, and organize data in a
convenient and expressive manner. Collectors provide a wide range of
functionality for various use cases, making them an essential tool in
functional programming with Java streams.
