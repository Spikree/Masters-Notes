public class Pizza {
    // TODO: Declare private fields for crust, sauce, cheese, pepperoni, mushrooms, and glutenFree
    private String crust;
    private String sauce;
    private boolean cheese;
    private boolean pepperoni;
    private  boolean mushrooms;
    private boolean glutenFree;

    // TODO: Create a constructor that initializes all fields

    public Pizza(String crust, String sauce, boolean cheese, boolean pepperoni, boolean mushrooms, boolean glutenFree) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
        this.glutenFree = glutenFree;
    }

    // TODO: Override toString() to return a string representation of the
    @Override
    public String toString() {
        return "pizza : crust='" + crust + "', sauce='" + sauce + "', cheese=" + cheese + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms + ", glutenFree=" + glutenFree;
    }
}