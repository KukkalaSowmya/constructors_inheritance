class MethodReturn3{
  //method with no paramater
  public void display1() {
    System.out.println("Method without parameter");
  }
  public static void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }
  public static void main(String[] args) {
    //create an object of main
    MethodReturn2 obj = new MethodReturn2();
    //calling method with no parameter
    obj.display1();
    //calling method with the single paramater 
    obj.display2(24);
  }
  }
