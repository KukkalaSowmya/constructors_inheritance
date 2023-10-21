class StaticKeyword2
{
  static int counter;
  public static void print()
  {
    return counter++;
  }
  public static void main(String args[])
  {
   System.out.println(StaticKeyword2.print());
    System.out.println(StaticKeyword2.print());
  }
}