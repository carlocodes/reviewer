package com.carlocodes.reviewer.service.fundamentals.exceptions;

public class ExceptionService {
    public static void main(String args[]) throws Exception {
        firstBusinessLogic();
    }

    public static void firstBusinessLogic() throws Exception {
        // some operations
        System.out.println("First business logic method reached");
        secondBusinessLogic();
        int[] arr = null;
    }

    public static void secondBusinessLogic() throws Exception {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            System.out.println("An error occurred due to " + errorMessage);
            throw new Exception(String.format("An error occurred due to %s", e.getMessage()), e);
        }
    }
}
