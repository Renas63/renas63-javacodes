package Encapsulation;

public class Computer {
    private String brand;
    private String CPU;
   private  int price;

   public Computer(String brand, String CPU, int price){
       this.brand= brand;
       this.CPU= CPU;
       this. price= price;

   }
   public String getBrand(){
       return brand;

   }
   public String getCPU(){
       return CPU;

   }
   public int getPrice(){
       return price;

   }
}
