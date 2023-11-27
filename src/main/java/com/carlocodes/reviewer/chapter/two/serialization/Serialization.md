# Serialization and Deserialization

Serialization in Java is the process of converting an object into a byte stream, which can then
be easily persisted to a file, sent over the network, or stored in a database. Deserialization
is the reverse process, where the byte stream is converted back into an object. The primary
purpose of serialization is to save the state of an object and recreate it later.

Here's a step-by-step explanation of how serialization works in Java:

### Serialization Process

1. Implement `'Serializable'` Interface:
- To make a class serializable, it must implement the `'Serializable'` interface. This interface
is a marker interface, meaning it doesn't have any methods, but it indicates that the class can
be serialized.

Example:
```
import java.io.Serializable;

public class MyClass implements Serializable {
    // class members and method
}
```

2. Use `'ObjectOutputStream'`:
- To serialize an object, you use the `'ObjectOutputStream'` class.

Example:
```
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

MyClass obj = new MyClass();

try (FileOutputStream fileOut = new FileOutputStream("object.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
    out.writeObject(obj);
} catch (IOException e) {
    e.printStackTrace();
}
```
This code creates a file called `'object.ser'` and writes the serialized object to it.

### Deserialization Process

1. Use `'ObjectInputStream`:
- To deserialize an object, you use the `'ObjectInputStream'` class.

Example:
```
import java.io.FileInputStream;
import java.io.ObjectInputStream;

MyClass obj = null;

try (FileInputStream filIn = new FileInputStream("object.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn)) {
    obj = (MyClass) in.readObject();
} catch (IOException | ClassNotFoundException e) {
    e.printStackTrace();
}
```
This code reads the serialized object from the file `'object.ser'` and converts it back into
an object.

### Example and Use cases:

1. Storing Objects
- You can use serialization to store complex object structures in files or database.

2. Network Communication
- Objects can be serialized and sent over a network, facilitating communication between
distributed systems.

3. Caching
- Serialized objects can be cached to improve performance by avoiding the need to recreate
objects from scratch.

4. Session Management
- In web applications, user sessions can be serialized to maintain user state across multiple
requests.

5. Deep Copy of Objects
- Serialization can be used to create deep copies of objects by serializing and then
deserializing them.

Remember to handle exceptions appropriately, as shown in the examples. Also, be cautious when
serializing sensitive information, and consider using versioning to handle changes in the class
structure over time.
