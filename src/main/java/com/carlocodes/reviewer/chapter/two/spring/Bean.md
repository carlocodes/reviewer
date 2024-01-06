# Bean

In Spring, a "bean" is a fundamental building block and a managed object within the Spring
IoC container. A bean represents an object that is instantiated, assembled, and managed by
the Spring IoC container. Beans are configured using metadata, and the container is responsible
for their lifecycle, including creation, initialization, and destruction.

### Key Characteristics of Beans in Spring:

1. Management Objects:
Beans are objects managed by the Spring IoC container. The container is responsible for
creating and configuring these objects.

2. Configurable:
Beans are configured in the Spring configuration, which can be defined using XML configuration
files, Java-based configuration classes, or annotations.

3. Lifecycles:
Beans go through various lifecycle phases, including instantiation, initialization (optional),
and destruction (optional). The container manages these phases.

4. Dependency Injection:
Beans often have dependencies on other beans, and the Spring IoC container injects these
dependencies during bean creation. This is known as dependency injection.

5. Scopes:
Beans can have different scopes, defining the lifecycle and visibility of the bean. Common
scopes include singleton, prototype, request, session, etc.

### Why Beans in Spring:

1. Modularity:
Beans promote modularity by encapsulating functionality into manageable and reusable
components.

2. Dependency Management:
Beans facilitate loose coupling by relying on dependency injection to obtain their
dependencies. This makes it easier to manage and test individual components.

3. Lifecycle Management:
Spring manages the lifecycle of beans, ensuring proper initialization and cleanup. This
simplifies resource management and avoids memory leaks.

4. Configuration:
Beans are configured externally, allowing for easy modification without changing the source
code. This supports the principle of separation of concerns.

5. Aspect-Oriented Programming (AOP):
AOP is facilitated through beans, allowing you to modularize cross-cutting concerns such as
logging, security, and transaction management.

### Example of a Bean and its usage:

Let's consider a simple example of a `'Car'` bean:
```
public class Car {
    private String brand;
    private String model;
    
    // Constructors, getters, and setters
    
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + "]";
    }
}
```

Now let's configure and use this `'Car'` bean in a Spring application. We'll use Java-based
configuration:
```
@Configuration
public class AppConfig {
    @Bean
    public Car car() {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Camry");
        return car;
    }
}
```

In this example:

- The `'Car'` class is a simple Java class representing a car.
- The `'AppConfig'` class is annotated with `'@Configuration'`, indicating that it contains
bean definitions.
- The `'car()'` method is annotated with `'@Bean'`, indicating that it produces a bean of
type `'Car'`.

Now, let's use the configured `'Car'` bean in another component:
```
@Service
public class CarService {
    private final Car car;
    
    @Autowired
    public CarService(Car car) {
        this.car = car;
    }
    
    public void displayCarInfo() {
        System.out.println("Car Information: " + car);
    }
}
```

In this example:

- The `'CarService'` class is annotated with the `'@Service'`, indicating that it is a Spring
service component.
- The `'Car'` bean is injected into the `'CarService'` using constructor injection.

When the Spring IoC container initializes, it creates and manages the `'Car'` bean based on
the configuration in the `'AppConfig'`. When the `'CarService'` is created, the `'Car'` bean
is injected, and the `'displayCarInfo()'` method can access and use the configured `'Car'`
instance.

```
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Retrieve the CarService bean from the context
        CarService carService = context.getBean(CarService.class);
        
        // Call a method that uses the Car bean
        carService.displayCarInfo();
    }
}
```
In this main application, the Spring IoC container is initialized with the `'AppConfig'`
configuration class. It retrieves the `'CarService'` bean from the context, and when the
`'displayCarInfo()'` method is called, it prints the information of the injected `'Car'`
bean.

This example illustrates the concept of beans in Spring, where objects are managed,
configured, and injected by the Spring IoC container to promoted modularity and
maintainability in a Spring application.

