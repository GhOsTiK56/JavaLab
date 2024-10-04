public class one {
    int x, y;

    public void one(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void solve1(int x, int y){
        double answer = 0;
        if (x > y)
            answer = (double) y / 10;
        else
            answer = (double) x / 10;
        System.out.println("Овет: " + answer);
    }
}
