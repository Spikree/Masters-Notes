import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // TODO: Create individual shapes
        Circle circle = new Circle("circle1");
        Rectangle rectangle = new Rectangle("rectangle1");

        // TODO: Create shape groups and add shapes to them
        ShapeGroup shapeGroup1 = new ShapeGroup("shapeGroup1");
        shapeGroup1.add(circle);
        shapeGroup1.add(rectangle);

        ShapeGroup shapeGroup2 = new ShapeGroup("shapeGroup2");
        shapeGroup2.add(circle);
        shapeGroup2.add(rectangle);

        ShapeGroup shapeGroupRoot = new ShapeGroup("ShapeGroupRoot");

        shapeGroupRoot.add(shapeGroup1);
        shapeGroupRoot.add(shapeGroup2);

        // TODO: Draw the entire structure
        shapeGroupRoot.draw("...");
    }
}
