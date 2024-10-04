import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);

        System.out.println("Задание 1. Введите числа x и y: ");
        one one = new one();
        x = in.nextInt();
        y = in.nextInt();
        one.solve1(x, y);

        System.out.println("Задание 2. Введите числа x и y: ");
        two two = new two();
        x = in.nextInt();
        y = in.nextInt();
        two.solve2(x, y);

        System.out.println("Задание 3. Введите x: ");
        tree tree = new tree();
        x = in.nextInt();
        tree.solve3(x);
    }
}