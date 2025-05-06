public class Example18B {
    public static int square(int n){
        return n*n;
    }

    public int cube(int n){
        return n*n*n;
    }

    public static void main(String[] args) {
        int sq = Example18B.square(8);
        Example18B m = new Example18B();
        int c = m.cube(8);

        System.out.println(sq);
        System.out.println(c);
    }
}
