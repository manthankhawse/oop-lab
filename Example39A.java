class Employee3 {
    public void work() {
        System.out.println("Employee is working...");
    }

    public double getSalary() {
        return 30000.00;
    }
}

class HRManager extends Employee3 {
    @Override
    public void work() {
        System.out.println("HR Manager is hiring and managing employees...");
    }

    public void addEmployee() {
        System.out.println("New employee added by HR Manager.");
    }
}

public class Example39A {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();           
        hr.addEmployee();    
        System.out.println("Salary: " + hr.getSalary()); 
    }
}
