# Networking

Networking in Java involves the communication between different devices or applications over
a network. Java provides a rich set of APIs to facilitate network programming. The `'java.net'`
package is a fundamental part of Java that offers classes and interfaces for networking
purposes.

### Important Aspects/Features of Java Networking:

1. Socket Programming:
- Java supports both TCP (Transmission Control Protocol) and UDP (User Datagram Protocol)
through sockets.
- `'Socket'` and `'ServerSocket'` classes in the `'java.net'` package are used for creating
network sockets.

2. URL Handling:
- Java provides the `'URL'` class for handling URLs. It enables you to connect to a remote
resource using various protocols like HTTP, HTTPS, FTP, etc.

3. URLConnection:
- The `'URLConnection'` class extends `'URLConnection'` and provides a higher-level interface
for working with URLs.

4. HTTP Client:
- Introduced in Java 11, the `'HttpClient'` class simplifies making HTTP requests and handling
responses.

5. DatagramPacket and DatagramSocket:
- For UDP communication, Java provides the `'DatagramPacket'` and `'DatagramSocket'` classes.

6. Proxy Support:
- Java supports proxy settings through the `'Proxy'` class and `'ProxySelector'` interface.

### Examples and Use Cases:

1. Socket Programming Example:
- Creating a simple client-server application using `'Socket'` and `'ServerSocket'` classes to
exchange data over a TCP connection.
```
// Server side
ServerSocket serverSocket = new ServerSocket(8080);
Socket clientSocket = serverSocket.accept();
// Perform communication with the client...

// Client side
Socket socket = new Socket("localhost", 8080);
// Perform communication with the server
```

2. URL Handling Example:
- Reading data from a URL using the `'URL'` class.
```
URL url = new URL("https://example.com");
BufferedReader bufferedReader = new BufferedReader(new InputStream(url.openStream()));
String line
while ((line = bufferedReader.readLine()) != null) {
    System.out.println(line);
}
reader.close();
```

3. HTTP Client Example (Java 11+):
- Making an HTTP GET request using the `'HttpClient'` class.
```
HttpClient httpClient = HttpClient.newHttpClient();
HttpRequest httpRequest = HttpRequest.newBuilder()
    .uri(URI.create("https://api.example.com/data")
    .GET()
    .build();

HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

These are just basic examples, there's much more you can do with Java networking, especially
when integrating with frameworks like Spring. Understanding networking is crucial for
implementing secure and efficient communication between systems.
