class MethodOverLoading2{
  public void mul(int no1, int no2)
  {
    System.out.println(no1*no2);
  }
  public void sub(float no1, float no2)
  {
  System.out.println(no1-no2);
  }
public void div(float no1 , int no2)
  {
  System.out.println(no1/no2);
  }
  public void mod(int no1, float no2)
  {
    System.out.println(no1%no2);
  }
}
class App
  {
    public static void main(String[] args){
      MethodOverLoading2 ob = new MethodOverLoading2();
      ob.mul(2,3);
      ob.sub(2.5f,3);
      ob.div(2.5f,3);
      ob.mod(2,3);
    }
  }