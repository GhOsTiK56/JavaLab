import java.util.Random;

public class FourTest {
    private static final Random random = new Random();

    int n;
    int[][] A = new int[n][n];

    public void FourTest(int n){
        this.n = n;
        A = new int[n][n];
    }

    public void Matrix(){
        System.out.println("Матрица A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(199) - 99;  // числа от -99 до 99
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int minElement = A[0][n - 1];
        int maxElement = A[0][n - 1];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            int element = A[i][n - 1 - i];
            if (element < minElement) {
                minElement = element;
                minIndex = i;
            }
            if (element > maxElement) {
                maxElement = element;
                maxIndex = i;
            }
        }

        int sumOfIndices = minIndex + maxIndex;

        System.out.println("\nМинимальный элемент на побочной диагонали: " + minElement + " (строка " + minIndex + ")");
        System.out.println("Максимальный элемент на побочной диагонали: " + maxElement + " (строка " + maxIndex + ")");
        System.out.println("Сумма индексов минимального и максимального элементов на побочной диагонали: " + sumOfIndices);
    }
}