# Dependency Injection

Dependency Injection (DI) is a design pattern and a fundamental concept in the Spring
Framework. In DI, the dependencies of a class are injected from the outside, rather than
being created or managed by the class itself. The Spring IoC (Inversion of Control) container
is responsible for managing and injecting these dependencies into the dependent objects,
promoting loose coupling and modular design.

### How Dependency Injection works in Spring:

In Spring, DI is typically achieved through various mechanisms, including constructor
injection, setter injection, and method injection. The Spring IoC container takes care of
wiring the dependencies when creating and configuring beans.

1. Constructor Injection:
   Dependencies are injected through the constructor of the dependent class. This is the most
   common and recommended form of DI.
```
public class CarService {
    private final Engine engine;
    
    public CarService(Engine engine) {
        this.engine = engine;
    }
    
    // ...
}
```

2. Setter Injection:
   Dependencies are injected through setter methods of the dependent class.
```
public class CarService {
    private Engine engine;
    
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    // ...
}
```

3. Method Injection:
   Dependencies are injected through methods of the dependent class.
```
public class CarService {
    public void performService(Engine engine) {
        // Use the injected instance
        // ...
    }
    
    // ...
}
```

### When is Dependency Injection used:

Dependency Injection is used in scenarios where:

- You want to achieve loose coupling between components.
- You want to improve testability by easily substituting real implementations with mock
  objects during unit testing.
- You want to enhance the maintainability by separating the construction and configuration of
  objects from their actual use.

### Why do we need dependency injection:

1. Loose Coupling:
   DI promotes loose coupling between components, making it easier to modify, replace, or extend
   individual components without affecting the entire system.

2. Testability:
   DI facilitates unit testing by allowing you to inject mock or test implementations of
   dependencies. This helps in isolating and testing components in isolation.

3. Flexibility and Configurability:
   DI allows you to configure and change the behavior of your application by injecting different
   implementations of dependencies at runtime.

4. Promotes Modular Design:
   DI encourages modular design by breaking down a system into smaller, more manageable
   components. Each component focuses on a specific functionality, and dependencies are injected
   from the outside.

### Example of Dependency Injection in action:

Let's consider a simple example involving a `'CarService'` that depends on an `'Engine'`. The
`'Engine'` can be injected into the `'CarService'` through constructor injection.
```
public class Engine {
    public void start() {
        System.out.println("Engine Started");
    }
}

public class CarService {
    private final Engine engine;
    
    public CarService(Engine engine) {
        this.engine = engine;
    }
    
    public void performService() {
        engine.start();
        // Other service logic
    }
}
```

Now, let's configure these classes as beans in a Spring application context:
```
@Configuration
public class AppConfig {
    @Bean
    public Engine engine() {
        return new Engine();
    }
    
    @Bean
    public CarService carService(Engine engine) {
        return new CarService(engine);
    }
}
```

In this configuration:

- The `'Engine'` is configured as a bean using the `'@Bean'` annotation.
- The `'CarService'` is configured as a bean, and the `'Engine'` dependency is injected
  through the constructor.

When the Spring IoC container initializes, it creates and manages instances of `'Engine'`
and `'CarService'`. The `'Engine'` instance is injected into the `'CarService'`, and you
can call methods on `'CarService'` without worrying about how the `'Engine'` is created or
obtained.

```
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = AnnotationConfigApplicationContext(AppConfig.class);
        
        // Retrieve the CarService bean from the context
        CarService carService = context.getBean(CarService.class);
        
        // Call a method that uses the injected Engine dependency
        carService.performService();
    }
}
```

In this example, the `'CarService'` bean is retrieved from the Spring context, and when
`'performService()'` is called, it invokes the `'start()'` method on the injected `'Engine'`
dependency. The dependencies are injected at runtime, promoting loose coupling and making it
easy to replace or modify components without changing the source code of the dependent
classes.
