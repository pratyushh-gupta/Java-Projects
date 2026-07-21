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
      System.out.println("2. View Student");
      System.out.println("3. Calculate Average and Grade");
      System.out.println("4. Search Student");
      System.out.println("5. Find Top Performer");
      System.out.println("6. Generate Performance Report");
      System.out.println("7. Exit");

      System.out.println("Enter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch(choice){
        case 1:
          addStudent();
          break;
        case 2: 
          viewStudent();
          break;
        case 3: 
          displayAverage();
          break;
        case 4: 
          searchStudent();
          break;
        case 5: 
          findTopPerformer();
          break;
        case 6: 
          generateReport();
          break;
        case 7:
          System.out.println("Thank You!");
          System.exit(0);
        default:
          System.out.println("Invalid Choice!");
      }
    }
  }

  public static void addStudent(){
    if(studentCount == MAX_STUDENTS){
      System.out.println("Cannot add more students");
      return;
    }
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();
    studentNames[studentCount] = name;

    String[] subjects = {"Math", "Science", "English", "History", "Computer"};
    for(int i=0; i<SUBJECTS; i++){
      System.out.print(subjects[i] + ": ");
      double mark = sc.nextDouble();
      studentMarks[studentCount][i]=mark;
    }
    sc.nextLine();
    studentCount++;
    System.out.println("Student Added Successfully!");
  }
  
  public static void viewStudent(){
    if(studentCount==0){
      System.out.println("No students found!");
      return;
    }
    System.out.println("========== ALL STUDENTS ==========");
    System.out.println("Name      Math  Science  English  History  Computer");

    for(int i=0; i<studentCount; i++){
      System.out.printf(studentNames[i] + "\t");
      for(int j=0; j<SUBJECTS; j++){
        System.out.print(studentMarks[i][j] + "\t");
      }
      System.out.println(); 
    }
  }

  public static double calculateAverage(int studentIndex){
    double sum = 0;
    for(int i=0; i<SUBJECTS; i++){
      sum += studentMarks[studentIndex][i];
    }
    double average = sum/SUBJECTS;
    return average;
  }

  public static String getGrade(double average){
    if(average>=90){
      return "A+";
    }
    else if(average >= 80){
      return "A";
    }
    else if(average >= 70){
      return "B";
    }
    else if(average >= 60){
      return "C";
    }
    else if(average >= 50){
      return "D";
    }
    else
      return "F";
  }

  public static void displayAverage(){
    if(studentCount==0){
      System.out.println("No students found!");
      return;
    }

    System.out.println("========== STUDENT AVERAGES ==========");
    for(int i=0; i<studentCount; i++){
      double average = calculateAverage(i);
      String grade = getGrade(average);

      System.out.println("Student Name : " + studentNames[i]);
      System.out.printf("Average      : %.2f%n", average);
      System.out.println("Grade        : " + grade);
      System.out.println("--------------------");
    }
  }

  public static void searchStudent(){
    if(studentCount == 0){
      System.out.println("No student found!");
      return;
    }

    System.out.println("Enter Student Name: ");
    String searchName = sc.nextLine();

    boolean found = false;

    for(int i=0; i<studentCount; i++){
      if(studentNames[i].equalsIgnoreCase(searchName)){
        found = true;
        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name : " + studentNames[i]);
        System.out.print("Marks : ");
        for(int j=0; j<SUBJECTS; j++){
          System.out.print(studentMarks[i][j] + "\t");
        }

        System.out.println();

        double average = calculateAverage(i);
        String grade = getGrade(average);

        System.out.printf("Average : %.2f%n", average);
        System.out.println("Grade : " + grade);
        break;
      }
    }
    if(!found){
      System.out.println("Student not found!");
    }
  }

  public static void findTopPerformer(){
    if(studentCount == 0){
      System.out.println("No students found!");
      return;
    }

    int topIndex = 0;
    double highestAverage = calculateAverage(0);

    for(int i=1; i<studentCount; i++){
      double currentAverage = calculateAverage(i);

      if(currentAverage > highestAverage){
        highestAverage = currentAverage;
        topIndex = i;
      }
    }

    System.out.println("\n ===== TOP PERFORMER =====");
    System.out.println("Name    : " + studentNames[topIndex]);
    System.out.printf("Average : %.2f%n", highestAverage);
    System.out.println("Grade   : " + getGrade(highestAverage));
  }

  public static void generateReport(){
    if(studentCount==0){
      System.out.println("No students found!");
      return;
    }

    System.out.println("\n========== PERFORMANCE REPORT ==========");
    System.out.println("Total Students : " + studentCount);

    String[] subjects = {"Math", "Science", "English", "History", "Computer"};
    System.out.println("\n----- SUBJECT AVERAGES -----");
    for(int i=0; i<SUBJECTS; i++){
      double sum=0;
      for(int j=0; j<studentCount; j++){
        sum+=studentMarks[j][i];
      }
      double average = sum/studentCount;
      System.out.printf("%-10s : %.2f%n", subjects[i], average);
    }

    int topIndex=0;
    double highestAverage = calculateAverage(0);
    for(int i=1; i<studentCount; i++){
      double currentAverage = calculateAverage(i);
      if(currentAverage > highestAverage){
        highestAverage = currentAverage;
        topIndex = i;
      }
    }
    System.out.println("\n----- TOP PERFORMER -----");
    System.out.println("Name    : " + studentNames[topIndex]);
    System.out.printf("Average : %.2f%n", highestAverage);
    System.out.println("Grade   : " + getGrade(highestAverage));

    int aPlus=0;
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    int f=0;
    for(int i=0; i<studentCount; i++){
      String grade = getGrade(calculateAverage(i));

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