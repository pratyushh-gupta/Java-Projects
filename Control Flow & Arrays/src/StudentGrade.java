public class StudentGrade {

    private String name;
    private double[] marks;

    // Constructor
    public StudentGrade(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // Setter for student name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public double[] getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double[] marks) {
        this.marks = marks;
    }
}