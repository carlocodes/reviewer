package com.carlocodes.reviewer.service.fundamentals.data_type;

import java.math.BigDecimal;

public class DataTypeService {
    public void myMethod() {
        // This is declaration
        int x;
        // This is initialization
        x = 1;

        // Reference data types can hold null values
        // Primitive data types cannot hold null values
        BigDecimal myBigDecimal = null;

        // Instantiation is usually used when referring to reference data types
        // Because reference data types deal with classes/objects
        // Instantiation is the process of creating a new instance of a class/object
        String myString = "Hello World!";
        System.out.println("String length: " + myString.length());
    }

    public static void main(String[] args) {
        DataTypeService dataTypeService = new DataTypeService();
        dataTypeService.myMethod();
    }
}
