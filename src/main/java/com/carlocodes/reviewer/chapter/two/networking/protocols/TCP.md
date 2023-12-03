# Transmission Control Protocol

TCP, or Transmission Control Protocol, is one of the core protocols of the
Internet Protocol (IP) suite. It is a connection oriented protocol that
provides reliable, ordered, and error-checked delivery of data between
applications that require a dependable and accurate communication channel.

Key features of TCP include:

1. Connection-Oriented:
- TCP established a connection before data is exchanged between the sender
and the receiver. This connection is maintained throughout the entire
communication session.

2. Reliable Data Deliver:
- TCP ensures the reliable delivery of data by using mechanisms such as
acknowledgements and retransmissions. If data is lost or corrupted during
transmission, TCP automatically retransmits it.

3. Ordered Data Transfer:
- TCP guarantees the order of data delivery. If multiple pieces of data are
sent, they will be received by the receiver in the same order in which they
were sent.

4. Flow Control:
- TCP uses flow control mechanisms to manage the rate of data exchange
between the sender and receiver. This prevents one side from overwhelming the
other with data.

5. Full-Duplex Communication:
- TCP supports full duplex communication, allowing data to be sent and
received simultaneously. This is achieved by using separate channels for
data in each direction.

6. Connection Termination:
- TCP ensures a reliable connection termination process. Both the sender and
receiver exchange control messages to gracefully close the connection.

7. Byte Stream:
- TCP treats the data as continuous streams of bytes rather than discrete
messages. The application layer is responsible for framing the data if
message boundaries are important.

8. Ports:
- TCP uses ports to distinguish between different services or applications
running on the same device. The combination of an IP address and a port
port number uniquely identifies a specific communication endpoint.

TCP is widely used in various applications, including:

- Web browsing:
  - When you access a website using a web browser, the data is often
  transmitted over TCP connections.
- Email:
  - Email protocols such as SMTP (Simple Mail Transfer Protocol) and IMAP
  (Internet Message Transfer Protocol) use TCP.
- File Transfer:
  - Protocols like FTP (File Transfer Protocol) use TCP for reliable file
  transfer.
- Remote Login:
  - Protocols like SSH (Secure Shell) use TCP to provide secure remote login.

In summary, TCP is a fundamental protocol for reliable and ordered
communication in computer networks. It is a key building block for numerous
applications and services on the internet.
