package com.carlocodes.reviewer.chapter.one.my_class;

public class NewClassService {
    private ClassService classService;

    public NewClassService(ClassService classService) {
        this.classService = classService;
    }

    private void myMethod() {
        int a = classService.a;
    }
}
