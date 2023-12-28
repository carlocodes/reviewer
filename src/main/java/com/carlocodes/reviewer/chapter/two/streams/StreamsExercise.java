package com.carlocodes.reviewer.chapter.two.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExercise {
    public static void main(String[] args) {
        mappingInitials();
    }

    // Collecting

    // Question #1
    // Group and count
    // Initial Data: List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
    // Expected Result: A Map<Integer, Long> where keys are the lengths of the words and values are the count of words with each length.
    public static void collectingGroupAndCount() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
        Map<Integer, Long> groupedAndCounted = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(groupedAndCounted);
    }

    // Question #2
    // Custom Collector
    // Initial Data: List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
    // Expected Result: A String that concatenates all the words with commas between them.
    public static void collectingCustomCollector() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
        String concatenated = String.join(", ", words);
        System.out.println(concatenated);
    }

    // Question #3
    // Partitioning by Predicate
    // Initial Data: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Expected Result: A Map<Boolean, List<Integer>> where true corresponds to even numbers and false corresponds to odd numbers.
    public static void collectingPartitioningByPredicate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> evenAndOdd = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(evenAndOdd);
    }

    // Filtering

    // Question #1
    // Prime Numbers
    // Initial Data: List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 8, 11, 13, 16, 17, 19, 23);
    // Expected Result: A List<Integer> containing only prime numbers.
    public static void filteringPrimeNumbers() {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 8, 11, 13, 16, 17, 19, 23);
        List<Integer> primeNumbers = numbers.stream()
                .filter(StreamsExercise::isPrime)
                .collect(Collectors.toList());
        System.out.println("Prime Numbers: " + primeNumbers);
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(divisor -> number % divisor == 0);
    }

    // Question #2
    // Non-empty Strings
    // Initial Data: List<String> strings = Arrays.asList("", "apple", "", "kiwi", "banana", "", "orange");
    // Expected Result: A List<String> containing only non-empty strings.
    public static void filteringNonEmptyStrings() {
        List<String> strings = Arrays.asList("", "apple", "", "kiwi", "banana", "", "orange");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonEmptyStrings);
    }

    // Question #3
    // Adults Only
    // Initial Data: List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 17), new Person("Charlie", 32));
    // Expected Result: A List<Person> containing only persons who are 18 years or older.
    public static void filteringAdultsOnly() {
        List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 17), new Person("Charlie", 32));
        List<Person> adults = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .collect(Collectors.toList());
        System.out.println(adults);
    }

    // Reducing

    // Question #1
    // Sum of Squares
    // Initial Data: List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    // Expected Result: An Integer representing the sum of the squares of the numbers.
    public static void reducingSumOfSquares() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(sumOfSquares);
    }

    // Question #2
    // Concatenate Strings
    // Initial Data: List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
    // Expected Result: A String that concatenates all the strings.
    public static void reducingConcatenateStrings() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");
        String string = strings.stream()
                .reduce("", String::concat);
        System.out.println(string);
    }

    // Question #3
    // Maximum Element
    // Initial Data: List<Integer> numbers = Arrays.asList(7, 12, 3, 8, 5);
    // Expected Result: An Integer representing the maximum element in the list.
    public static void reducingMaximumElement() {
        List<Integer> numbers = Arrays.asList(7, 12, 3, 8, 5);
        Optional<Integer> maximumElement = numbers.stream()
                .reduce(Integer::max);
        maximumElement.ifPresent(System.out::println);
    }

    // Mapping

    // Question #1
    // Uppercase Strings
    // Initial Data: List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
    // Expected Result: A List<String> containing the uppercase versions of the words.
    public static void mappingUppercaseStrings() {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "grape", "melon");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }

    // Question #2
    // Square Roots
    // Initial Data: List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0, 25.0, 36.0);
    // Expected Result: A List<Double> containing the square roots of the numbers.
    public static void mappingSquareRoots() {
        List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0, 25.0, 36.0);
        List<Double> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
    }

    // Question #3
    // Initials
    // Initial Data: List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    // Expected Result: A List<String> containing the initials of the names.
    public static void mappingInitials() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> initialsOfNames = names.stream()
                .map(n -> String.valueOf(n.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(initialsOfNames);
        names.forEach(s -> System.out.println("Hello, " + s));
    }
}
