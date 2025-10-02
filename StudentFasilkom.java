public class StudentFasilkom {
    // Attributes to store data
    private String name;
    private String studentId;
    private double attendanceScore;
    private double assignmentScore;
    private double midtermScore;
    private double finalExamScore;

    // Constructor to create object
    public StudentFasilkom(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Method to set scores
    public void setScores(double attendance, double assignment, double midterm, double finalExam) {
        this.attendanceScore = attendance;
        this.assignmentScore = assignment;
        this.midtermScore = midterm;
        this.finalExamScore = finalExam;
    }

    // Method to calculate and display results
    public void calculateAndDisplayResult() {
        double finalScore = (0.10 * this.attendanceScore) + (0.20 * this.assignmentScore) 
                          + (0.30 * this.midtermScore) + (0.40 * this.finalExamScore);

        String grade;
        String description;

        if (finalScore >= 76) {
            grade = "A";
            description = "EXCELLENT";
        } else if (finalScore >= 66) {
            grade = "B";
            description = "GOOD";
        } else if (finalScore >= 56) {
            grade = "C";
            description = "FAIR";
        } else if (finalScore >= 46) {
            grade = "D";
            description = "POOR";
        } else {
            grade = "E";
            description = "VERY POOR";
        }
        
        System.out.println("\n==============================================");
        System.out.println("           FINAL
