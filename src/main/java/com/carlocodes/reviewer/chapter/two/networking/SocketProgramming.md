# Socket Programming

Socket programming in Java involves using the `'Socket'` and `'ServerSocket'`
classes from the `'java.net'` package to establish communication between two
processes over a network. This type of programming enables data exchange
between applications running on different devices, whether it's on the same
local network or over the internet. Socket programming is a fundamental
aspect of network programming and is widely used in various applications,
including client-server systems, distributed computing, and more.

1. Client-Server Communication:
- Purpose:
  - Enable communication between a client and a server.
- Use cases:
  - Web servers and clients (HTTP/HTTPS communication).
  - Database servers and client applications.
  - Chat applications, where clients communicate with a central server.
- Example:
  - Server Side (TCP):
  ```
  ServerSocket serverSocket = new ServerSocket(8080);
  Socket clientSocket = serverSocket.accept();
  
  // Perform communication with the client using input and output streams.
  ```
  - Client Side (TCP):
  ```
  Socket socket = Socket("localhost", 8080);
  
  // Perform communication with the server using input and output streams.
  ```
  - Use case:
    - A simple chat application where a server facilitates communication
      between multiple clients.

2. File Transfer:
- Purpose:
  - Transfer files between a client and a server.
- Use cases:
  - Uploading files to a server.
  - Downloading files from a server.
- Examples:
  - Server Side (TCP):
  ```
  ServerSocket serverSocket = new ServerSocket(8080);
  Socket clientSocket = serverSocket.accept();

  // Perform communication with the client using input and output streams.
  ```
  - Client Side (TCP):
  ```
  Socket socket = Socket("localhost", 8080);

  // Perform communication with the server using input and output streams.
  ```
  - Use case:
    - An application where a client uploads an image to a server for
    processing.

3. Chat Application:
- Purpose:
  - Facilitate real-time communication between multiple clients.
- Use cases:
  - Online messaging applications.
  - Collaborative platforms.
- Examples:
  - Server Side (TCP):
  ```
  ServerSocket serverSocket = new ServerSocket(9090);
  
  // Accepts incoming connections from clients and create a thread for each client.
  ```
  - Client Side (TCP):
  ```
  Socket socket = new Socket("localhost", 9090);
  
  // Establish communication with the server using input and output streams.
  ```
  - Use cases:
    - A multi-user chat application where clients connect to a central server for message exchange.

4. UDP Datagram Communication:
- Purpose:
  - Enables connectionless communication between clients and servers.
- Use cases:
  - Real-time video streaming.
  - Online gaming.
- Examples:
  - Server Side (TCP):
  ```
  DatagramSocket datagramSocket = new DatagramSocket(1234);
  
  // Receive datagrams from clients.
  ```
  - Client Side (TCP):
  ```
  DatagramSocket datagramSocket = new DatagramSocket();
  
  // Send datagrams to the server.
  ```
  - Use cases:
    - An application where clients send real-time updates to a central
    server without establishing a continuous connection.

Socket programming in Java is versatile and finds application in a wide
range of scenarios where communication between processes is essential.
Understanding how to create sockets, handle input/output streams, and
manage connections is crucial for building robust networked applications.
