# Reserved Word

Conditionals in Java are control structures that allow you to make
decisions in your code based on certain conditions. They help you
control the flow of your program by executing different blocks of code
depending on whether a condition is true or false. Java provides
several types of conditionals.

1. **if Statement:**
   - The `'if'` statement is the most basic conditional in Java.
   - It executes a block of code if a given condition is true.
```
int num = 10;
if (num > 5) {
    System.out.println("Number is greater than 5");
}
```

2. **if-else Statement:**
   - The `'if-else` statement extends the `'if'` statement by allowing
   you to specify an alternative block of code to execute if the
   condition is false.
```
int num = 3;
if (num > 5) {
    System.out.println("Number is greater than 5");
} else {
    System.out.println("Number is not greater than 5");
}
```

3. **if-else if-else Statement:**
   - You can use multiple `'else-if'` conditions to handle multiple
   possible outcomes.
```
int num = 7;
if (num < 5) {
    System.out.println("Number is less than 5");
} else if (num == 5) {
    System.out.println("Number is equal to 5");
} else {
    System.out.println("Number is greater than 5");
}
```
4. **Switch Statement:**
   - The `'switch'` statement is used when you have a single expression
   that needs to be compared with multiple values.
```
int dayOfWeek = 2;
switch (dayOfWeek) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    // Add more cases for other days
    default:
        System.out.println("Invalid day");
        break;
}
```

5. **Ternary Operator (Conditional Operator):**
   - The ternary operator (`'? :'`) is a concise way to write simple
   if-else statements.
```
int num = 7;
String result = (num > 5) ? "Greater than 5" : "Less than or equal to 5";
System.out.println(result);
```

These are the main conditional constructs in Java. The choice of which
one to use depends on the complexity of the conditions you need to
handle. You may encounter these conditionals when implementing various
business logic rules, such as handling different financial transactions
or validating user inputs. Understanding these conditionals are
essential for writing robust and efficient code in Java.
