# Loops

In Java, loops are control structures that allow you to execute a block of
code repeatedly based on a condition. Java provides several types of loops,
each with its specific use cases.

1. For Loop:
The `'for'` loop is the most commonly used looping construct in Java. It's
used when you know in advance how many times you want to repeat a block
of code. The loop consists of an initialization, condition, and an update
expression.
```
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```
Use cases:
- Iterating through arrays or collections.
- Running a task a specific number of times.

2. While Loop:
The `'while'` loop is used when you want to repeat a block of code as long
as a certain condition is true. It may not execute at all if the condition
is initially false.
```
int count = 0;
while (count < 5) {
    System.out.println("Count is " + count);
    count++;
}
```
Use cases:
- Running a task until a specific condition becomes false.
- Handling input validation and user interactions.

3. Do-While Loop:
The `'do-while'` loop is similar to the `'while'` loop, but it guarantees
that the block of code is executed at least once, even if the condition is
initially false.
```
int num = 5;
do {
    System.out.println(Number is " + num);
    num--;
} while (num > 0);
```
Use cases:
- Menu-driven applications where you want the menu to be displayed at
least once.
- Input validation.

4. Enhanced For Loop (for-each):
The enhanced `'for'` loop, also known as the for-each loop, is used to
iterate through elements in arrays and collections. It simplifies the
iteration process.
```
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```
Use cases:
- Iterating through arrays, lists, and other iterable collections.

5. Break and Continue statements:
While not traditional loops, `'break'` and `'continue'` statements are
used within loops to control the flow. `'break'` terminates the loop
prematurely, and `'continue'` skips the current iteration and proceeds
to the next one.
```
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println("Iteration " + i);
}
```
Use cases:
- Breaking out of a loop early when a certain condition is met.
- Skipping specific iterations while processing data.

These loops are fundamental for controlling the flow of your Java programs
and are essential for a wide range of use cases, from iterating through
data structures to handling user interactions, and implementing various
algorithms. As you further study and research, you'll encounter these
loops frequently in Java programming.
