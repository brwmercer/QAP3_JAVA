package Problem4;

public class Ellipse extends Shape implements Scalable {
    private double a, b;

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.max(b, a);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b)) - Math.PI * (a - b) / 2;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}

