class MethodOverLoading
  {
    public void sum(int no1, int no2)
    {
      System.out.println("sum of "+no1+" and  "+no2+" is = "+(no1+no2));
    }
    public void sum(float no1, float no2)
      {
        System.out.println("sum of "+no1+" and  "+no2+" is = "+(no1+no2));
      }
        public void sum(float no1, int no2)
          {
            System.out.println("sum of "+no1+" and  "+no2+" is = "+(no1+no2));
          }
        public void sum(int no1, float no2)
          {
            System.out.println("sum of "+no1+" and "+no2+" is = "+(no1+no2));
          }
  }
class App
  {
    public static void main(String[] args)
    {
      MethodOverLoading ob = new MethodOverLoading();
      ob.sum(1,2);
      ob.sum(1.5f,3);
    }
  }