//Wap to calculate the Area of Tringle, Circle and Rectangle by defining a single method name area() 
class Area{
  public void area(float Height, float Breath)
  {
    int area = Height*Breath;
    System.out.println("area of triangle"+area);
  }
  public void area(int radius)
  {
    int area = (int)(3.14*radius*radius);
    System.out.println("area of circle" +area);
  }
  public void area(int Length, int Breath)
  {
    int area = Length*Breath;
    System.out.println("area of rectangle"+area);
  }
}

  public static void main(String[] args) {
    Area ob = new Area();
    ob.area(5.3f,9.0f);
    ob.area(9);
    ob.area(7,9);
  }

