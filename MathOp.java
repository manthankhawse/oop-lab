public class MathOp {
    public static int square(int n){
        return n*n;
    }

    public int cube(int n){
        return n*n*n;
    }

    public static void main(String[] args) {
        int sq = MathOp.square(8);
        MathOp m = new MathOp();
        int c = m.cube(8);

        System.out.println(sq);
        System.out.println(c);
    }
}
