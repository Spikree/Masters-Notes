## Week 7 – Composite Pattern Lab

### Objective
Learn how the Composite Pattern enables hierarchical structures where individual objects and groups of objects are treated uniformly.

### Scenario
You are designing a simple drawing application. Individual shapes like circles and rectangles can be drawn, and groups of shapes can be nested and drawn together. This models a composite structure where both leaf and composite nodes implement the same interface.

### Pattern Roles
- **Component Interface:** `Drawable`
- **Leaf Classes:** `Circle`, `Rectangle`
- **Composite Class:** `ShapeGroup`
- **Client:** `Main`

### Your Tasks
1. Implement the `Drawable` interface with a `draw(String indent)` method.
2. Create `Circle` and `Rectangle` classes that implement `Drawable`.
3. Create a `ShapeGroup` class that can contain multiple `Drawable` objects.
4. Implement recursive drawing logic in `ShapeGroup`.
5. Use the `Main` class to build and draw a nested structure.

### Reflective Questions
1. What are the pros and cons of treating individual and grouped objects uniformly?
- When you need to show/represent whole hierarchies of trees and also use individual leaf the composite pattern comes in handy
- For example in microsoft PowerPoint we group some shapes or text together, and we can move them all together, and we can also move them individually
- clients can work with complex structure through a single interface eg: the draw method works weather we are using a individual shape like circle or rectangle, or we're using a group of shapes
- Hard to manage complex structure or deeply nested groups

2. How would you extend this system to support transformations (e.g., scaling, rotation)?
- We can update the drawable interface so that all the objects can apply transformation, each leaf or object can use its own transformation
- We can use a transform class that holds parameters for transformation we can have the scaleX scaleY and rotation

3. What challenges might arise when deeply nesting groups?
- There will be too many objects created in the client code if we have a lot of deeply nested groups, debugging deeply nested groups can be hard
- Controlling or using an individual leaf becomes difficult since there are a lots of objects and keeping tracks of group becomes more difficult
- Can cause a stack overflow, if you want to change something in a parent group all the children must be drawn again
- The deeply nested groups can cause performance problems
