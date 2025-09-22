// Superclass
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass 1
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

// Subclass 2
class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

// Subclass 3
class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Staff: " + name + ", Department: " + department);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        Student s = new Student("Ravi", 16, "10th Grade");
        Staff st = new Staff("Mrs. Gupta", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

