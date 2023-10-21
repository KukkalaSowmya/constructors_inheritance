//WAP to accept a number and calculate the square of int, long, float, and Double with the help of method overloading 
class MethodOverLoading3{
  public void square(int no1)
  {
    System.out.println(no1*no1);
  }
  public void square(long no1)
  {
    System.out.println(no1*no1);
  }
  public void square(float no1)
  {
    System.out.println(no1*no1);
  }
  public void square(double no1)
  {
    System.out.println(no1*no1);
  }
}
class App
  {
    public static void main(String[] args)
    {
      MethodOverLoading3 ob = new MethodOverLoading3();
      ob.square(7);
      ob.square(3l);
      ob.square(8.9f);
      ob.square(1.4356);
    }
  }