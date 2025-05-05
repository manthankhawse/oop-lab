import IneligibleException.IneligibleException;

public class Citizen {
    private String name;
    private String country;
    private int age;

    public Citizen(String n, String c, int a) throws IneligibleException{
        if(!c.equals("India") || a<18) throw new IneligibleException("");
        name = n;
        country = c;
        age = a;
    }

    public String toString(){
        return "Name: "+name+" Age: "+ age+" Country: "+country;
    }

    public static void main(String[] args){
        try{
            Citizen c1 = new Citizen("Abc", "India", 19);
            Citizen c2 = new Citizen("xyz", "Not India", 19);

            System.out.println(c1.toString());
            System.out.println(c2.toString());
        }catch (IneligibleException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
