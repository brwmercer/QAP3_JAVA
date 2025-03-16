public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(4),
            new Ellipse(6, 4),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}