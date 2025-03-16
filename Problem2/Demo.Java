public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(6.5f, 0.5f);
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(6.5f, 0.5f, 0.5f, 0.5f);
        System.out.println("Before Move: " + mp1);
        mp1.move();
        System.out.println("After Move: " + mp1);
    }
}