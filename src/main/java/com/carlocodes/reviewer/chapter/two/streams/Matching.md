# Matching

In the context of Java streams, matching operations are used to check
whether elements in a stream satisfy certain conditions. There are three
primary matching operations in the Java Stream API:

1. `'.allMatch(Predicate<T> predicate)'`:
Returns `'true'` if all elements match the given predicate. Otherwise,
returns `'false'`.
```
// Example: Check if all numbers are greater than 0
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean allGreaterThanZero = numbers.stream()
                                    .allMatch(n -> n > 0);
```

2. `'.anyMatch(Predicate<T> predicate)'`:
Returns `'true'` if any of the elements match the given predicate. Otherwise,
returns `'false'`.
```
// Example: Check if any number is even
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean anyEven = numbers.stream()
                            .anyMatch(n -> n % 2 == 0);
```

3. `'.noneMatch(Predicate<T> predicate)'`:
Returns `'true'` if no elements of the stream match the given predicate.
Otherwise, returns `'false'`.
```
// Example: Check if no number is negative
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean nonNegative = numbers.stream()
                                .noneMatch(n -> n < 0);
```

### Use Cases for Streams Matching:

1. Validation:
Use matching operations to validate data according to certain criteria. For
example, checking if all elements are positive or if any element satisfies
a specific condition.
```
// Example: Validate that all email addresses are valid:
List<String> emails = Arrays.asList("user1@example.com, "invalid.email");
boolean allValidEmails = emails.stream()
                                .allMatch(e -> isValidEmail(e));
```

2. Search:
Utilize matching operations to search for specific elements in a collection.
For instance, finding out if there is any element that matches a given
search criterion.
```
// Example: Search for a book title
List<Book> books = /* ... */;
String searchTitle = "Java Programming";
boolean bookFound = books.stream()
                            .anyMatch(b -> b.getTitle.equals(searchTitle);
```

3. Conditional Processing:
Use matching operations to conditionally process elements based on certain
conditions. For example, performing an action only if all elements meet a
specific requirement.
```
// Example: Process orders only if all items are in stock
List<Order> orders = /* ... */;
boolean allInStock = orders.stream()
                            .allMatch(o -> o.getItems.stream().allMatch(Item::isInStock));

if (allInStock) {
    processOrders(orders);
}
```

4. Error Checking:
Employ matching operations for error checking, such as ensuring that no
elements violate certain constraints.
```
// Example: Check if no student has a negative GPA
List<Student> students = /* ... */;
boolean noNegativeGpa = students.stream()
                                .noneMatch(s -> s.getGpa < 0);

if (!noNegativeGpa) {
    throw new IllegalArgumentException("Invalid GPA found.");
}
```

### Appreciation for Streams Matching

1. Declarative Style:
Matching operations contribute to a more declarative style of programming,
expressing what you want to achieve rather than how to achieve it.

2. Readability:
The use of matching operations makes code more readable and expressive,
especially when dealing with conditions applied to collections.

3. Short-Circuiting:
Many matching operations in streams, like `'.allMatch()'` and `'.anyMatch()'`,
are short-circuiting. This means that they may not evaluate the entire
stream if the result can be determined early, improving performance for
large datasets.

4. Integration with Predicates:
Matching operations work seamlessly with predicates, allowing for flexible
and reusable condition checking.

In summary, matching operations in streams provide a concise and expressive
way to check conditions on elements within a collection. They are valuable
in scenarios where you need to validate, search, or perform conditional
processing based on certain criteria with a stream of data.
