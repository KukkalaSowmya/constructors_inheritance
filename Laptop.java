class Laptop{
  private String brandname;
  private int screensize;
  private int price;
  private String processor;
  private int weight;
  private int ssd;
  private int graphiccard;
  
//declaring setter 
  public void setbrandname(String newbrandname) {
    brandname = newbrandname;
  }
  public void setscreensize(int newscreensize) {
    screensize = newscreensize;
  }
  public void setprice(int price) {
    price = newprice;
  }
  public void setprocessor(int newprocessor) {
    processor = newprocessor;
  }
  public void setweight(int newweight) {
    weight = newweight;
  }
  public void setssd(int newssd) {
    ssd = newssd;
  }
  public void setgraphiccard(int newgraphiccard) {
    graphiccard = newgraphiccard;
  }
  //declaring getter
  public String getbrandname() {
    return this.brandname;
  }
  public int getscreensize() {
    return this.screensize;
  }
  public int getprice() {
    return this.price;
  }
  public String getprocessor() {
    return this.processor;
  }
  public int getweight() {
    return this.weight;
  }
  public int getssd() {
    return this.ssd;
  }
  public int getgraphiccard() {
    return this.graphiccard;
  }
}
class main {
  public static void main (String[] args) {
   laptop l1 = new laptop();
    //calling setter mathod
    l1.setbrandname("Dell");
    l1.setscreensize(15);
    l1.setprice(200000);
    l1.setprocessor("i5");
    l1.setweight(5);
    l1.setssd(500);
    l1.setgraphiccard(4);
    //calling getter mathod
    System.out.println(l1.getbrandname);
    System.out.println(l1.getscreensize);
    System.out.println(l1.getprice);
    System.out.println(l1.getprocessor);
    System.out.println(l1.getweight);
    System.out.println(l1.getssd);
    System.out.println(l1.getgraphiccard);

    laptop l2 = new laptop();
    l2.setbrandname("HP");
    l2.setscreensize(17);
    l2.setprice(250000);
    l2.setprocessor("i7");
    l2.setweight(7);
    l2.setssd(500);
    l2.setgraphiccard(8);
    System.out.println(l2.getbrandname);
    System.out.println(l2.getscreensize);
    System.out.println(l2.getprice);
    System.out.println(l2.getprocessor);
    System.out.println(l2.getweight);
    System.out.println(l2.getssd);
    System.out.println(l2.getgraphiccard);
  }
  }