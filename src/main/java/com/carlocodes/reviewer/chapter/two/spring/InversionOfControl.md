# Inversion of Control

Inversion of Control (IoC) is a fundamental concept in the Spring Framework, and it represents
a paradigm shift in how objects are created and managed in a software application.

### What is Inversion of Control (IoC)?

In traditional programming, the flow of control is determined by the program itself. The
program calls libraries or frameworks to perform specific tasks. In contrast, IoC "inverts"
this control by transferring the responsibility of managing objects and their lifecycles to
an external container. In the context of Spring, this container is the Spring IoC container.

### How does IoC work in Spring?

1. Object Creation:
Instead of creating objects using the `'new'` keyword in your application code, you delegate
the responsibility of creating objects to the Spring IoC container.

2. Object Wiring (Dependency Injection):
The IoC container is responsible for injecting the dependencies of an object. Dependencies
are defined in a configuration file or through annotations, and the container takes care of
providing the required objects at runtime.

3. Lifecycle Management:
The IoC container manages the lifecycle of objects, including their creation, initialization,
and destruction. It allows you to specify callback methods for initialization and destruction
phases.

### Why doe we have this container?

The Spring IoC container serves several purposes:

1. Decoupling:
IoC promotes loose coupling between components. Your classes are not responsible for creating
or obtaining their dependencies, making the code more modular and easier to maintain.

2. Configuration:
Objects and their relationships are typically configured in external configuration files or
through annotations, allowing for easy modification without changing the source code.

3. Testing:
IoC facilitates unit testing by allowing you to easily replace real implementations with mock
objects or test doubles. You can test components in isolation without needing the full
application context.

### How does it differ from the JVM/JRE?

- The JVM (Java Virtual Machine) and JRE (Java Runtime Environment) are responsible for
executing Java bytecode and providing the necessary runtime environment for Java applications.

- IoC, on the other hand, is a design pattern and a concept related to how objects are
created, wired, and managed in an application. The Spring IoC container acts as an additional
layer on top of the JVM, handling object creation and management.

### Does it replace the work of the JVM/JRE, or does it leverage those underlying technologies?

- IoC does not replace the JVM or JRE, it leverages the underlying technologies provided by
the JVM to execute Java applications.

- The IoC container works within the Java runtime environment and takes advantage of features
such as reflection for dynamic object creation and manipulation.

### Examples of IoC usage in Spring:

1. XML Configuration:
In XML configuration, you define beans (objects) and their dependencies in an XML file. The
Spring IoC container reads this file and creates and manages the objects accordingly.
```
<!-- XML Configuration Example -->
<beans>
    <bean id="userService" class="com.example.UserService">
        <property name="userRepository" ref="userRepository />
    </bean>
    
    <bean id="userRepository" class="com.example.UserRepository />
</beans>
```

2. Annotation-based Configuration:
Using annotations, you can mark classes as components, specify dependencies, and let the
Spring IoC container automatically detect and manage them.
```
// Annotation-based Configuration Example
@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    // ...
}
```

3. Java Configuration:
With Java-based configuration, you can use Java classes to configure the Spring IoC container.
This provides a programmatic alternative to XML or annotation-based configuration.
```
// Java Configuration Example
@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }
    
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
```

In summary, IoC in Spring involves delegating the responsibility of object creation and
management to the Spring IoC container. This promotes modularity, decoupling, and easier
testing in your Java applications. The IoC container works alongside the JVM/JRE, leveraging
their capabilities while providing additional features for object lifecycle management.
