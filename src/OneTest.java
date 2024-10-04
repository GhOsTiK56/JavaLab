import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public class OneTest {
    private static Random random = new Random();
    double[] RandMas = new double[199];

    public void SolveMas(){
        for (int i = 0; i < RandMas.length; i++) {
            RandMas[i] = random.nextInt(199) - 99;
        }
        System.out.println("Массив ранд чисел: " + Arrays.toString(RandMas)+ "\n");
    }

    public void CreateReciprocalFraction(){
    double[] NewMas = new double[RandMas.length];
    try {
        for (int i = 0; i < RandMas.length; i++) {
            if (RandMas[i] == 0.0) {
                throw new NullPointerException("Exception: element is null!");
            }
            RandMas[i] = 1 / RandMas[i];
            NewMas[i] = RandMas[i];
            BigDecimal bd = new BigDecimal(NewMas[i]);
            bd = bd.setScale(2, BigDecimal.ROUND_DOWN);
            NewMas[i] = bd.doubleValue();
        }
    }
         catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Массив ранд чисел разделенных на 1: " + Arrays.toString(NewMas) + "\n" + "\n");
    }

    public void ReplaceMaxMin(){
        int MaxResI = 0;
        int MinResI = 0;
        double MaxRes = 0.0;
        double MinRes = 0.0;

        for (int i = 0; i < RandMas.length; i++) {
            if (RandMas[i] > MaxRes) {
                MaxResI = i;
                MaxRes = RandMas[i];
            }
            else if (RandMas[i] < MinRes) {
                MinResI = i;
                MinRes = RandMas[i];
            }
        }
        System.out.println("Макс и мин значения и их индекс: " + MaxResI + "= " + MaxRes + " " + MinResI + "= " + MinRes + "\n");

        for (int i = 0; i < RandMas.length; i++) {
            if (i == MaxResI)
                RandMas[i] = MinRes;
             else if (i == MinResI)
                 RandMas[i] = MaxRes;
        }
        System.out.println("Изменненный массив с макс и мин: " + Arrays.toString(RandMas) + "\n");
    }
}