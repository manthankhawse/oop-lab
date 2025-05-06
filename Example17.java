import java.util.*;

// Base class
abstract class Staff {
    protected String name;
    protected int id;
    protected double salary;

    public Staff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void displayDetails();
    public abstract double calculateBonus();
    public abstract void promote();
}

// Professor class
class Professor extends Staff {
    private String subject;

    public Professor(String name, int id, double salary, String subject) {
        super(name, id, salary);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Professor: " + name + ", ID: " + id + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    public double calculateBonus() {
        return 0.2 * salary; // 20% bonus
    }

    @Override
    public void promote() {
        salary += 5000;
        System.out.println(name + " promoted! New salary: " + salary);
    }
}

// AdministrativeStaff class
class AdministrativeStaff extends Staff {
    private String department;

    public AdministrativeStaff(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Staff: " + name + ", ID: " + id + ", Department: " + department + ", Salary: " + salary);
    }

    @Override
    public double calculateBonus() {
        return 0.1 * salary; // 10% bonus
    }

    @Override
    public void promote() {
        salary += 3000;
        System.out.println(name + " promoted to Senior Admin! New salary: " + salary);
    }
}

// MaintenanceStaff class
class MaintenanceStaff extends Staff {
    private String shift;

    public MaintenanceStaff(String name, int id, double salary, String shift) {
        super(name, id, salary);
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        System.out.println("Maintenance Staff: " + name + ", ID: " + id + ", Shift: " + shift + ", Salary: " + salary);
    }

    @Override
    public double calculateBonus() {
        return 0.05 * salary; // 5% bonus
    }

    @Override
    public void promote() {
        salary += 1500;
        System.out.println(name + " promoted to Supervisor! New salary: " + salary);
    }
}

// Driver class
public class Example17 {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();

        staffList.add(new Professor("Dr. Sharma", 101, 80000, "Physics"));
        staffList.add(new AdministrativeStaff("Mr. Mehta", 102, 50000, "Admissions"));
        staffList.add(new MaintenanceStaff("Ravi", 103, 30000, "Night"));

        // Runtime polymorphism demonstration
        for (Staff staff : staffList) {
            staff.displayDetails();
            System.out.println("Bonus: " + staff.calculateBonus());
            staff.promote();
            System.out.println("---------------------------");
        }
    }
}
