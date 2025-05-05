import java.math.BigInteger;

class Person{
    private String name;
    public int age;
    protected String address;
    int phoneNumer;

    public Person(String n, int a, String adr, int phno){
        name = n;
        age = a;
        address = adr;
        phoneNumer = phno;
    }

    public void displayDetails(){
        System.out.println("Details");
    }

    public void updatePhone(int newPh){
        phoneNumer = newPh;
    }
}

class Employeee extends Person{
    public int empId;
    public Employeee(String n, int a, String adr, int phno, int id){
        super(n, a, adr, phno);
        empId = id;
    }

    @Override
    public void displayDetails(){
        System.out.println("Details of employee");
        System.out.println(age);
        System.out.println(empId);
    }
}

public class PersonEmp {
    public static void main(String[] args) {
        Person p = new Employeee("abc", 19, "street name", 1234567890, 2);
        p.displayDetails();
        Person p1 = new Person("abc", 19, "street name", 1234567890);
        p1.displayDetails();
    }
}
