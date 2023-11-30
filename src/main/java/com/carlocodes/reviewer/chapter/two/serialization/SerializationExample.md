# Serialization and Deserialization Example

Question:
So for example I have a Java Spring Boot application. Whenever I send a payload to one of my
endpoint using postman, does serialization happen when I make an http request in postman? And
does deserialization happen when the controller of the endpoint receives the payload? Does this
happen?

Yes, this is correct. In a Java Spring Boot application (or any web application using a
framework like Spring MVC), serialization and deserialization often happen when handling HTTP
requests. Let's break down the process:

### Serialization:

1. Client Side (Postman):
- When you send a payload (e.g., in JSON format) in the body of an HTTP POST request using
Postman, the payload is serialized. Serialization here means converting the data (your payload)
into a format that can be easily transmitted over the network. In the case of JSON, this
involves converting your Java objects into a JSON string.

2. HTTP Request:
- The serialized payload is included in the body of the HTTP request.

### Deserialization

1. Server Side (Spring Boot Controller):
- On the server side, when the Spring Boot application receives the HTTP request, the framework
is responsible for deserializing the payload. Deserialization is the process of converting the
data (e.g., JSON string) from the HTTP request body back into Java objects. This is typically
done automatically by the Spring framework using an HTTP message converter.

2. Spring Boot Controller:
- The Spring Boot Controller method that handles the incoming request is annotated with the
`'@RequestBody'` annotation to indicate that the request body should be deserialized into a
Java object.

Example:
```
@RestController
public class MyController {
    @PostMapping("/example")
    public ResponseEntity<String> handleReqeust(@RequestBody MyRequestObject request) {
        // Code to handle the request object
        return ResponseEntity.ok("Request processed successfully");
    }
}
```
In this example, `'MyRequestObject'` is the Java class representing the structure of the
expected request payload. The `'@RequestBody'` annotation tells Spring to deserialize the
incoming JSON payload into an instance of `'MyRequestObject'`.

So in summary, serialization occurs when sending data from the client (e.g. Postman) to the
server (e.g. Spring Boot), and deserialization happens when the server receives the HTTP request
and converts the payload back into Java objects for processing in the controller method. The
process is transparent to the developer in many cases, thanks to the abstractions provided by
the Spring framework.
