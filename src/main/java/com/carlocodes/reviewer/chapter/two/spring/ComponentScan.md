# Component Scan

Component scanning is a feature provided by the Spring Framework that
automatically discovers and registers Spring beans (components) in the
application context without explicitly configuring them.

### How it works:

- Spring scans the specified packages in the application to find classes
annotated with stereotype annotations such as `'@Component'`, `'@Service'`,
`'@Repository'`, and `'@Controller'`.

- When Spring finds a class with one of these annotations, it automatically
registers it as a bean in the application context.

### Where is Component Scan used?

1. Spring Configuration Classes:

- In Java-based configuration, you often use `'@Configuration'` classes to
define your Spring beans. Component scan is commonly used in these classes
to automatically register components.

```
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // Configuration and other bean definitions
}
```

2. Spring Boot Applications:

- In Spring Boot applications, component scanning is a default behavior.
The main application class is annotated with `'@SpringBootApplication'`,
which implicitly includes `'@ComponentScan'`.

```
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
```

3. XML Configuration:

- In XML-based configuration, you can use the `'<context:component-scan>'`
element to achieve component scanning.

```
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd
                           http://www.springframework.org/schema/context
                           http://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="com.example" />

    <!-- Other bean definitions -->
</beans>
```

### Why Component Scan?

1. Automatic Bean Registration:

- Component scan eliminates all the need for explicit bean registration.
Spring automatically detects and registers beans based on classpath
scanning.

2. Reduced Configuration:

- Component scan reduces configuration overhead by allowing the framework
to discover and manage beans automatically.

3. Simplified Development:

- Developers can focus on writing business logic without being concerned
about manually registering every bean. This simplifies the development
process.

4. Convention over Configuration:

- Component scanning follows the principle of "Convention over Configuration"
promoting sensible defaults based on conventions rather than requiring
explicit configuration for every bean.

5. Encourages consistent naming conventions:

- It encourages consistent naming conventions for components annotated with
stereotypes, making the codebase more readable and maintainable.

### Component Scan Best Practices:

1. Package Structure:

- Organize your codebase with a clear package structure to facilitate
effective component scanning. Group related components in packages.

2. Limit Scanning Scope:

- Specify the base package/s for scanning to avoid unnecessary classes
and packages, improving performance.

```
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // Configuration and other bean definitions
}
```

3. Stereotype Annotations:

- Annotate your classes with the appropriate stereotype annotations
(`'@Component'`, `'@Service'`, `'@Repository'`, `'@Controller'`) to guide
the component scanning process.

4. Component Filter:

- Use component filters if you need more fine-grained control over which
classes are scanned and registered as beans.

```
@ComponentScan(basePackages = "com.example", includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyCustomAnnotation.class))
public class AppConfig {
    // Configuration and other bean definitions
}
```

In summary, component scanning in Spring is a powerful feature that
automates the process of discovering and registering beans in the
application context. It promotes a convention-over-configuration approach,
reducing the need for explicit bean registration and simplifying the
development process. It's widely used in Spring applications, especially
in Spring Boot, to facilitate the development of clean, modular, and
maintainable codebases.
