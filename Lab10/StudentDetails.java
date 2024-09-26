// StudentDetails.java

package student;

public class StudentDetails {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;

    public StudentDetails(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

//Marks.java

package student;

public class Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public Marks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Getters and Setters
    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "subject1=" + subject1 +
                ", subject2=" + subject2 +
                ", subject3=" + subject3 +
                '}';
    }
}


//Result.java

package student;

public class Result {
    private StudentDetails studentDetails;
    private Marks marks;

    public Result(StudentDetails studentDetails, Marks marks) {
        this.studentDetails = studentDetails;
        this.marks = marks;
    }

    public String getResult() {
        int total = marks.getSubject1() + marks.getSubject2() + marks.getSubject3();
        double average = total / 3.0;
        return "Student: " + studentDetails.getFirstName() + " " + studentDetails.getLastName() +
                "\nTotal Marks: " + total +
                "\nAverage Marks: " + average;
    }

    @Override
    public String toString() {
        return "Result{" +
                "studentDetails=" + studentDetails +
                ", marks=" + marks +
                '}';
    }
}

//Main.java

package student;

public class Main {
    public static void main(String[] args) {
        // Create a StudentDetails object
        StudentDetails student = new StudentDetails("Alice", "Johnson", 20, "S12345");

        // Create a Marks object
        Marks marks = new Marks(85, 90, 78);

        // Create a Result object
        Result result = new Result(student, marks);

        // Print the result of the student
        System.out.println(result.getResult());
    }
}
