package Problem4;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(4)
        };

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        Scalable[] scalableShapes = new Scalable[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scalableShapes[i] = shapes[i];
        }

        
        scaleShapes(scalableShapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
