public class Circle implements Drawable {
    private final String name;

    public Circle(String name) {
        // TODO: Store the name of the circle
        this.name = name;
    }

    @Override
    public void draw(String indent) {
        // TODO: Print the name of the circle with indentation
        System.out.println(indent + name);
    }
}
