package com.carlocodes.reviewer.chapter.two.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
//        immutableList();
//        wordsToUppercaseWords();
//        integersToTheirSquares();
//        flattenLists();
//        sumOfFlattenedIntegers();
        findTheProduct();
    }

    public static void immutableList() {
        List<String> immutableList = List.of("Test", "List");

        System.out.println(immutableList);

        immutableList.add("New");

        System.out.println(immutableList);
    }

    public static void wordsToUppercaseWords() {
        List<String> words = Arrays.asList("hello", "world", "java");
        System.out.println(words);

        List<String> uppercaseWords = words.stream()
                .map(w -> w.toUpperCase())
//                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }

    public static void integersToTheirSquares() {
        List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);

        List<Integer> numbersToTheirSquares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(numbersToTheirSquares);
    }

    public static void flattenLists() {
        List<List<String>> nestedLists = Arrays.asList(
                Arrays.asList("apple", "orange"),
                Arrays.asList("banana", "grape"),
                Arrays.asList("cherry", "pear")
        );
        System.out.println(nestedLists);

        List<String> flatList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
    }

    public static void sumOfFlattenedIntegers() {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4)
        );
        System.out.println(nestedLists);

        Integer sumOfFlattenedListOfIntegers = nestedLists.stream()
                .flatMap(List::stream)
                .reduce(0, Integer::sum);
        System.out.println(sumOfFlattenedListOfIntegers);
    }

    public static void flatIntegers() throws Exception {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 6),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4)
        );

        Optional<Integer> optional = numbers.stream()
                .flatMap(List::stream)
                .reduce(Integer::sum);

        int sum = optional.orElseThrow(() -> new Exception("error!"));
    }

    public static void findTheProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
