package lab8;

import java.util.StringTokenizer;

public class Lab8 {
    
    //public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
        public static void main(String[] args) {
            int[][] myArray; // a two-dimensional array is declared.
            myArray = readFile(args[0]);// the readFile method reads the file indicated by the passed file path and returns its contents
            printArray(myArray);
            printArrayEven(myArray);
        }
        
            private static void printArray (int[][] theArray) {
               for (int i=0; i<theArray.length; i++) {
                  for (int j=0; j<theArray[i].length;j++)
                     display(theArray[i][j]);
                  System.out.println();
               }
            }
            private static void display (int num){
               System.out.print(num+" ");
            }
            private static void printArrayEven(int[][] theArray){
               for(int i = 0; i <theArray.length; i++) {
                   for (int j = 0; j < theArray[i].length; j++) {
                       if(theArray[i][j] %2 != 0) {
                           System.out.print("*" + " ");
                       }//end of if condition
                       else {
                           display(theArray[i][j]);
                       } //end of else condition
                   }//second for loop
                   System.out.println();
               }//first for loop
            }//printArrayEven
            
            
            public static int[][] readFile(String filename) { //reads the file in the passed file path
                TextFileInput in = new TextFileInput(filename);
                String line = in.readLine();
                StringTokenizer rowCol = new StringTokenizer(line, ",");
                int row = Integer.parseInt(rowCol.nextToken());// reads the first line as the row
                int col = Integer.parseInt(rowCol.nextToken());// reads this line as the column
                int[][] newArray = new int[row][col];// putting the above in a two-dimensional array
                for (int r = 0; r < row; r++) {
                   line = in.readLine();//going through the loop and reading the digits
                   StringTokenizer myTokens = new StringTokenizer(line, ","); // read from the sub-strings
                   for (int c = 0; c < col; c++) {
                      newArray[r][c] = Integer.parseInt(myTokens.nextToken()); // set to newArray.
                   }
                }
                return newArray;
            }
            
 }//lab8 class