void main() {
    Shape shape = new Shape("Синий", 1, 4);
    Circle circle = new Circle("Красный", 0, 0, 5);
    Rectangle rectangle = new Rectangle("Желтый", 0, 0, 4, 6);
    Shape shape1 = new Circle("Красный", 0, 0, 5);
    shape.draw();
    shape.displayInfo();
    System.out.println();

    circle.test1();
    circle.test();

    shape1.test();

    circle.draw();
    circle.displayInfo();
    System.out.printf("Площадь: %f\n", circle.calculateArea());
    System.out.printf("Диаметр: %f\n", circle.getDiameter());
    System.out.println();

    rectangle.draw();
    rectangle.displayInfo();
    System.out.printf("Площадь: %f\n", rectangle.calculateArea());
    System.out.printf("Квадрат?: %b\n", rectangle.isSquare());
}