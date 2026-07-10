import java.util.Scanner;

public class StudentInformationSystem{
  static Scanner sc = new Scanner(System.in);
  static StudentManager manager = new StudentManager();

  public static void main(String[] args) {
    while(true){
      System.out.println("*** Student Information System ***");
      System.out.println("1. Add New Student");
      System.out.println("2. View All Students");
      System.out.println("3. Search Student");
      System.out.println("4. Update Student");
      System.out.println("5. Delete Student Record");
      System.out.println("6. Exit");
      System.out.println("Enter your Choice:  ");

      int Choice = sc.nextInt();
      sc.nextLine();

      switch (Choice) {
        case 1:
          addStudent();
          break;
        
        case 2:
          viewAllStudent();
          break;

        case 3:
          searchStudent();
          break;

        case 4:
          updateStudent();
          break;
        
        case 5:
          deleteStudentRecord();
          break;

        case 6:
          System.out.println("Thank you for using Student Information System!");
          System.out.println("Exiting...");
          return;
        
          default:
            System.out.println("Invalid Choice! Please try again.");
      }
    }
  }

  static void addStudent(){
    System.out.println("*** ADD NEW STUDENT ***");

    System.out.println("ID: ");
    String studentId = sc.nextLine();

    System.out.println("Name: ");
    String name = sc.nextLine();

    System.out.println("Age: ");
    int age = sc.nextInt();

    System.out.println("Grade: ");
    double grade = sc.nextDouble();
    sc.nextLine();

    System.out.println("Contact: ");
    String contact = sc.nextLine();

    Student student = new Student(studentId, name, age, grade, contact);
    manager.addStudent(student);
    System.out.println("Student added successfully!");
  }

  static void viewAllStudent(){
    System.out.println("*** ALL STUDENTS ***");
    if(manager.isEmpty()){
      System.out.println("No students found!");
      return;
    }
    System.out.printf("%-15s %-20s %-8s %-8s %-15s\n", "Student ID", "Name", "Age", "Grade", "Contact");
    System.out.println("-".repeat(70));
    for(Student student : manager.getStudent()){
      System.out.printf("%-15s %-20s %-8d %-8.2f %-15s\n",student.getStudentId(), student.getName(), student.getAge(), student.getGrade(), student.getContact());
    }
  }

  static void searchStudent(){
    System.out.println("*** SEARCH STUDENT ***");
    System.out.println("Enter ID: ");
    String StudentId = sc.nextLine();

    Student s = manager.searchStudent(StudentId);

    if(s!=null){
      s.display();
    }
    else
      System.out.println("Student not found.");
  }

  static void updateStudent(){
    System.out.println("*** UPDATE STUDENT ***");

    System.out.println("Enter ID: ");
    String studentId = sc.nextLine();

    System.out.println("New Name: ");
    String name = sc.nextLine();

    System.out.println("New Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("New Grade: ");
    double grade = sc.nextDouble();
    sc.nextLine();

    System.out.println("New Contact: ");
    String contact = sc.nextLine();

    if(manager.updateStudent(studentId, name, age, grade, contact))
      System.out.println("Student Updated.");
    else
      System.out.println("Student not found.");
  }

  static void deleteStudentRecord(){
    System.out.println("Enter ID: ");
    String studentId = sc.nextLine();

    if(manager.deleteStudentRecord(studentId))
      System.out.println("Student deleted.");
    else
      System.out.println("Student not found.");
  }
}