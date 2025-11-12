public class Rectangle implements Drawable {
    private final String name;

    public Rectangle(String name) {
        // TODO: Store the name of the rectangle
        this.name = name;
    }

    @Override
    public void draw(String indent) {
        // TODO: Print the name of the rectangle with indentation
        System.out.println(indent + name);
    }
}
