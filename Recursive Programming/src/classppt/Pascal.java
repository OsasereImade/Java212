package classppt;

import javax.swing.*;
public class Pascal {

      public static void main (String[] args){
         int numRows = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rows?"))-1;
         for (int i=0;i<= numRows;i++){
            for (int j=0; j<=i; j++)
               System.out.print(bc(i,j)+" ");
            System.out.println();
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