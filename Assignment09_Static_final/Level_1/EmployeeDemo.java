class Employee {
    static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private String name, designation;
    private final int id; // Final employee ID

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation + ", Company: " + companyName);
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sam", 201, "Manager");
        Employee e2 = new Employee("Nina", 202, "Developer");

        e1.displayDetails();
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
