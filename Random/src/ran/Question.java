package ran;

public class Question {
   public static void main (String[] args) {
      Alpha myArray [] = new Alpha[4];
      myArray[0] = new Beta(1);
      myArray[1] = new Beta(3);
      myArray[2] = new Gamma(5);
      myArray[3] = new Gamma(7); 
      } 
   }  
     class Alpha {
      public Alpha(int x) {
         super();
         System.out.println("I am Alpha, and x is "+x);
         } 
      } 
    class Beta extends Alpha{ 
      public Beta (int y) {
         super(y+3);
         System.out.println("I am Beta, and y is "+y);
         } 
      } 
    class Gamma extends Alpha { 
      public Gamma (int y){
         super(y+5);
         System.out.println("I am Gamma and y is "+y); } } 
