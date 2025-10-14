public interface PizzaBuilder {
    // TODO: Define method to set crust type
    PizzaBuilder setCrust(String crust);

    // TODO: Define method to set sauce type
    PizzaBuilder setSauce(String sauce);

    // TODO: Add method to include cheese
    PizzaBuilder addCheese();

    // TODO: Add method to include pepperoni
    PizzaBuilder addPepperoni();

    // TODO: Add method to include mushrooms
    PizzaBuilder addMushrooms();

    // TODO: Add method to set gluten-free option
    PizzaBuilder setGlutenFree(boolean glutenFree);

    // TODO: Finalise and build the Pizza object
    Pizza build();

}