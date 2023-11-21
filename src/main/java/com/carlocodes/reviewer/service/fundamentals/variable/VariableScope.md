# Variable Scope

1. **Local Variables:**
   - **Scope:** Local variables are declared within a
   specific code block, typically inside a method,
   constructor, or block of code (e.g., within curly
   braces `'{}'`).
   - **Lifetime:** They exist only within the scope
   in which they are declared and are destroyed when
   that scope is exited.
   - **Accessibility:** Local variables are only
   accessible within the method or block of code where
   they are defined.

**Example of Local Variable:**
```
    public class LocalVariableExample {
        public void doSomething() {
            int local_variable = 42;
            // Declaration and initialization
            // of a local variable
            System.out.println("Local Variable: " +
            local_variable);
        }
        
        public static void main(String[] args) {
            LocalVariableExample localVariableExample
            = new LocalVariableExample();
            localVariableExample.doSomething();
            // Accessing the local variable within
            // the method
            // local_variable is not accessible
            // here; it's out of scope
        }
    }
```
In this example, `'local_variable'` is a local
variable declared within the `'doSomething()'` method.
It is accessible only within that method and ceases
to exist once the method finishes execution.

2. **Instance Variables (Member Variables):**
   - **Scope:** Instance variables are declared 
   within a class but outside any method, constructor,
   or block.
   - **Lifetime:** They exist as long as the instance
   of the class (object) exists. Each instance (object)
   of the class has its own set of instance variables.
   - **Accessibility:** Instance variables are
   accessible from any method or constructor within
   the class, using an instance of the class.

**Example of Instance Variable:**
```
public class InstanceVariableExample {
    int instance_variable;
    // Declaration of an instance variable
    
    public void setInstanceVariable(int value) {
        instance_variable = value;
        // Accessing and modifying the instance
        variable
    }
    
    public void printInstanceVariable() {
        System.out.println("Instance Variable: " +
        instance_variable);
    }
    
    public static void main(String[] args) {
        InstanceVariableExample ive1
        = new InstanceVariableExample();
        InstanceVariableExample ive2
        = new InstanceVariableExample();
        
        ive1.setInstanceVariable(10);
        ive2.setInstanceVariable(20);
        
        ive1.printInstanceVariable();
        // Accessing instance variable from instance 1
        ive2.printInstanceVariable();
        // Accessing instance variable from instanve 2
    }
}
```
In this example, `'instance_variable'` is an instance
variable. Each instance of the `'InstanceVariableExample'`
class has its own copy of this variable.

3. **Class Variables (Static Variables):**
   - **Scope:** Class variables are declared within a
   class but are marked as `'static'`, meaning they
   belong to the class itself rather than any specific
   instance of the class.
   - **Lifetime:** They exist as long as the class
   is loaded in memory and shared among all instances
   of the class.
   - **Accessibility:** Class variables are accessible
   using the class name, and they are shared among
   all instances of the class.

**Example of Class Variable:**
```
    public class ClassVariablesExample {
        static int class_variable;
        // Declaration of a class variable
        
        public static void incrementClassVaraible() {
            class_variable++;
            // Accessing and modifying the
            // class variable
        }
        
        public static void printClassVariable() {
            System.out.println("Class Variable: " +
            class_variable);
        }
        
        public static void main(String[] args) {
            ClassVariableExample
                .incrementClassVariable();
            ClassVariableExample
                .incrememntClassVariable();
                
            ClassVariableExample
                .printClassVariableExample();
            // Accessing the class variable
        }
    }
```
