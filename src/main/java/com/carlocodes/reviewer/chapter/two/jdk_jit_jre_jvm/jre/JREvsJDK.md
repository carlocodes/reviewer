# Java Runtime Environment VS Java Development Kit

Let's clarify the distinction between the Java Development Kit (JDK) and the Java Runtime
Environment (JDE).

### Java Development Kit (JDK)
The JDK is a comprehensive set of software development tools used for creating Java applications.
It includes everything that the JRE contains, but it also provides additional tools and
utilities specifically designed for development purposes. Here are the main components of the
JDK:

1. Java Compiler (`'javac'`):
The Java Compiler is a tool that translates Java source code (`'.java'` files) into bytecode
(`'.class'` files), which can be executed by the Java Virtual Machine (JVM).

2. Java Virtual Machine (JVM):
The JVM is a crucial component of the JDK, responsible for interpreting or compiling Java
bytecode into native machine code for execution on the underlying hardware.

3. Debugging Tools:
The JDK includes various tools for debugging Java applications. For example, the Java Debugger
(`'jdb'`) allows developers to debug their code interactively.

4. JavaDoc:
JavaDoc is a tool that generates API documentation from comments in the source code. It helps
in creating well-documented and self-explanatory code.

5. Java Archive (JAR) Tool:
The JAR tool is used for packaging Java applications and libraries into JAR files. JAR files
can include compiled classes, resources, and metadata.

6. JavaFX:
In older versions of the JDK (before Java 11), JavaFX was included as part of the JDK. JavaFX
is a set of libraries and tools for building rich graphical user interfaces (GUIs). Starting
from Java 11, JavaFX is available as a separate download.

### Java Runtime Environment (JRE):
The JRE is a subset of the JDK, and its primary purpose is to provide the runtime environment
needed for executing Java applications. It includes the essentials required for running Java
bytecode. Here are the main components of the JRE:

1. Java Virtual Machine:
The JVM in the JRE is responsible for executing Java bytecode. It interprets or compiles
bytecode into native machine code during runtime.

2. Java Standard Libraries and APIs:
The JRE includes the core Java libraries and APIs necessary for basic functionality. These
libraries cover areas such as file I/O, networking, threading, and more. The collection of
these libraries is known as the Java Standard Edition (SE) API.

3. Java Class Loader:
The JRE includes a class loader that is responsible for dynamically loading Java classes as
needed during the execution of an application.

### Summary:
- The JDK is used for the development and includes tools for compiling, debugging, and
packaging Java applications. It also includes the JRE.
- The JRE is used for executing Java applications and includes the JVM, essential libraries,
and runtime components.

In a nutshell, if you're developing Java applications, you'll typically use the JDK. When you
deploy your application to a production environment or distribute it to end-users, they will
need the JRE to run the application. The JRE provides a runtime environment without the
development tools found in the JDK.
