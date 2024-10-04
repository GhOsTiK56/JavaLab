import java.util.Arrays;
import java.util.Random;

public class TwoTest {
    private static Random random = new Random();
    int[] RandMas = new int[51];

    public void NumberInMas(){
        for (int i = 0; i < RandMas.length; i++) {
            RandMas[i] = random.nextInt(199) - 99;
        }
        System.out.println("Массив a(n): " + Arrays.toString(RandMas));
    }

    public void RewriteMas(){
        int count = 0;
        for (int i = 0; i < RandMas.length; i++) {
            if (RandMas[i] > 0) {
                count++;
            }
        }

        int[] RewriteMas = new int[count];
        int countIter = 0;

        for (int i = 0; i < RandMas.length; i++) {
            if (RandMas[i] > 0) {
                RewriteMas[countIter] = RandMas[i] * 3;
                countIter++;
            }
        }

        for (int i = 0; i < RewriteMas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < RewriteMas.length; j++) {
                if (RewriteMas[j] < RewriteMas[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = RewriteMas[minIndex];
            RewriteMas[minIndex] = RewriteMas[i];
            RewriteMas[i] = temp;
        }
        System.out.println("Массив b(n): " + Arrays.toString(RewriteMas) + "\n" + "\n");
    }
}
