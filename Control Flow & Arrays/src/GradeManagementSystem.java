import java.util.Scanner;

public class GradeManagementSystem {

    static final int MAX_STUDENTS = 100;
    static final int SUBJECTS = 5;

    static StudentGrade[] students = new StudentGrade[MAX_STUDENTS];
    static int studentCount = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== GRADE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average and Grade");
            System.out.println("4. Search Student");
            System.out.println("5. Find Top Performer");
            System.out.println("6. Generate Performance Report");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = getValidChoice();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    ReportGenerator.viewStudents(students, studentCount);
                    break;

                case 3:
                    ReportGenerator.displayAverage(students, studentCount);
                    break;

                case 4:
                    ReportGenerator.searchStudent(students, studentCount, sc);
                    break;

                case 5:
                    ReportGenerator.findTopPerformer(students, studentCount);
                    break;

                case 6:
                    ReportGenerator.generateReport(students, studentCount);
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void addStudent() {

        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Maximum students reached!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        double[] marks = new double[SUBJECTS];

        String[] subjects = {
            "Math",
            "Science",
            "English",
            "History",
            "Computer"
        };

        for (int i = 0; i < SUBJECTS; i++) {

            System.out.print(subjects[i] + ": ");
            marks[i] = getValidMark();
        }

        students[studentCount] = new StudentGrade(name, marks);
        studentCount++;

        System.out.println("Student Added Successfully!");
    }

    public static int getValidChoice() {

        while (true) {

            try {

                int choice = sc.nextInt();
                sc.nextLine();

                if (choice >= 1 && choice <= 7)
                    return choice;

                System.out.print("Enter a choice between 1 and 7: ");

            } catch (Exception e) {

                System.out.print("Invalid input! Enter a number: ");
                sc.nextLine();
            }
        }
    }

    public static double getValidMark() {

        while (true) {

            try {

                double mark = sc.nextDouble();
                sc.nextLine();

                if (mark >= 0 && mark <= 100)
                    return mark;

                System.out.print("Marks must be between 0 and 100: ");

            } catch (Exception e) {

                System.out.print("Invalid input! Enter numeric marks: ");
                sc.nextLine();
            }
        }
    }
}