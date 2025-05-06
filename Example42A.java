public class Example42A {
    public String title;
    public int price;
    public BookConstructors(){
        System.out.println("Default constructor");
    }

    public BookConstructors(String s, int p){
        title = s;
        price = p;
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        BookConstructors b1 = new BookConstructors();
        BookConstructors b2 = new BookConstructors("Book title", 1000);
        System.out.println("Book1 "+b1.title + " price: " + b1.price);
        System.out.println("Book2 "+b2.title + " price: " + b2.price);
    }
}
