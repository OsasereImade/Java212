package javatwotwelve;

public class Question2 {
   public static void main(String[] args) {
      int arr[][] = {{10, 45}, {2, 42, 67, 5}, {3, 21}};
      System.out.println(getSumOfRow(arr, 1));  //prints the sum of row 1
   }
   
      private static int getSumOfRow (int [][] myArray, int row) {
         int sum = 0;
         for(int i = 0; i < myArray[row].length; i++) { // we don't need a 2d array in this case
            sum += myArray[row][i];
         }
         return sum;
      }
}
