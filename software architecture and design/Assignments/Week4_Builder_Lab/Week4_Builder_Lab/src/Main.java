public class Main {
    public static void main(String[] args) {
        // TODO: Use CustomPizzaBuilder to build a pizza with cheese, pepperoni, and stuffed crust
        Pizza pizzaBuilder = new CustomPizzaBuilder().setCrust("stuffed").setSauce("tomato").addCheese().addPepperoni().setGlutenFree(false).build();
        // TODO: Print the pizza using System.out.println()
        System.out.println(pizzaBuilder);
    }
}