package clases;

public class StudentTest {

    public static void main(String[] args) {
        // Default constructor
        Student student = new Student();
        System.out.println(student.sayHi());

        // Constructor with arguments
        Student student1 = new Student("Ricky Martin", (byte) 53, "1237468H");
        System.out.println(student1.sayHi());

        System.out.println();

        // Sleep student1
        System.out.println(student1.sleeping());
        // Study student
        System.out.println(student.studying("Programación"));

        System.out.println();

        // See states
        System.out.println(student.getState());
        System.out.println(student1.getState());
    }
}
