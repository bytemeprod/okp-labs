package org.example;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    void main() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        double distance = p1.distanceTo(p2);

        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Расстояние между точками: " + distance);
    }
}