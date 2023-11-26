# Files

Working with files in Java involves several classes and methods provided by
the `'java.io.file'` packages.

### Reading Files
To read from a file in Java, you can use classes like `'FileInputStream'`,
`'FileReader'`, or `'BufferedReader'`.

Example:
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            
            while ((line == reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Use cases:
- Reading configuration files, log files, or any text-based data.

### Writing to files

For writing to a file, classes like `'FileOutputStream'`, `'FileWriter'`,
`'BufferedWriter'` can be used. Here's an example using `'BufferedWriter'`:

```
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, this is a sample text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Use cases:
- Saving application data, writing logs, or creating output files.

### Deleting files

For deleting files, you can use the `'delete()'` method of the `'File'` class
or the `'Files.delete()'` method from `'java.nio.file'`. Here's an example
using `'Files.delete()'`:

```
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeletionExample {
    public static void main(String[] args) {
        Path path = Paths.get("fileToDelete.txt");
        
        try {
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Use cases:
- Removing temporary files, cleaning up resources, or handling file
management tasks.

### Use cases and best practices:

1. Reading configuration files:
- Use BufferedReader to read text files line by line.
- Parse the content to extract configuration information for your application.

2. Writing logs:
- Use BufferedReader to efficiently write log entries to a log file.
- Include timestamp and relevant information in log entries.

3. Data persistence:
- Use FileReader/FileWriter for reading and writing plain text files.
- Use ObjectInputStream/ObjectOutputStream for reading and writing
serialized objects.

4. Deleting temporary files:
- Use File.delete() or Files.delete() for removing temporary files.
- Wrap file operations in try-with-resources to ensure proper resource
handling.

Remember to handle exceptions appropriately and close resources using
try-with-resources to avoid potential memory leaks. These examples cover
the basics, and you can explore more advanced file operations based on your
specific requirements.
