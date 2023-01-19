package lab7;

public class TwoDimArray {
    
    public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
            
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
                   for (int j = 0; j < theArray.length; j++) {
                       if(theArray[i][j] %2 != 0) {
                           System.out.print("*" + " ");
                       }//end of if condition
                       else {
                           display(theArray[i][j]);
                       } //end of else condition
                   }//second for loop
                   System.out.println();
               }//first for loop
            }
         }