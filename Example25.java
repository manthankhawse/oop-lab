import java.util.ArrayList;
import java.util.Date;

class Employee{
    private int empId;
    private float salary;
    private String email;
    private String gender;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(int id, String name, String e, String g, float s){
        empName = name;
        salary = s;
        email = e;
        empId = id;
        gender = g;
    }

    public void getDetails(){
        System.out.println("\n------------------------------------------\n");
        System.out.println("EmpId: " + empId + "\n" + "Name: " + empName + "\n" + "Email: " + email + "\n" + "Gender: " + gender + "\n" + "Salary: " + salary + "\n" );
        System.out.println("\n------------------------------------------\n");
    }

    public String paySlip(){
        return "Amount "+ salary + " paid to " + empName;
    }
}

class EmployeeDB{
    ArrayList<Employee> arr;

    public EmployeeDB(){
        arr = new ArrayList<Employee>();
    }

    public boolean addEmp(Employee e){
        try {
            arr.add(e);
            return true;
        } catch (Exception ex) {
            System.out.println("Error occured");
            ex.printStackTrace();
        }

        return false;
    }

    public boolean deleteEmp(int id){
        try {
            for(int i = 0; i<arr.size(); i++){
                if(arr.get(i).getEmpId() == id){
                    arr.remove(i);
                    return true;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error occured");
            ex.printStackTrace();
        }

        return false;
    }

    public String showPaySlip(int id){

        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i).getEmpId()==id){
                return arr.get(i).paySlip();
            }
        }

        return "";
    }


}
public class Example25 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Abc", "abc@gmail.com", "male", 40000);
        e.getDetails();
        EmployeeDB db = new EmployeeDB();
        db.addEmp(e);
        System.out.println(db.showPaySlip(1));
    }
}
