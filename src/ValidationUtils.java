public class ValidationUtils {
  public static boolean isValidAge(int age){
    return age>=5 && age<=100;
  }
  public static boolean isValidGrade(double grade){
    return grade >=0 && grade<=100;
  }
}
