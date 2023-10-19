class constructor1
  {
    //parameterised constructor
    Greeting(String name)
    {
    System.out.println("Hello " + name);
    }
  }
class main
  {
    static public void main(String...args)
    {
      //object defination
      Greeting ob = new Greeting("Rakesh");
    }
  }