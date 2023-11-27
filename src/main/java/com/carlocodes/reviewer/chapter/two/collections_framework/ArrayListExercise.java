package com.carlocodes.reviewer.chapter.two.collections_framework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayListExercise {
    public static void main(String[] args) {
        printAllElementsUsingTheirIndex();
    }

    public static void createArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        System.out.println(colors);
    }

    public static void iterateThroughElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        for (String color : colors) {
            System.out.println("Color: " + color + " Index: " + colors.indexOf(color));
        }
    }

    public static void setElementInFirstPosition() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.set(0, "Gold");

        System.out.println(colors);
    }

    public static void getElementFromIndex(int index) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        int size = colors.size();

        if (index > -1 && index < size) {
            System.out.println(colors.get(index));
        } else {
            System.out.println("Error!");
        }
    }

    public static void updateElement(int index, String color) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.set(index, color);

        System.out.println(colors);
    }

    public static void removeThirdElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.remove(2);

        System.out.println(colors);
    }

    public static void searchForElement(String color) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        if (colors.contains(color)) {
            System.out.println("Color: " + color + "is in the list.");
        } else {
            System.out.println("Error!");
        }
    }

    public static void sortArrayListString() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        Collections.sort(colors);

        System.out.println(colors);
    }

    public static void sortArrayListInt() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(1);

        Collections.sort(integers);

        System.out.println(integers);
    }

    public static void sortArrayListLong() {
        List<Long> longs = new ArrayList<>();
        longs.add(2L);
        longs.add(3L);
        longs.add(1L);

        Collections.sort(longs);

        System.out.println(longs);
    }

    public static void sortArrayListBigDecimal() {
        List<BigDecimal> bigDecimals = new ArrayList<>();
        bigDecimals.add(BigDecimal.valueOf(3.12));
        bigDecimals.add(BigDecimal.valueOf(23.12));
        bigDecimals.add(BigDecimal.valueOf(2.31));

        Collections.sort(bigDecimals);

        System.out.println(bigDecimals);
    }

    public static void copyOneArrayToAnother() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        List<String> mgaKulay = new ArrayList<>();
        Collections.copy(mgaKulay, colors);

        System.out.println(mgaKulay);
    }

    public static void shuffleElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        Collections.shuffle(colors);

        System.out.println(colors);
    }

    public static void reverseElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        Collections.reverse(colors);

        System.out.println(colors);
    }

    public static void extractPortionOfArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("Blue");

        System.out.println("Sublist: " + colors.subList(0, 2));
    }

    public static void comparetTwoArrayLists() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        List<String> mgaKulay = new ArrayList<>();
        mgaKulay.add("Pink");
        mgaKulay.add("Blue");
        mgaKulay.add("Green");

        // Collections.disjoint - maybe can use
        if (Objects.equals(colors, mgaKulay)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public static void swapElements() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        Collections.swap(colors, 0, 1);
    }

    public static void joinArrays() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        List<String> mgaKulay = new ArrayList<>();
        mgaKulay.add("Pink");
        mgaKulay.add("Blue");
        mgaKulay.add("Green");

        List<String> joined = new ArrayList<>();
        joined.addAll(colors);
        joined.addAll(mgaKulay);

        System.out.println(joined);
    }

    public static void cloneArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        List<String> clone = new ArrayList<>(colors);

        System.out.println(clone);
    }

    public static void emptyArrayList() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.clear();

        System.out.println(colors);
    }

    public static void checkIfArrayListIsEmpty() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        System.out.println(colors);
        colors.clear();
        System.out.println(colors);

        if (colors.isEmpty()) {
            System.out.println("Empty!");
        } else {
            System.out.println("Not empty!");
        }
    }

    public static void increaseSizeOfArrayList() {
        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.ensureCapacity(4);
        colors.add("Pink");

        System.out.println(colors);
    }

    public static void trimCapacityOfArrayList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.trimToSize();

        System.out.println(colors);
    }

    public static void replaceSecondElement() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        colors.set(1, "Brown");

        System.out.println(colors);
    }

    public static void printAllElementsUsingTheirIndex() {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Purple");

        int size = colors.size();

        for (int i = 0; size >= i; i++) {
            System.out.println("Index: " + i + " Color: " + colors.get(i));
        }
    }
}
