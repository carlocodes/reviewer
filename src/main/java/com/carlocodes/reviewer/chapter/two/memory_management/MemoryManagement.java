package com.carlocodes.reviewer.chapter.two.memory_management;

public class MemoryManagement {
    public static void main(String[] args) {
        memoryManagementExample();
    }

    public static void memoryManagementExample() {
        SampleClass object = new SampleClass();
        // Some logic here

        // object variable reference is stored on the stack
        // object (instance) is stored on the heap

        // When memoryManagementExample method finishes execution
        // Stack frame is popped, reference to the object becomes out of scope
        // The SampleClass instance is then made eligible for garbage collection
        System.out.println("End of method execution!");
    }
}