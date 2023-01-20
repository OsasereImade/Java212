package classppt;

public class Factorial {

   public static void main(String[] args) {
      int[] testValues = {4,6,1,0};
      int n;
      for (int i=0; i<testValues.length; i++) {
         n=testValues[i];
         System.out.println("Factorial("+n+") = "+factorial(n));
      }
   }
   private static int factorial (int n) {
      if (n==0)
         return 1;
      else
         return n*factorial(n-1);
   }
}
