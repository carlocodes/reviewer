package com.carlocodes.reviewer.chapter.two.collections_framework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExercise {
    public static void main(String[] args) {
        compareAndRetainCommonElements();
    }

    public static void appendElement() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        System.out.println(colors);
    }

    public static void iterateThroughAllElements() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        for (String element : colors) {
            System.out.println(element);
        }
    }

    public static void getNumberOfElements() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        int size = colors.size();

        System.out.println(size);
    }

    public static void empty() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        colors.clear();

        System.out.println(colors);
    }

    public static void checkIfEmpty() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        colors.clear();

        if (colors.isEmpty()) {
            System.out.println("Empty!");
        } else {
            System.out.println("Not empty!");
        }
    }

    public static void cloneHashSet() {
        HashSet<String> colors = new HashSet<>();
        colors.add("Black");

        Set<String> mgaKulay;
        mgaKulay = (HashSet) colors.clone();

        System.out.println(mgaKulay);
    }

    public static void convertToArray() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        String[] colorsArray = colors.toArray(new String[0]);

        System.out.println(colorsArray);
    }

    public static void convertToTreeSet() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        TreeSet<String> treeSet = new TreeSet<>(colors);

        System.out.println(treeSet);
    }

    public static void searchTreeSet() {
        Set<Integer> colors = new TreeSet<>();
        colors.add(1);
        colors.add(2);
        colors.add(3);

        for (Integer integer : colors) {
            if (integer < 3) {
                System.out.println(integer);
            }
        }
    }

    public static void compareSets() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");

        Set<String> mgaKulay = new HashSet<>();
        mgaKulay.add("Black");

        if (colors.equals(mgaKulay)) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not equal!");
        }
    }

    public static void compareAndRetainCommonElements() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Pink");

        Set<String> mgaKulay = new HashSet<>();
        mgaKulay.add("White");
        mgaKulay.add("Pink");

        colors.retainAll(mgaKulay);

        System.out.println(colors);
    }

    public static void removeAllElements() {
        Set<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Pink");

        colors.clear();

        System.out.println(colors);
    }
}
