package com.carlocodes.reviewer.service.boxing_unboxing;

public class BoxingService {
    public void myMethod() {
        int x = 1;
        System.out.println("Primitive Data Type Value: " + x);
        Integer y = x;
        System.out.println("Reference Data Type Value: " + y);
    }

    public static void main(String[] args) {
        BoxingService boxingService = new BoxingService();
        boxingService.myMethod();
    }
}
