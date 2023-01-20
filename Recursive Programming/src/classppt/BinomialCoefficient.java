package classppt;


public class BinomialCoefficient {

   public static void main(String[] args) {
      int[] n = {4,4,4,4,4};
      int[] r = {0,1,2,3,4};
      int x,y;
      for (int i=0; i<n.length; i++) {
         x=n[i];
         y=r[i];
         System.out.println(x+" choose "+y+" is "+bc(x,y));
      }
   }
   private static int bc (int n, int r) {
       if (n==0 || r==0 ||n==r) {
            return 1;
      }
      else
         return bc(n-1,r)+bc(n-1,r-1);
   }
}
