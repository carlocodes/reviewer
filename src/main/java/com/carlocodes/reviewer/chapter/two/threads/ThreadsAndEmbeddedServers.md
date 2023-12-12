# Threads and Embedded Servers:

### Asynchronous Task Execution:
1. Spring's Default Asynchronous Task Exeutor:
   - Spring Boot provides a default `'ThreadPoolExecutor'` for running asynchronous tasks
   when using the `'@Async'` annotation.
   - The default configuration of this task executor includes a core pool size of 8 threads
   and a maximum pool size of Integer.MAX_VALUE (essentially unbounded).

2. Thread Creation in a Thread Pool:
   - Threads in a thread pool are typically not created and initialized in advance. Instead,
   they are created on-demand as tasks are submitted for execution.
   - When a task is submitted, the thread pool checks if there's an available thread. If not,
   it may create a new thread up to the maximum pool size.
   - Once the task is completed, the thread is returned to the pool for reuse.

### Tomcat Thread Pool:

1. Tomcat and Embedded Servers:
   - Tomcat is a widely used web server and servlet container. In the context of Spring Boot,
   Tomcat is often used as an embedded server.
   - An embedded server is a server that is part of your application, and it can be started
   and stopped programmatically. It simplifies deployment by packaging the server with your
   application.

2. Default Thread Pool in Tomcat:
   - The default thread pool in Tomcat is often configured to have around 200 threads by
   default. This includes threads for handling incoming HTTP requests.
   - The threads in Tomcat's thread pool are allocated and initialized by the server based
   on its configuration.

3. Resource Allocation in JVM:
   - When Tomcat starts, the JVM allocates resources for the server, including the threads
   in its thread pool.
   - The resources for the thread pool, however, are not allocated for all 200 threads at
   once. Instead, threads are created dynamically as needed.

### Embedded Server vs External Server:

1. Embedded Server:
   - An embedded server is part of your application, and it is typically started by your
   application code.
   - In Spring Boot, this could be Tomcat, Jetty, or Undertow.
   - It simplifies deployment because you can package your application as a single executable
   JAR or WAR file.

2. External Servers (e.g., AWS):
   - In a production environment, you might deploy your Spring Boot application on external
   servers, such as those provided by cloud providers like AWS.
   - Each instance runs its own copy of your Spring Boot application, allowing you to handle
   increased traffic and distribute the load.

In summary, embedded servers in Spring Boot simplify development and deployment by packaging
the server with your application. In production, you may deploy on external servers like
those provided by AWS. Thread pools in both the embedded server and external servers are
managed by the JVM, and threads are created dynamically based on demand. Understanding these
concepts helps in optimizing your application for performance and scalability.
