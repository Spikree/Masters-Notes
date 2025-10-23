# Week 3 – Factory Pattern Lab

## Objective
Learn how the Factory Method pattern allows subclasses to decide which class to instantiate, promoting extensibility and adherence to the Open/Closed Principle.

## Pattern Roles
- **Factory (Creator):** `NotificationFactory` — Abstract class that defines the factory method `createNotification()`. Done


- **Concrete Factories:** `EmailFactory`, `SMSFactory`, `PushFactory` — Implement the factory method to return specific notification types.
ToDo

- **Product (Abstract Product):** `Notification` — Interface that defines the `send(String message)` method.
- **Concrete Products:** `EmailNotification`, `SMSNotification`, `PushNotification` — Implement `Notification` with custom formatting behavior.
- **Client:** `Main` — Uses the factories to create and send notifications without depending on concrete classes.

## Task
You are designing a notification system that can send messages via different channels: Email, SMS, and Push Notification.

Each notification type has its own class and behavior. You will use the Factory Method pattern to delegate the creation of these notifications to subclasses.

## Your Tasks
1. Implement the `createNotification()` method in each factory subclass.
2. Implement the `send(String message)` method in each notification class with custom formatting.
3. Use the factories in `Main.java` to send formatted messages.
4. Run the JUnit tests to verify correct instantiation and output formatting.

## Reflective Questions
1. How does the simple and standard factory patterns differ? What version is implimented here, and why?
    The simple factory centralizes object creation in one method, deciding which subclass to instantiate based on input.
    The factory method lets the subclass decide which class to instantiate, promoting extensibility.
    If creation logic is fixed inside one class, its a simple factory and if subclasses override creation its a factory method.
    The Factory Method pattern standard factory is implemented here because object creation is delegated to subclasses (EmailFactory, SMSFactory, PushFactory) that each decide which Notification to instantiate.

2. What are the benefits of using an abstract product class in this pattern?
    Using an abstract product class like Notification lets all concrete products share a common interface enabling polymorphism.


3. How would you extend this system to support new notification types (a Pager for example) without modifying existing code?
    To add a new notification type like pager, create a new pager notification class implementing notification and a pageFactory extending notifacationFactory.