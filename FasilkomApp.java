import java.util.Scanner;

public class FasilkomApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("     STUDENT FASILKOM GRADING PROGRAM         ");
        System.out.println("==============================================");

        // Request input from user
        System.out.print("Enter Student Name    : ");
        String name = input.nextLine();

        System.out.print("Enter Student ID      : ");
        String studentId = input.nextLine();

        System.out.print("Enter Attendance Score: ");
        double attendance = input.nextDouble();

        System.out.print("Enter Assignment Score: ");
        double assignment = input.nextDouble();

        System.out.print("Enter Midterm Score   : ");
        double midterm = input.nextDouble();

        System.out.print("Enter Final Exam Score: ");
        double finalExam = input.nextDouble();

        // Create object from input
        StudentFasilkom student = new StudentFasilkom(name, studentId);

        // Set scores
        student.setScores(attendance, assignment, midterm, finalExam);

        // Display result
        student.calculateAndDisplayResult();
        
        input.close();
    }
}
