package com.carlocodes.reviewer.service.my_static;

public class StaticService {
    static int z = 1;
    static {
        System.out.println("Performing one-time initialization...");
        System.out.println("Activity complete!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = StaticService.add(1, 2);
        System.out.println("Result: " + x);
    }
}
