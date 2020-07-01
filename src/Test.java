public class Test {
    public static void main(String[] args) {
        int a, b, sq;
        a = 2;
        b = 4;
        square(a);
    }

    private static int square(int num) {
        int sq = num *num;
        System.out.println(sq);
        return sq;
    }
}
