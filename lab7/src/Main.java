class Product {
    String name;
    double price;
    int quantity;

    static int totalProducts = 0;
    static double totalValue = 0;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProducts++;
        totalValue += price * quantity;
    }

    public static double getAveragePrice() {
        if (totalProducts == 0) {
            return 0;
        }
        return totalValue / totalProducts;
    }
}

void main() {
    Product p1 = new Product("Хлеб", 50.0, 10);
    Product p2 = new Product("Молоко", 85.0, 5);
    Product p3 = new Product("Сыр", 400.0, 2);
    Product p4 = new Product("Яблоки", 120.0, 8);

    System.out.println("Средняя стоимость позиции: " + Product.getAveragePrice());
}