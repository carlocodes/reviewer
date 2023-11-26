package com.carlocodes.reviewer.service.fundamentals.variable;

import com.carlocodes.reviewer.service.fundamentals.access_modifier.ProtectedService;

public class VariableService extends ProtectedService {
    int instance_variable;
    static int class_variable = 1;

    public void localVariable() {
        int local_variable = 1;
        System.out.println("Local Variable: " + local_variable);
    }

    public void instanceVariable(int value) {
        instance_variable = value;
        System.out.println("Instance Variable: " + instance_variable);
    }

    public void updateClassVariable() {
        class_variable++;
        System.out.println("Updated Class Variable: " + class_variable);
    }

    public void classVariable() {
        System.out.println("Class Variable: " + class_variable);
    }

    public void callProtectedMethods() {
        protectedVariable = 10;
        System.out.println("Protected Variable: " + protectedVariable);
        protectedMethod();
    }

    public static void main(String[] args) {
        VariableService vs1 = new VariableService();
        vs1.localVariable();
        vs1.instanceVariable(1);
        vs1.updateClassVariable();

        VariableService vs2 = new VariableService();
        vs2.classVariable();
        vs2.callProtectedMethods();
    }
}
