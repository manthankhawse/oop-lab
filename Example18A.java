public class Example18A {
    int l;
    int b;

    public Example18A(int l, int b){
        this.l = l;
        this.b = b;
    }

    public int calculateArea(){
        return this.l*this.b;
    }

    public boolean compareArea(Example18A r){
        return this.calculateArea()>r.calculateArea();
    }

    public class Main {
        public static void main(String[] args) {
            Example18A rect1 = new Example18A(10, 5);
            Example18A rect2 = new Example18A(7, 8);

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
