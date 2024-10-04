import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows = 0, cols = 0, n = 0;
        Scanner scanner = new Scanner(System.in);

        OneTest oneTest = new OneTest();
        System.out.println("Первое задание: " + "\n");
        oneTest.SolveMas();
        oneTest.ReplaceMaxMin();
        oneTest.CreateReciprocalFraction();


        System.out.println("Второе задание: " + "\n");
        TwoTest twoTest = new TwoTest();
        twoTest.NumberInMas();
        twoTest.RewriteMas();

        System.out.println("Третье задание: " + "\n");
        TreeTest treeTest = new TreeTest();
        System.out.println("Введите кол-во строк и столбцов: ");
        rows = scanner.nextInt();
        cols = scanner.nextInt();
        treeTest.Treetest(rows, cols);
        treeTest.RandMatrix();
        treeTest.ReplaceMatrix();

        System.out.println("Четвертое задание: " + "\n");
        FourTest fourTest = new FourTest();
        System.out.println("Введите размер квадратной матрицы n: ");
        n = scanner.nextInt();
        fourTest.FourTest(n);
        fourTest.Matrix();
    }
}