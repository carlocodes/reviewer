package com.carlocodes.reviewer.chapter.two.memory_management;

public class MemoryManagement {
    public static void main(String[] args) {
        memoryManagementExample();
    }

    public static void memoryManagementExample() {
        SampleObject sampleObject = new SampleObject();
        // Some logic here

        // sampleObject variable reference is stored on the stack
        // SampleObject (instance) is stored on the heap

        // When memoryManagementExample method finishes execution
        // Stack frame is popped, reference to the sampleObject becomes out of scope
        // The SampleObject instance is then made eligible for garbage collection
        System.out.println("End of method execution!");
    }
}
