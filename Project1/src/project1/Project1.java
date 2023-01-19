package project1;

public class Project1 {

   public static void main(String[] args) {
      String line;
      TextFileInput in = new TextFileInput(args[0]);
      
      // read the file to know how many line are in the file
      int size = 0;
      line = in.readLine();
      while (line != null) {
         size++;
         line = in.readLine();
      }// end of while loop
      
      // puts the originalText and count 
      // in a string size array
      String[] originalText = new String[size];
      String[] count = new String[size];

      // reads each line in the file
      in = new TextFileInput(args[0]);
      line = in.readLine();
      int currentLine = 0;
      while(line != null) {
         // initializes counters to increment any time a
         // vowel is encountered
         int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
         for(int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A' || line.charAt(i) == 'a') countA++;
            else if(line.charAt(i) == 'E' || line.charAt(i) == 'e') countE++;
            else if(line.charAt(i) == 'I' || line.charAt(i) == 'i') countI++;
            else if (line.charAt(i) == 'O' || line.charAt(i) == 'o') countO++;
            else if (line.charAt(i) == 'U' || line.charAt(i) == 'u') countU++;
            originalText[currentLine] = line;
         }//end of for loop
         
         line = in.readLine();// reads the file
         count[currentLine] = countA + " " + countE + " " + countI + " " + countO + " " + countU;
         currentLine ++;
      }//end of while loop
      
      
      VowelGUI.printVOWELtoJFrame(new VowelGUI(), originalText, count);

      in.close();

   }//close main

}//close class
