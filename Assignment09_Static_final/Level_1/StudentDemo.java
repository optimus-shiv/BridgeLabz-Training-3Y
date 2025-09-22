class Student {
    static String universityName = "XYZ University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber; // Final
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Grade: " + grade + ", University: " + universityName);
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 401, "A");
        Student s2 = new Student("Maya", 402, "B");

        s1.displayDetails();
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}

