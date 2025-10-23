# Week 4 – Builder Pattern Lab: Pizza Builder

## Objective
Learn how to use the Fluent Builder design pattern to construct complex objects step-by-step using method chaining.

## Task
You will implement a `PizzaBuilder` that allows building a `Pizza` object with optional ingredients and configurations.

### Provided Files
- `Pizza.java`: The product class representing a pizza.
- `PizzaBuilder.java`: The builder interface.
- `CustomPizzaBuilder.java`: A concrete builder class.
- `Main.java`: A demo file with TODOs.
- `PizzaBuilderTest.java`: JUnit tests to verify your implementation.

### Your Tasks
1. Implement the `Pizza` class with fields for crust, sauce, cheese, pepperoni, mushrooms, and gluten-free base.
2. Implement the `PizzaBuilder` interface with methods to set each ingredient and a `build()` method.
3. Implement the `CustomPizzaBuilder` class using method chaining.
4. Complete the demo in `Main.java` to build and print a pizza.
5. Run the JUnit tests to verify your implementation.

## Pattern Roles
- **Builder (interface):** `PizzaBuilder` — Defines the steps to build a pizza.
- **Concrete Builder:** `CustomPizzaBuilder` — Implements the builder interface and constructs the pizza.
- **Product:** `Pizza` — The complex object being built.
- **Client:** `Main` — Uses the builder to construct a pizza.

## Reflective Questions
1. Why is the Builder pattern more appropriate here than using a constructor with many parameters?
 - Because a constructor with many paramaters is very unreadable and really difficult to maintain
 - Constructors are great when the class has few paramaters
 - But when the paramaters increase and we have a lot of optional paramaters the code gets very complex and less readable if we don't use Builder pattern
 - We don't have to memorise the order or the meaning of paramater

2. How does method chaining of the fluent builder improve readability and maintainability?
- Readability
    When we use method chaining each method or line defines the attribute of the function/action it is going to perform 
    We don't have to memorise the order or the meaning of the paramater

- Maintainability
    Suppose we want to add more features to the pizza builder lets say setSize("large") we don't need to modify existing constructor calls or rewrite the code old code still works and new methods can be added easily, every method is modular and self contained

3. How would you extend this builder to support validation (e.g., no cheese on vegan pizzas)?
- I would add a boolean for vegan pizza or for no cheese and update the builder method to have setVegan or setNoCheese and also add these in the pizza builder interface
- I will also add a validation for when the pizza is set to be vegan or with no cheese and in the main client we have addPepperoni method or the addCheese method it throws an exception 