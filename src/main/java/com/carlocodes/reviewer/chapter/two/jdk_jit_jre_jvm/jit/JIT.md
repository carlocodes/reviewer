# Just-In-Time Compiler (JIT)

The JIT compiler is a component of the Java Virtual Machine (JVM) that plays a crucial role in
optimizing the performance of Java applications. It stands in contrast to the Java Compiler
(`'javac'`), which translates Java source code into bytecode. The JIT compiler, on the other
hand, operates during runtime execution of the Java program.

### How does the JIT compiler work?

1. Compilation to Bytecode:
When you compile a Java source code file using `'javac'`, it is translated into bytecode.
Bytecode is an intermediate representation that is platform-independent and can be executed by
any JVM.

2. Interpretation or Compilation by JIT:
When a Java program is run, the JVM initially interprets the bytecode using the interpreter.
However, to improve performance, the JVM employs the JIT compiler to translate frequently
executed or "hot" bytecode into native machine code.

3. Profiling:
The JVM uses a technique called profiling to identify sections of code that are executed
frequently. These sections are candidates for compilation by the JIT compiler. Profiling
involves monitoring the execution behavior, such as method call frequencies and loop
iterations.

4. Just-In-Time Compilation:
The identified hotspots are then compiled by the JIT compiler into native machine code,
specific to the underlying hardware architecture. This compilation occurs at runtime, just
before the code is executed. The resulting native code is stored in memory for subsequent
executions.

5. Caching:
To avoid recompiling the same code repeatedly, the JIT compiler employs caching mechanisms. If
a piece of code has been compiled and stored, the JVM can reuse the compiled native code for
subsequent invocations.

6. Adaptive Compilation:
The JIT compiler adapts its compilation strategy based on runtime feedback. If the behavior of
the program changes, the JIT compiler can recompile and optimize the code accordingly.

### When does the JIT compiler kick in?

- Threshold-based Trigger:
The JIT compiler typically kicks in when a certain execution threshold is reached. Methods or
loops that exceed a specific execution count or are deemed "hot" based on profiling are good
candidates for JIT compilation.

- Dynamic Compilation:
The decision to compile is made dynamically during runtime based on the program's behavior.
This allows the JIT compiler to focus on optimizing frequently executed portions of the code.

### Conditions for JIT compilation:

- Method Hotness:
Methods that are frequently invoked are more likely to be compiled by the JIT compiler.

- Loop Execution:
Loops that iterate frequently are prime candidates for JIT compilation.

- Profiling Information:
Profiling Information, such as execution counts, helps the JIT compiler identify hotspots.

### Difference between JIT and Java compiler (`'javac'`):

1. Timing:
`'javac'` compiles Java source code to bytecode at development time, generating `'.class'`
files before runtime. The JIT compiler, however, operates during runtime just before code
execution. The JIT compiler compiles the bytecode into native machine code.

2. Output:
`'javac'` generates platform-independent bytecode, while the JIT compiler generates native
machine code specific to the host system.

3. Optimization:
`'javac'` focuses on correctness and portability, performing minimal optimizations. The JIT
compiler, in contrast, performs aggressive runtime optimizations based on actual program
behavior.

4. Compilation Level:
`'javac'` is a static compiler, operating on the entire source code. The JIT compiler is a
dynamic compiler that targets specific code paths based on runtime profiling.

### Benefits of JIT Compilation:

- Optimized Performance:
JIT compilation allows the JVM to adapt and optimize code based on the actual execution
behavior, leading to improved performance.

- Platform Independence
The use of bytecode ensures platform independence, and the JIT compiler generates native code
specific to the host system during runtime.

- Dynamic Adaptation:
JIT compilation adapts to changes in program behavior, ensuring that optimizations are aligned
with the runtime characteristics of the application.

Understanding the role of the JIT compiler is essential for Java developers aiming to write
high-performance applications. It showcases the dynamic and adaptive nature of the JVM,
enabling efficient execution of Java program across diverse environments.
