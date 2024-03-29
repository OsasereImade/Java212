package classppt;

public class EuclidianGCD {

   public static void main(String[] args) {
      int[] testNumerators = {4,6,1,0,15,20};
      int[] testDenominators = {8,18,2,5,225,225};
      int n,d;
      for (int i=0; i<testNumerators.length; i++) {
         n=testNumerators[i];
         d=testDenominators[i];
         System.out.println("The greatest common divisor of "+n+" and "+d+
               " is "+gcd(n,d));
      }
   }
   private static int gcd (int n, int d) {
         if (d == 0) return n;
         else return gcd(d, n % d);
   }
}