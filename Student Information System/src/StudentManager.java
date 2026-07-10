import java.util.ArrayList;

/* 
   manages the collection of students inside an ArrayList.
   handles the core business logic: Create, Read, Update, Delete, and Search.
 */
public class StudentManager{
  private ArrayList<Student> students = new ArrayList<>();

  // adds a student record to the list
  public void addStudent(Student student){
    students.add(student);
  }

  // returns the entire student collection
  public ArrayList<Student> getStudent(){
    return students;
  }

  // checks if the database is currently empty
  public boolean isEmpty(){
    return students.isEmpty();
  }

  //Searches for a student matching their exact ID 
  public Student searchStudent(String studentId){
    for(Student s : students){
      if(s.getStudentId().equals(studentId)){
        return s; // returns immediately if found
      }
    }
    return null; // returns null if no match is found
  }

  // updates student information based on ID
  public boolean updateStudent(String StudentId, String name, int age, double grade, String contact){
    Student s = searchStudent(StudentId);
    
    if(s == null)
      return false;
    
    s.setName(name);
    s.setAge(age);;
    s.setGrade(grade);;
    s.setContact(contact);;
    return true;
  }

  // delete a student record by ID
  public boolean deleteStudentRecord(String studentId){
    Student s = searchStudent(studentId);
    if(s == null)
      return false;
    students.remove(s);
    return true;
  }
  
}