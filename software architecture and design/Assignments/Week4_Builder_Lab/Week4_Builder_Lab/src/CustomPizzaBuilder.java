public class CustomPizzaBuilder implements PizzaBuilder {
    // TODO: Declare private fields for crust, sauce, cheese, pepperoni, mushrooms, and glutenFree
    private String crust;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean glutenFree;

    @Override
    public PizzaBuilder setCrust(String crust) {
        // TODO: Set the crust type
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        // TODO: Set the sauce type
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder addCheese() {
        // TODO: Add cheese to the pizza
        this.cheese = true;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni() {
        // TODO: Add pepperoni to the pizza
        this.pepperoni = true;
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        // TODO: Add mushrooms to the pizza
        this.mushrooms = true;
        return this;
    }

    @Override
    public PizzaBuilder setGlutenFree(boolean glutenFree) {
        // TODO: Set gluten-free option
        this.glutenFree = glutenFree;
        return this;
    }

    @Override
    public Pizza build() {
        // TODO: Construct and return the final Pizza object
        return new Pizza(crust, sauce, cheese, pepperoni, mushrooms, glutenFree);
    }
}