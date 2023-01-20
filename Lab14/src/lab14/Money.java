package lab14;

public class Money {
   protected int dollars;
   protected int cents;  
   public Money () {
      dollars = 0;
      cents = 0;
   }
   
   public Money (int d, int c) {
      dollars = d;
      cents = c;
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
  
  
  
   
////      // LAB 15
////      m1 = new Money(4,87);
////      m2 = new Money(5,243);
////   
////      m1.add(m2);
////   
////      System.out.println(m1.toString());
////   
   
//   
//   public void add (Money m) {
////      cents = cents + m.cents;
////      if(cents > 100) {
////         dollars = cents / 100;
////         cents = dollars % 100;
////      }
//      dollars = dollars + m.dollars;
//      cents = cents + m.cents;
//      while (cents > 100) {
//         dollars++;
//         cents = cents - 100;
//      }
//   }
//   
   public int compareTo(Money other) {
      return toString().compareTo(other.toString());
   }
   
   public boolean equals(Object other) {
      return(other != null
            && getClass() == other.getClass() 
            && toString().equals(((Money)other).toString()));
   }
   
   public static void main(String[] args) {
      // LAB 14
      Money m1 = new Money(), m2= new Money(6,5);
      System.out.println(m1.getCents());
      System.out.println(m2.getDollars());
      System.out.println(m2);
      System.out.println(m1.compareTo(m2));
      System.out.println(m1.equals(m2));
   }

   public void add(Money m) {
      dollars = dollars + m.dollars;
      cents = cents + m.cents;
        while (cents > 100) {
         dollars++;
         cents = cents - 100;
        }
  }
}
   
 




//private int dollars;
//private int cents;
//
//public Money() {
//   dollars = 0;
//   cents = 0;
//}
//
//public Money(int d, int c) {
//   dollars = d;
//   cents = c;
//   while (cents > 100) {
//      dollars++;
//      cents = cents - 100;
//   }
//}
//
//public int getDollars() {
//   return dollars;
//}
//public int getCents() {
//   return cents;
//}
//public void setDollars(int d) {
//   dollars = d;
//}
//public void setCents(int c) {
//   cents = c;
//   while (cents > 100) {
//      dollars++;
//      cents = cents - 100;
//   }
//}
//
//public String toString() {
//   String line = "$" + dollars + ".";
//   if (cents < 10) line += ("0" + cents);
//   else line += cents;
//   return line;
//}
//
//public int compareTo(Money other) {
//   return toString().compareTo(other.toString());
//}
//
//public boolean equals(Object other) {
//   return (other != null &&
//           getClass() == other.getClass() &&
//           toString().equals(((Money) other).toString()));
//}
//
//public void add(Money m) {
//   dollars = dollars + m.dollars;
//   cents = cents + m.cents;
//   while (cents > 100) {
//      dollars++;
//      cents = cents - 100;
//   }
//}
//
//public static void main(String[] args) {
//   Money m1, m2;
//   m1 = new Money(4,87);
//   m2 = new Money(5,243);
//   m1.add(m2);
//   System.out.println(m1.toString());
//}
//}
