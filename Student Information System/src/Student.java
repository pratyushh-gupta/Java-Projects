// Create Student class with attributes: name, age, grade, studentId, contact

public class Student{
  private String studentId;
  private String name;
  private int age;
  private double grade;
  private String contact;

  public Student(String studentId, String name, int age, double grade, String contact){
    this.studentId=studentId;
    this.name=name;
    this.age=age;
    this.grade=grade;
    this.contact=contact;
  }

  public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

  void display(){
    System.out.println("ID: " + studentId);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Grade: " + grade);
    System.out.println("Contact: " + contact);
  }
}