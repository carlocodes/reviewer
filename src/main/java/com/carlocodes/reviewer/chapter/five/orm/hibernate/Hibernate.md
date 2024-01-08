# Hibernate

Hibernate is a powerful and widely used Object-Relational Mapping (ORM) framework for Java. It
provides a framework for mapping Java objects to database tables and vice versa, making it
easier for developers to interact with relational databases using Java objects. Hibernate is
an open-source project and is part of the larger Java ecosystem.

### Key concepts in Hibernate:

1. Entity Classes:

- In Hibernate, entity classes represent Java objects that are mapped to database tables.
These classes are annotated with Hibernate annotations to define the mapping details.
```
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;
    // other fields, getters, and setters
}
```

2. Hibernate Session:

- The `'Session'` is a fundamental concept in Hibernate. It represents a single-threaded,
short-lived object representing a conversation between the application and the database.
The `'Session'` is used to perform CRUD (Create, Read, Update, Delete) operations on entities.
```
Session session = sessionFactory.openSession();
Transaction transaction = session.beginTransaction();

Employee employee = new Employee("John Doe", "Developer");
session.save(employee);

transaction.commit();
session.close();
```

3. SessionFactory:

- The `'SessionFactory'` is a thread-safe, immutable cache of compiled mappings for a
database. It is used to create `'Session'` instances. The `'SessionFactory'` is typically
created once during application initialization.
```
SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
```

4. Hibernate Query Language (HQL)

- HQL is a powerful and flexible query language provided by Hibernate. It allows developers
to write database queries in an object-oriented manner, using entity names and properties
rather than SQL tables and columns.
```
Query query = session.createQuery("FROM Employee WHERE position = :position");
query.setParameter("position", "Developer");
List<Employee> developers = query.list();
```

5. Criteria API:

- Hibernate provides a Criteria API that allows developers to create queries using a
programmatic and type-safe approach. This API is particularly useful for building dynamic
queries.
```
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);
Root<Employee> root = criteria.from(Employee.class);
criteria.select(root).where(builder.equal(root.get("position"), "Developer"));
List<Employee> developers = session.createQuery(criteria).list();
```

6. Lazy Loading:

- Hibernate supports lazy loading, which defers the loading of associated entities until
they are explicitly accessed. Eager loading, on the other hand, loads the associated entities
along with the main entity.
```
@Entity
public class Order {
    // ...

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> items;
    // ...
}
```
