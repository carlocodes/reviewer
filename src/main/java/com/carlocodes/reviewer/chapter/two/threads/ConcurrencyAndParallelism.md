# Concurrency and Parallelism

Concurrency and parallelism are related concepts in the context of Java threads, but they
refer to different ways of achieving multiple tasks or operations.

1. Concurrency:
   - Definition:
   Concurrency is the concept where multiple tasks or processes appear to make progress
   simultaneously. It doesn't necessarily mean that they are executing at the exact same time.

   - In Java Threads:
   In the context of Java threads, concurrency is achieved by interleaving the execution of
   multiple threads. Each thread gets a time slice or a quantum to execute, and the operating
   system or the Java Virtual Machine (JVM) switches between threads, giving the appearance
   of simultaneous progress.

   - Use Cases:
   Concurrency is often used to improve the responsiveness and efficiency of a system,
   especially when dealing with tasks that may block, such as I/O operations. It allows a
   program to continue with other work while waiting for a task to complete.

2. Parallelism:
   - Definition:
   Parallelism is the concept where multiple tasks or operations are executed simultaneously,
   truly in parallel, often utilizing multiple processors or cores.

   - In Java Threads:
   In Java, parallelism is achieved when multiple threads execute in parallel on multiple CPU
   cores or processors. It involves actual simultaneous execution of tasks.

   - Use Cases:
   Parallelism is beneficial for computationally intensive tasks or operations that can be
   broken down into independent subtasks. It can lead to performance improvements by
   leveraging the processing power of multiple cores.

In summary:

- Concurrency is about managing and coordinating multiple tasks or processes, allowing them
to make progress together without necessarily executing at the same time.
- Parallelism is about executing multiple tasks or operations simultaneously, leveraging
multiple processors or cores for true simultaneous execution.

In Java, both concurrency and parallelism can be achieved using threads, but they are applied
in different contexts based on the goals of the application and the nature of the tasks being
performed. The `'java.util.concurrrent'` package provides tools and abstractions to work with
both concurrency and parallelism in Java.
