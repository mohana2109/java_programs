import java.util.Scanner;


interface Employee {
    void setEmployeeDetails(String name, int empId, double salary);
    void displayEmployeeDetails();
    double calculateAnnualSalary();
}


class EmployeeImpl implements Employee {
    private String name;
    private int empId;
    private double salary;

  
    public void setEmployeeDetails(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

 
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Monthly Salary: $" + salary);
    }

  
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter employee monthly salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new EmployeeImpl();
        emp.setEmployeeDetails(name, empId, salary);

        System.out.println("\nEmployee Details:");
        emp.displayEmployeeDetails();
        System.out.println("Annual Salary: $" + emp.calculateAnnualSalary());
    }
}
