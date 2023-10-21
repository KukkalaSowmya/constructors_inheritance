class ThisKeyword
  {
    //instance variable
   private int num;
    public void setnum(int num)
    {
      this.num = num;
      }
    private int getnum()
    {
      return this.num;
    }
    public static void main ()
    {
      ThisKeyword ob = new ThisKeyword();
      ob.setnum(23);
      System.out.println(ob.getnum());
    }
  }
 