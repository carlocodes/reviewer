package com.carlocodes.reviewer.service.fundamentals.access_modifier;

class DefaultService {
    int defaultVariable = 1;

    void defaultMethod() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DefaultService defaultService = new DefaultService();
        defaultService.defaultVariable = 2;
        System.out.println("Default Variable: " + defaultService.defaultVariable);
        defaultService.defaultMethod();
    }
}
