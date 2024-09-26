import java.util.Scanner;

// Parent class
class Student {
    String name;
    int rollno;
    Scanner scan = new Scanner(System.in);
 
    // Method to get student details
    void display() {
        System.out.print("Enter the Student Name: ");
        name = scan.nextLine();
        System.out.print("Enter the Student RollNo: ");
        rollno = scan.nextInt();
    }
}

// Inherits from the parent class Student
class Science extends Student {
    int mark;

    // Method to get Science mark
    void display1() {
        System.out.print("Enter the Science Mark: ");
        mark = scan.nextInt();
    }
}

// Inherits from the parent class Student
class Commerce extends Student {
    int mark;

    // Method to get Commerce mark
    void display2() {
        System.out.print("Enter the Commerce Mark: ");
        mark = scan.nextInt();
    }
}

// Inherits from the parent class Student
class Arts extends Student {
    int mark;

    // Method to get Arts mark
    void display3() {
        System.out.print("Enter the Arts Mark: ");
        mark = scan.nextInt();
    }
}

public class College {
    public static void main(String args[]) {
        // Create Student object and get details
        Student s = new Student();
        s.display();
        
        // Create Science object and get Science mark
        Science sci = new Science();
        sci.display1();
        
        // Create Commerce object and get Commerce mark
        Commerce c = new Commerce();
        c.display2();
        
        // Create Arts object and get Arts mark
        Arts a = new Arts();
        a.display3();
    }
}
