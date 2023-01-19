package lab05;

import javax.swing.JOptionPane;

public class Lab5Program1 {

	public static void main(String[] args) {
		String[] wordArray = Textfileinput(args[0]); // Reading from a file name given as command line argument
		String isOrIsNot, inputWord; //This line asks for the input.
		
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all Lower case:  ");
			
			//if the user input is contained within the array return true
			if(wordIsThere(inputWord, wordArray))
				isOrIsNot = " is "; //set to is if the word is on the list
			else
				isOrIsNot = "is not "; //set to is not if the word is not on the list
			//Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, " The word " + inputWord + " " + isOrIsNot + "on the list. ");

	}//main
	public static boolean wordIsThere(String findMe, String[] theList) { // basically going through the wordArray
		for(int i = 0; i<theList.length; i++) {
			if(findMe.equals(theList[i])) {
			    return true;
			}
			
	    }// end of for loop
        return false;
		
	}// word is there
	
	public static String[] Textfileinput(String filename) {
		
		String[] wordArray = new String[100];
		int length = 0;
		TextFileInput in = new TextFileInput(filename);
		String line = in.readLine();
		while(line != null) {
			wordArray[length] = line;
			length++;
			line = in.readLine();
		}// end of while
		in.close();
		return wordArray;
	}// end of TextFileInput
	

}//class Lab5Program1
