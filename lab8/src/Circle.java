public class Circle extends Shape {
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void test1() {

    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.radius);
    }
}