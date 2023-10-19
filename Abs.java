
class Abs {
  // declaring DataMember
  private String brandname;
  private int screensize;
  private String model;

  // declaring setter
  public void setbrandname(String newbrandname) {
    brandname = newbrandname;
  }

  public void setscreensize(int newscreensize) {
    screensize = newscreensize;
  }

  public void setmodel(String newmodel) {
    model = newmodel;
  }

  // declaring getter
  public String getbrandname() {
    return this.brandname;
  }

  public int getscreensize() {
    return this.screensize;
  }

  public String getmodel() {
    return this.model;
  }

  class Main {
    public static void main(String... args) {
      mobile m1 = new mobile();
      // calling setter method
      m1.setbrandname("Samsung");
      m1.setscreensize(6);
      m1.setmodel("GalaxyS");
      // calling getter method
      System.out.println(m1.getbrandname);
      System.out.println(m1.getscreensize);
      System.out.println(m1.getmodel);
    }
  }
}