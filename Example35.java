import IneligibleException.IneligibleException;

public class Example35 {
    private String name;
    private String country;
    private int age;

    public Example35(String n, String c, int a) throws IneligibleException{
        if(!c.equals("India")) throw new IneligibleException("Ineligible country");
        if(age<18) throw  new IneligibleException("Age must be greater than or equal to 18");

        name = n;
        country = c;
        age = a;
    }

    public String toString(){
        return "Name: "+name+" Age: "+ age+" Country: "+country;
    }

    public static void main(String[] args){
        try{
            Example35 c1 = new Example35("Abc", "India", 19);
            Example35 c2 = new Example35("xyz", "Not India", 19);

            System.out.println(c1.toString());
            System.out.println(c2.toString());
        }catch (IneligibleException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
