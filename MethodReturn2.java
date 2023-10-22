public class MethodReturn2{
  public static int square(int num) {
    //return statement
    return num*num;
  }
public static void main(String[] args) {
  int result;
  //call the mathod
  //store returned value to result
  result = square(10);
  System.out.println("squared value of 10 is: " +result);
}
}
