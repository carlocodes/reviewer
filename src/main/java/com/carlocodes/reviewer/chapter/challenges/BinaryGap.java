package com.carlocodes.reviewer.chapter.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(32));
    }

    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);

        List<String> zeros = Arrays.stream(binaryString.split("(?<=1)(0+)(?=1)"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Zeros: " + zeros);

        return Arrays.stream(binaryString.split("1+"))
                .filter(s -> !s.isEmpty())
                .map(String::length)
                .reduce(0, Integer::max);
    }
}
