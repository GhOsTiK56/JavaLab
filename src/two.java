public class two {
    int x, y;
    public void two(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void solve2(int x, int y){
        int answer = 0;
        int max = max(x, y);
        int min = min(x, y);

        answer = (5 * max - 4 * min) / (3 + ( max / min));
        System.out.println("Ответ: max = " + max + " min = " + min + " d = " + answer);
    }
    private static int max(int x, int y) {
        y +=2;
        return Math.max(x, y);
    }

    private static int min(int x, int y) {
        x = 1 - x;
        return Math.min(x, y);
    }
}
