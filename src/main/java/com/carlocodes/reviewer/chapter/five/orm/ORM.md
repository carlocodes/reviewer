# Object Relational Mapping

Object Relational Mapping (ORM) is a programming paradigm that facilitates the interaction
between a relational database and an object-oriented programming language. It provides a
mechanism to map the structure and behavior of objects in the programming language to the
data representation in a relational database, allowing developers to work with objects in
their code while abstracting away the complexities of database interactions.

In the case of Java, ORM frameworks automate the process of converting data between Java
objects and relational database tables. This mapping is typically done using metadata, such
as annotations or XML configurations, to define the relationships between Java classes and
database tables.

### How does ORM work?

ORM frameworks, including those in Java, work by establishing a mapping between the objects
in your code and the tables in a relational database. Here are key components and concepts
of how ORM works:

1. Entity Classes:

- In ORM, entity classes represent objects in your code that map to records in a database
table. These classes are annotated with metadata that specifies how they relate to the
database.
```
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private double price;
    // other fields, getters, and setters
}
```

2. Mapping Metadata:

- Metadata annotations or configuration files are used to specify the mapping between entity
classes and database tables. Annotations like `'@Entity'`, `'@Table'`, `'@Column'`, and
others provide information about how fields in the class map to columns in the database.
```
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "product_name");
    private String name;
    
    @Column(name = "product_price");
    private double price;
    // other fields, getters, and setters
}
```

3. ORM Frameworks:

- In Java, there are several ORM frameworks, such as Hibernate, EclipseLink, and MyBatis,
that automate the process of mapping Java objects to database tables. These frameworks
provide APIs for interacting with the database using object-oriented concepts.

4. CRUD Operations:

- ORM frameworks allow developers to perform CRUD (Create, Read, Update, Delete) operations
on objects in a way that abstracts the underlying SQL. For example, saving an object to the
database might be as simple as calling a `'save'` method on an entity manager.
```
Product product = new Product("Laptop", 999.99);
entityManager.getTransaction().begin();
entityManager.persist(product);
entityManager.getTransaction().commit();
```

5. Lazy Loading and Eager Loading:

- ORM frameworks often provide mechanisms for controlling how data is loaded from the
database. Lazy loading allows loading data only when explicitly requested, while eager
loading loads related data along with the main entity.
```
@Entity
public class Order {
    // ...
    
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> items;
    // ...
}
```

### Where is ORM used?

ORM is widely used in various scenarios, especially in applications where an object-oriented
programming language like Java is used in conjunction with relational databases. Common use
cases include:

1. Enterprise Applications:

- ORM is prevalent in enterprise-level applications where complex data models and
relationships need to be managed. It is often used in conjunction with Java EE or Jakarta EE
technologies.

2. Web Development:

- Web applications, especially those built using Java frameworks like Spring, commonly use
ORM to simplify data access. ORM frameworks integrate seamlessly with web frameworks, making
it easier to manage and manipulate data.

3. Microservices Architecture:

- In microservices architectures, where multiple services interact with databases, ORM can
streamline data access across different services. Each microservice can use its own set of
entity classes mapped to database tables.

4. Object-Oriented Systems:

- ORM is particularly beneficial in systems where the primary programming paradigm is
object-oriented. It aligns well with the principles of encapsulation, inheritance, and
polymorphism, allowing developers to work with objects rather than SQL.

### Why do we have ORM? What problems does it solve?

ORM addresses several challenges and complexities associates with traditional database
interactions using SQL and JDBC. Here are key reasons why ORM is valuable:

1. Object-Relational Mismatch:

- Databases use a tabular structure, while object-oriented programming languages use a
hierarchical structure. ORM bridges the gap between these two models, allowing developers to
work with objects in their code while storing data in relational databases.

2. Reduced Boilerplate Code:

- ORM frameworks automate the generation of SQL queries, reducing the need for developers
to write extensive boilerplate code for data access. This leads to more concise and
maintainable code.

3. Increased Productivity:

- By abstracting away the details of database interactions, ORM increases developer
productivity. Developers can focus more on application logic and less on the intricacies
of applications across different environments.

4. Portability:

- ORM frameworks provide a level of abstraction, making it easier to switch between
different database vendors without significant code changes. This enhances the portability
of applications across different environments.

5. Complex Query Handling:

- ORM frameworks often include query languages, such as HQL (Hibernate Query Language) in
Hibernate, which provide a higher-level, object-oriented approach to querying data. This
simplifies complex query scenarios.
```
Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.price > :price");
query.setParameter("price", 500.0);
List<Product> expensiveProducts = query.getResultList();
```

6. Transaction Management:

- ORM frameworks often integrate with transaction management mechanisms, ensuring that
database operations are atomic and consistent within a transaction.

### Best Practices for using ORM in Java:

1. Understand Your Data Model:

- Have a clear understanding of your data model and relationships. Map your Java entities
to database tables accordingly, considering primary keys, foreign keys, and other
constraints.

2. Efficient Use of Fetch Types:

- Choose the appropriate fetch type (eager or lazy) based on your application's needs. Lazy
loading can help optimize performance by loading data only when required.

3. Optimistic Locking:

- Implement optimistic locking, especially in multi-user environments, to prevent conflicts
during concurrent updates. Use versioning mechanisms provided by ORM framework.
```
@Entity
public class Product {
    // ...
    
    @Version
    private int version;
    // ...
}
```

4. Avoid N+1 Query Problem:

- Be cautious of the N+1 query problem, where accessing a collection of entities results in
multiple database queries. Use fetching strategies or join fetches to minimize the number
of queries.
```
@Entity
public class Order {
    // ...
    
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> items;
    // ..
}
```

5. Transaction Boundaries:

- Clearly define transaction boundaries to ensure consistency in your data operations. Use
`'@Transactional'` annotations or explicit transaction management.
```
@Transactional
public void processOrder(Order order) {
    // perform data operations
}
```

6. Regularly Monitor and Optimize Queries:

- Regularly monitor the generated SQL queries and optimize them as needed. ORM frameworks
often provide tools and logging mechanisms for analyzing query performance.

7. Testing Strategies:

- Develop effective testing strategies for you data access layer. Use in-memory database
or test containers to create controlled environment for testing.
```
@DataJpaTest
public class ProductRepositoryTest {
    // ...
}
```

By following these best practices, you can effectively leverage ORM in Java to build
scalable, maintainable, and efficient applications with streamlined data access
capabilities.
