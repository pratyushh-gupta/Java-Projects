// data validation rules
public class ValidationUtils {
  // validates that the age is a positive integer
  public static boolean isValidAge(int age){
    return age>=5 && age<=100;
  }
  // validates that the grade is in a  valid range (0 - 100)
  public static boolean isValidGrade(double grade){
    return grade >=0.0 && grade<=100.0;
  }
}
