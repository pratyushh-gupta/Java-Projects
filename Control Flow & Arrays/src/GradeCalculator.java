public class GradeCalculator {

    // Calculate average marks of a student
    public static double calculateAverage(StudentGrade student) {
        double sum = 0;

        double[] marks = student.getMarks();

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / marks.length;
    }

    // Return grade based on average
    public static String getGrade(double average) {

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Find highest mark of a student
    public static double getHighestMark(StudentGrade student) {

        double[] marks = student.getMarks();
        double highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }

    // Find lowest mark of a student
    public static double getLowestMark(StudentGrade student) {

        double[] marks = student.getMarks();
        double lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        return lowest;
    }
}