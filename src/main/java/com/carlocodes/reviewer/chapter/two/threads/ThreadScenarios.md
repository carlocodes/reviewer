# Understand Threads and Thread Scenarios:

### Default Thread Configuration:
By default, without and specific configurations in the `'application.properties'` or the
`'application.yml'` file, Spring Boot applications use the default settings of the embedded
web server they are running on. Let's assume you are using Tomcat as the embedded web server
(which is common). In this case, Tomcat uses its own thread pool for handling incoming
requests. The size of this thread pool is determined by Tomcat's default settings, which can
vary between versions. Typically, it might be around 200 threads, but this is just a ballpark
figure and can be adjusted based on the specific of your application's needs.

### Asynchronous Execution:
When a method is annotated with `'@Async'` in Spring, it means that the method will be
executed asynchronously in a separate thread. The method returns immediately, and the actual
execution happens in the background. Spring uses a separate thread pool for managing
asynchronous tasks, and the default size is typically suitable for handling asynchronous
tasks.

### Scenario - Asynchronous Interest Calculation and Cash Withdrawal:

1. Asynchronous Interest Calculation:
   - At midnight, the asynchronous method for calculating customer interest is triggered.
   This method will run in a separate thread from the asynchronous task executor pool.
   - The method returns immediately, and the interest calculation continues in the background.

2. Customer Cash Withdrawal Request:
   - Simultaneously, a customer makes a request to cash out some money through the
   `'/api/v1/cash/*'` endpoint.
   - The request is handled by one of the threads from the web server's thread pool.

3. Concurrency:
   - Both the interest calculation and the cash withdrawal request are handled concurrently.
   - The asynchronous interest calculation is happening in the background, and the cash
   withdrawal request is processed by a thread from the web server's thread pool.

4. Order of Completion:
   - The order in which these operations complete depends on their individual processing
   times. If the interest calculation takes longer, the cash withdrawal request might
   complete first, or vice versa.

5. Thread Pool Adjustment:
   - By default, the number of threads in the web server's thread pool is fixed. It doesn't
   automatically increase based on demand.
   - If you expect high traffic or long-running tasks, you might need to adjust the thread
   pool size in the Tomcat configuration or consider using a more advances solution like a
   load balancer and multiple instances of your Spring Boot application.

In summary, asynchronous execution allows tasks to run in the background, freeing up threads
for handling other requests. However, the web server's thread pool size and the configuration
of the asynchronous task executor play a role in managing the concurrent requests and
background tasks. It's essential to fine-tune these configurations based on your application's
requirements and expected traffic.
