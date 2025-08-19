package assignment1;
class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayInfo() {
        System.out.println("User Name: " + name + ", Email: " + email);
    }
}

class Student extends User {
    int rollNo;

    Student(String name, String email, int rollNo) {
        super(name, email);
        this.rollNo = rollNo;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name + ", Email: " + email + ", Roll No: " + rollNo);
    }

    void showStudentDetails() {
        System.out.println("This is a Student-specific method.");
    }
}

class Instructor extends User {
    String subject;

    Instructor(String name, String email, String subject) {
        super(name, email);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Instructor Name: " + name + ", Email: " + email + ", Subject: " + subject);
    }

    void showInstructorDetails() {
        System.out.println("This is an Instructor-specific method.");
    }
}

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        // Upcasting
        User u1 = new Student("Alice", "alice@student.com", 101);
        User u2 = new Instructor("Bob", "bob@instructor.com", "OOPS");

        u1.displayInfo();  // Calls Student's displayInfo()
        u2.displayInfo();  // Calls Instructor's displayInfo()

        // Downcasting
        if (u1 instanceof Student) {
            Student s1 = (Student) u1;
            s1.showStudentDetails();
        }

        if (u2 instanceof Instructor) {
            Instructor i1 = (Instructor) u2;
            i1.showInstructorDetails();
        }
    }
}

