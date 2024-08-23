package ShapeMaking;


public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toUpperCase()) {
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle(5);
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Invalid shape type provided");
                return null;
        }
    }
}

