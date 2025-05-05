public class RectOp {
    int l;
    int b;

    public RectOp(int l, int b){
        this.l = l;
        this.b = b;
    }

    public int calculateArea(){
        return this.l*this.b;
    }

    public boolean compareArea(RectOp r){
        return this.calculateArea()>r.calculateArea();
    }

    public class Main {
        public static void main(String[] args) {
            RectOp rect1 = new RectOp(10, 5);
            RectOp rect2 = new RectOp(7, 8);

            System.out.println("Area of rect1: " + rect1.calculateArea());
            System.out.println("Area of rect2: " + rect2.calculateArea());

            if (rect1.compareArea(rect2)) {
                System.out.println("rect1 has a larger area than rect2");
            } else {
                System.out.println("rect1 does not have a larger area than rect2");
            }
        }
    }

}
