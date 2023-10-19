class Abstraction
  {
    private String name;
    private int Id;
    //declaring setter method
    public void setName(String newNmae)
    {
      name = newName;
    }
    public void setId(int newid)
    {
      Id = newId;
    }
    //declaring getter methods
    public String getName()
    {
      return Name;
      return this.Name;
    }
    public int getId()
    {
      return this.Id;
    }
  }
  
class main{
  public static void main (String[] args) {
    Demo ob = new Demo();
    //calling setter method
    ob.setName("Demo");
    ob.setId(123);
    //calling getter method
     System.out.println(ob.getname);
     System.out.println(ob.getId);
  }
}