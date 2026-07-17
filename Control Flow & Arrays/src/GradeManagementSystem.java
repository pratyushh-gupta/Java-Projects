import java.util.Scanner;

public class GradeManagementSystem{
  static final int MAX_STUDENTS = 100;
  static final int SUBJECTS = 5;
  static String[] studentNames = new String[MAX_STUDENTS];
  static double[][] studentMarks = new double[MAX_STUDENTS][SUBJECTS];
  static int studentCount = 0;
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    while(true){
      System.out.println("\n==== GRADE MANAGEMENT SYSTEM ====");
      System.out.println("1. Add Student");
      System.out.println("2. Exit");

      System.out.println("Enter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch(choice){
        case 1:
          addStudent();
          break;
        case 2:
          System.out.println("Thank You!");
          System.exit(0);
        default:
          System.out.println("Invalid Choice!");
      }
    }
  }
}