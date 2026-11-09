import java.util.Arrays;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите размер массива: ");
    int n = scanner.nextInt();
    int[] array = new int[n];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
    }

    double sum = 0;
    for (int num : array) {
        sum += num;
    }

    double average = array.length > 0 ? sum / array.length : 0;

    System.out.println("Исходный массив: " + Arrays.toString(array));
    System.out.printf("Среднее арифметическое: %.2f\n", average);
}