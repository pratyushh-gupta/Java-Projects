import java.util.ArrayList;

public class StudentManager{
  private ArrayList<Student> students = new ArrayList<>();

  public void addStudent(Student student){
    students.add(student);
  }

  public ArrayList<Student> getStudent(){
    return students;
  }

  public boolean isEmpty(){
    return students.isEmpty();
  }

  public Student searchStudent(String studentId){
    for(Student s : students){
      if(s.getStudentId().equals(studentId)){
        return s;
      }
    }
    return null;
  }

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

  public boolean deleteStudentRecord(String studentId){
    Student s = searchStudent(studentId);
    if(s == null)
      return false;
    students.remove(s);
    return true;
  }


}