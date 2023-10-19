    import java.util.*;
class Laptop1{
private String brandName;
private double screenSize;
private double weight;
private double price;
private String processor;
private int ssd;
private String graphicCard;
// Getter and Setter methods for brandName
public String getBrandName() {
return brandName;
}
public void setBrandName(String brandName) {
this.brandName = brandName;
}
// Getter and Setter methods for screenSize
public double getScreenSize() {
return screenSize;
}
public void setScreenSize(double screenSize) {
this.screenSize = screenSize;
}
// Getter and Setter methods for weight
public double getWeight() {
return weight;
}
public void setWeight(double weight) {
this.weight = weight;
}
// Getter and Setter methods for price
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
// Getter and Setter methods for processor
public String getProcessor() {
return processor;
}
public void setProcessor(String processor) {
this.processor = processor;
}
// Getter and Setter methods for ssd
public int getSsd() {
return ssd;
}
public void setSsd(int ssd)
{
this.ssd = ssd;
}
// Getter and Setter methods for graphicCard
public String getGraphicCard()
{
return graphicCard;
}
public void setGraphicCard(String graphicCard)
{
this.graphicCard = graphicCard;
}
}
public class Laptop
{
    public static void main (String[] args) {​​
        // Creating objects of class Laptop
        Laps laptop1 = new Laps();
        laptop1.setBrandName("Dell");
        laptop1.setScreenSize(15.6);
        laptop1.setWeight(2.3);
        laptop1.setPrice(1200.0);
        laptop1.setProcessor("Intel Core i7");
        laptop1.setSsd(512);
        laptop1.setGraphicCard("NVIDIA GeForce GTX 1650");
        Laps laptop2 = new Laps();
        laptop2.setBrandName("HP");
        laptop2.setScreenSize(14.0);
        laptop2.setWeight(1.8);
        laptop2.setPrice(1000.0);
        laptop2.setProcessor("Intel Core i5");
        laptop2.setSsd(256);
        laptop2.setGraphicCard("Intel UHD Graphics");
        // Printing out the details of the laptops
        System.out.println("Laptop 1:");
        System.out.println("Brand: " + laptop1.getBrandName());
        System.out.println("Screen Size: " + laptop1.getScreenSize() + " inches");
        System.out.println("Weight: " + laptop1.getWeight() + " kg");
        System.out.println("Price: $" + laptop1.getPrice());
        System.out.println("Processor: " + laptop1.getProcessor());
        System.out.println("SSD Capacity: " + laptop1.getSsd() + " GB");
        System.out.println("Graphics Card: " + laptop1.getGraphicCard());
        System.out.println("\nLaptop 2:");
        System.out.println("Brand: " + laptop2.getBrandName());
        System.out.println("Screen Size: " + laptop2.getScreenSize() + " inches");
        System.out.println("Weight: " + laptop2.getWeight() + " kg");
        System.out.println("Price: $" + laptop2.getPrice());
        System.out.println("Processor: " + laptop2.getProcessor());
        System.out.println("SSD Capacity: " + laptop2.getSsd()+ "GB");
System.out.println("Graphics Card:"+laptop2.getGraphicCard());
}​​
  }​​
import java.util.*;
class Laps{​​
private String brandName;
private double screenSize;
private double weight;
private double price;
private String processor;
private int ssd;
private String graphicCard;
// Getter and Setter methods for brandName
public String getBrandName() {​​
return brandName;
}​​
public void setBrandName(String brandName) {​​
this.brandName = brandName;
}​​
// Getter and Setter methods for screenSize
public double getScreenSize() {​​
return screenSize;
}​​
public void setScreenSize(double screenSize) {​​
this.screenSize = screenSize;
}​​
// Getter and Setter methods for weight
public double getWeight() {​​
return weight;
}​​
public void setWeight(double weight) {​​
this.weight = weight;
}​​
// Getter and Setter methods for price
public double getPrice() {​​
return price;
}​​
public void setPrice(double price) {​​
this.price = price;
}​​
// Getter and Setter methods for processor
public String getProcessor() {​​
return processor;
}​​
public void setProcessor(String processor) {​​
this.processor = processor;
}​​
// Getter and Setter methods for ssd
public int getSsd() {​​
return ssd;
}​​
public void setSsd(int ssd)
{​​
this.ssd = ssd;
}​​
// Getter and Setter methods for graphicCard
public String getGraphicCard()
{​​
return graphicCard;
}​​
public void setGraphicCard(String graphicCard)
{​​
this.graphicCard = graphicCard;
}​​
}​​
public class Laptop
{​​
    public static void main (String[] args) {​​
        // Creating objects of class Laptop
        Laps laptop1 = new Laps();
        laptop1.setBrandName("Dell");
        laptop1.setScreenSize(15.6);
        laptop1.setWeight(2.3);
        laptop1.setPrice(1200.0);
        laptop1.setProcessor("Intel Core i7");
        laptop1.setSsd(512);
        laptop1.setGraphicCard("NVIDIA GeForce GTX 1650");
        Laps laptop2 = new Laps();
        laptop2.setBrandName("HP");
        laptop2.setScreenSize(14.0);
        laptop2.setWeight(1.8);
        laptop2.setPrice(1000.0);
        laptop2.setProcessor("Intel Core i5");
        laptop2.setSsd(256);
        laptop2.setGraphicCard("Intel UHD Graphics");
        // Printing out the details of the laptops
        System.out.println("Laptop 1:");
        System.out.println("Brand: " + laptop1.getBrandName());
        System.out.println("Screen Size: " + laptop1.getScreenSize() + " inches");
        System.out.println("Weight: " + laptop1.getWeight() + " kg");
        System.out.println("Price: $" + laptop1.getPrice());
        System.out.println("Processor: " + laptop1.getProcessor());
        System.out.println("SSD Capacity: " + laptop1.getSsd() + " GB");
        System.out.println("Graphics Card: " + laptop1.getGraphicCard());
        System.out.println("\nLaptop 2:");
        System.out.println("Brand: " + laptop2.getBrandName());
        System.out.println("Screen Size: " + laptop2.getScreenSize() + " inches");
        System.out.println("Weight: " + laptop2.getWeight() + " kg");
        System.out.println("Price: $" + laptop2.getPrice());
        System.out.println("Processor: " + laptop2.getProcessor());
        System.out.println("SSD Capacity: " + laptop2.getSsd()+ "GB");
System.out.println("Graphics Card:"+laptop2.getGraphicCard());
}
  }
  