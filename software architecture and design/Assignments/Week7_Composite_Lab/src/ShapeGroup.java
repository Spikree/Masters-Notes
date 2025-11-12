import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Drawable {
    private final String name;
    private final List<Drawable> children = new ArrayList<>();

    public ShapeGroup(String name) {
        // TODO: Store the name of the group
        this.name = name;
    }

    public void add(Drawable drawable) {
        // TODO: Add a drawable to the group
        children.add(drawable);
    }

    @Override
    public void draw(String indent) {
        // TODO: Print the group name and recursively draw children with increased indentation
        System.out.println(indent + name);
        for (Drawable drawable : children) {
            drawable.draw(indent + "...");
        }
    }
}
