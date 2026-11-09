class Fraction {
    private int numerator;   // числитель
    private int denominator; // знаменатель

    public static int test;

    private int test2;

    public int getTest2() {
        return this.test2;
    }

    public void setTest2(int value) {
        this.test2 = value;
    }

    public Fraction(int numerator, int denominator, int test2) {
        this(numerator, denominator);

        this.test2 = test2;
    }

    public static void test() {
        System.out.println(test);
    }

























    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Знаменатель не может быть равен 0. Установлено значение 1");
            this.denominator = 1;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Знаменатель не может быть равен 0");
        }
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

void main() {
    Fraction fraction1 = new Fraction(1, 2);
    Fraction fraction2 = new Fraction(3, 4);

    System.out.println("Первая дробь: " + fraction1.toString() + " (в десятичном виде: " + fraction1.toDecimal() + ")");
    System.out.println("Вторая дробь: " + fraction2.toString() + " (в десятичном виде: " + fraction2.toDecimal() + ")");
}