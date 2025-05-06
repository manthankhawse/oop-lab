class Employee1 {
    protected String name;
    protected int id;
    protected double basicSalary;

    public Employee1(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Employee1 {
    private double bonus;

    public Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}

class Developer extends Employee1 {
    private double projectAllowance;

    public Developer(String name, int id, double basicSalary, double projectAllowance) {
        super(name, id, basicSalary);
        this.projectAllowance = projectAllowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + projectAllowance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project Allowance: " + projectAllowance);
    }
}

public class Example21 {
    public static void main(String[] args) {
        Employee1 emp1 = new Manager("Alice", 101, 50000, 10000);
        Employee1 emp2 = new Developer("Bob", 102, 40000, 7000);

        emp1.displayDetails();
        System.out.println("Total Salary: " + emp1.calculateSalary());
        System.out.println();

        emp2.displayDetails();
        System.out.println("Total Salary: " + emp2.calculateSalary());
    }
}
