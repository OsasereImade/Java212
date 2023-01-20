package lab6;

import javax.swing.JOptionPane;

    public class Lab6Program1 {

        public static void main(String[] args) {
            int [] wordArray = Textfileinput(args[0]);

            //Output to a JOptionPane window the sum and the average
            JOptionPane.showMessageDialog(null, " The sum is " + sum(wordArray, wordArray.length) + " " + "\n The average is:  " + average(wordArray, wordArray.length));

}//main

        public static int[] Textfileinput(String filename) {

            int [] wordArray = new int[100];
            int length = 0;
            TextFileInput in = new TextFileInput(filename);
            String line = in.readLine(); // this is to read the first line
            while(line != null) { // the is still more lines to read
                wordArray[length] = Integer.parseInt(line); // you want to add the current line to the word array
                length++; // increment length
                line = in.readLine(); // to read next line
            }// end of while
                in.close();
                return wordArray;
        }// end of TextFileInput


            private static int sum(int[] myArray, int myArraySize) {
                int sum = 0;
                for(int i = 0; i < myArraySize; i++) {
                    sum += myArray[i];
                }
                return sum;
            }

            private static int average(int[] myArray, int myArraySize) {
                return sum(myArray, myArraySize) / myArraySize;
            }

}//class Lab6Program1
