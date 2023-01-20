package lab14;

   public class Moneycntd {
      protected int dollars;
      protected int cents;  
      public Moneycntd () {
         dollars = 0;
         cents = 0;
      }
      
      public Moneycntd (int d, int c) {
         dollars = d;
         cents = c;
         while(cents > 100) {
            dollars++;
            cents = cents - 100;
         }
      }  
     
      public int getDollars() {
         return dollars;
      }
      
      public int getCents() {
         return cents;
      }
     
      public String toString() {
         String c;
         if(cents<10) {
            c = "0" + cents;
         } 
         else {
            c = "" + cents;
         }
         return "$ " + dollars + "." + c;
      }
      
      public boolean equals(Object other) {
         return(other != null
               && getClass() == other.getClass() 
               && toString().equals(((Money)other).toString()));
      }
      
      public void add (Money m) {
         dollars = dollars + m.dollars;
         cents = cents + m.cents;
           while (cents > 100) {
            dollars++;
            cents = cents - 100;
           }
      }

      public static void main(String[] args) {
       Money m1, m2;
       m1 = new Money(4,87);
       m2 = new Money(5,243);
       m1.add(m2);
       System.out.println(m1.toString());
      }
}
