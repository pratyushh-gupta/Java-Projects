import java.util.Scanner;

public class ReportGenerator {

    // View all students
    public static void viewStudents(StudentGrade[] students, int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n========== ALL STUDENTS ==========");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s%n",
            "Name", "Math", "Science", "English", "History", "Computer");

        for (int i = 0; i < studentCount; i++) {

            double[] marks = students[i].getMarks();

            System.out.printf("%-15s%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f%n",
              students[i].getName(),
               marks[0],
               marks[1],
               marks[2],
               marks[3],
               marks[4]);
        }
    }

    // Display average and grade
    public static void displayAverage(StudentGrade[] students, int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n========== STUDENT AVERAGES ==========");

        for (int i = 0; i < studentCount; i++) {

            double average = GradeCalculator.calculateAverage(students[i]);
            String grade = GradeCalculator.getGrade(average);

            System.out.println("Student Name : " + students[i].getName());
            System.out.printf("Average      : %.2f%n", average);
            System.out.println("Grade        : " + grade);
            System.out.println("---------------------------");
        }
    }

    // Search student
    public static void searchStudent(StudentGrade[] students, int studentCount, Scanner sc) {

        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getName().equalsIgnoreCase(searchName)) {

                found = true;

                System.out.println("\n===== STUDENT DETAILS =====");

                System.out.println("Name : " + students[i].getName());

                System.out.print("Marks : ");

                double[] marks = students[i].getMarks();

                for (int j = 0; j < marks.length; j++) {
                    System.out.print(marks[j] + "\t");
                }

                System.out.println();

                double average = GradeCalculator.calculateAverage(students[i]);

                double highest = GradeCalculator.getHighestMark(students[i]);
                double lowest = GradeCalculator.getLowestMark(students[i]);

                System.out.printf("Average      : %.2f%n", average);
                System.out.printf("Highest Mark : %.2f%n", highest);
                System.out.printf("Lowest Mark  : %.2f%n", lowest);
                System.out.println("Grade        : " + GradeCalculator.getGrade(average));

                return;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Find top performer
    public static void findTopPerformer(StudentGrade[] students, int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        int topIndex = 0;

        double highestAverage = GradeCalculator.calculateAverage(students[0]);

        for (int i = 1; i < studentCount; i++) {

            double currentAverage = GradeCalculator.calculateAverage(students[i]);

            if (currentAverage > highestAverage) {
                highestAverage = currentAverage;
                topIndex = i;
            }
        }

        System.out.println("\n===== TOP PERFORMER =====");
        System.out.println("Name    : " + students[topIndex].getName());
        System.out.printf("Average : %.2f%n", highestAverage);
        System.out.println("Grade   : " + GradeCalculator.getGrade(highestAverage));
    }

    // Generate complete report
    public static void generateReport(StudentGrade[] students, int studentCount) {

        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n========== PERFORMANCE REPORT ==========");
        System.out.println("Total Students : " + studentCount);

        String[] subjects = {
            "Math",
            "Science",
            "English",
            "History",
            "Computer"
        };

        System.out.println("\n----- SUBJECT AVERAGES -----");

        for (int i = 0; i < subjects.length; i++) {

            double sum = 0;

            for (int j = 0; j < studentCount; j++) {
                sum += students[j].getMarks()[i];
            }

            System.out.printf("%-10s : %.2f%n",
                    subjects[i],
                    sum / studentCount);
        }

        findTopPerformer(students, studentCount);

        int aPlus = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < studentCount; i++) {

            String grade = GradeCalculator.getGrade(
                    GradeCalculator.calculateAverage(students[i]));

            switch (grade) {

                case "A+":
                    aPlus++;
                    break;

                case "A":
                    a++;
                    break;

                case "B":
                    b++;
                    break;

                case "C":
                    c++;
                    break;

                case "D":
                    d++;
                    break;

                default:
                    f++;
            }
        }

        System.out.println("\n----- GRADE DISTRIBUTION -----");

        System.out.println("A+ : " + aPlus);
        System.out.println("A  : " + a);
        System.out.println("B  : " + b);
        System.out.println("C  : " + c);
        System.out.println("D  : " + d);
        System.out.println("F  : " + f);
    }
}