// Interface Person
interface Person {
    void speak();
}

// Class Student implementing Person interface
class Student implements Person {

    public void speak() {
        System.out.println("I am a student. I love learning new things.");
    }
}

// Class Teacher implementing Person interface
class Teacher implements Person {
    public void speak() {
        System.out.println("I am a teacher. I enjoy teaching students.");
    }
}

// Main class to test the implementation
public class Interface {
    public static void main(String[] args) {
        // Creating objects of Student and Teacher
        Person student = new Student();
        Person teacher = new Teacher();

        // Calling speak methods
        student.speak();  // Output: I am a student. I love learning new things.
        teacher.speak();  // Output: I am a teacher. I enjoy teaching students.
    }
}
