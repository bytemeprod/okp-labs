import java.util.Random;

void main() {
    int rows = 5;
    int cols = 5;
    int[][] matrix = new int[rows][cols];
    Random random = new Random();

    System.out.println("Сгенерированная матрица 5x5:");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = random.nextInt(101) - 50;
            System.out.printf("%4d ", matrix[i][j]);
        }
        System.out.println();
    }

    int max = Integer.MIN_VALUE;
    int maxRow = 0;
    int maxCol = 0;

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > max) {
                max = matrix[i][j];
                maxRow = i;
                maxCol = j;
            }
        }
    }

    System.out.println("\nМаксимальный элемент: " + max);
    System.out.println("Позиция в матрице: строка " + maxRow + ", столбец " + maxCol);
}