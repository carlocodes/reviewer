package com.carlocodes.reviewer.service.access_modifier;

public class ProtectedService {
    protected static int protectedVariable;

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
