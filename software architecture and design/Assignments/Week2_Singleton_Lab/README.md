# Week 2 – Singleton Pattern

## Objective
Learn how to implement the Singleton design pattern to ensure a class has only one instance and provides a global point of access to it.

## Task
You will implement a `Logger` class that follows the Singleton pattern. This logger will be used to log messages from different parts of an application.

### Provided Files
- `Logger.java`: A partially implemented class with a private constructor.
- `Main.java`: A demo file to test your implementation.
- `LoggerTest.java`: JUnit tests to verify your implementation.

### Your Tasks
1. Complete the `Logger` class:
   - Implement the Singleton pattern using a private static instance.
   - Provide a public static method `getInstance()` to access the instance.
   - Add a method `log(String message)` that prints the message prefixed with a timestamp.

2. Use the `Logger` in `Main.java` to log a few messages.

3. Run the provided JUnit tests to verify your implementation.

## Reflective Questions
1. What are the benefits and drawbacks of using the Singleton pattern?
   Benifits:
   Ensures a single, globally accessible instance, conserving resources and maintaining consistent state.
   Drawbacks:
   Makes testing harder, hides dependencies, and can lead to tight coupling or unintended shared state
   

2. How would you make your Singleton implementation thread-safe?
   use a static initializer or an enum-based Singleton, which are inherently thread-safe in Java.

3. In what scenarios should Singleton be avoided, and why?
   Singletons should be avoided when classes need to be easily testable or replaced, as they make mocking difficult.
   They’re also problematic in multithreaded or large systems where shared state can cause unexpected behavior.
   Overuse can lead to tight coupling and effectively turn the Singleton into a hidden global variable.

## Deliverables
1. Your completed code submissions
2. A screnshot showing the tests have been ran (and passed)
3. A text document, answering the reflective questions. 