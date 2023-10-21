class ThisKeyword
  {
    //instance variable
   int num;
 void printval()
    {
      System.out.println(this.num);
    }
    void test()
    {
      this.printval();
    }
    public static void main(String[] args)
    {
      //local variable
      int num;
      ThisKeyword t = new ThisKeyword();
      num = 21;
      ThisKeyword ob = new ThisKeyword();
      ob.printval();
    }
  }