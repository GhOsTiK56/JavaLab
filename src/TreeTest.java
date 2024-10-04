import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class TreeTest {
    private static final Random random = new Random();
    int rows, cols;
    int[][] matrix;

    public void Treetest(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void RandMatrix(){
        System.out.println("Изначальная матрица: " + "\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(199) - 99;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void ReplaceMatrix(){
        double[] averages = new double[cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    sum += matrix[i][j];
                    count++;
                }
            }

            if (count > 0) {
                averages[j] = (double) sum / count;
                BigDecimal bd = new BigDecimal(averages[j]);
                bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
                averages[j] = bd.doubleValue();
            } else {
                averages[j] = 0;
            }
        }
        System.out.println(Arrays.toString(averages));
    }
}
