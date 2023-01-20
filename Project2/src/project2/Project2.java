package project2;

import java.util.StringTokenizer;

import project2.WordGUI;
import project2.TextFileInput;

public class Project2 {
	
	public static void main(String[] args) {
		String line;
	    TextFileInput in = new TextFileInput(args[0]);
	    
	    // read the whole file to know how many lines are in this file
	    //know how many lines the file has 
	    int size = 0;
		line = in.readLine();
	    while (line != null) {
	    	size++;
			line = in.readLine();
	    }// close while
		in.close();
		
		String[] originalText = new String[size]; //putting the originalText in a string size array
		UnsortedWordList a = new UnsortedWordList(); //creating an object of UnsortedWordList
		SortedWordList b = new SortedWordList(); //creating an object of sortedWordList
		
	    // read text line by line
	    in = new TextFileInput(args[0]);
		line = in.readLine();
		int count = 0;
		while(line != null) {
			originalText[count]= line;
			count++;
			
			StringTokenizer myTokens = new StringTokenizer(line," ");// read a line separated by tokens with spaces
			while (myTokens.hasMoreTokens()) {
				String str = myTokens.nextToken();
				a.append(str); // break each token and append into unsorted
				b.add(str); // break each token and add into sorted
			}//while loop

			line = in.readLine();// reads the next line
		}// close while loop
				
		in.close(); // close file.
		
		//print to jframe
		WordGUI.printWORDtoJFrame(new WordGUI(), originalText, a.toString(), b.toString());
		

	}// close main
}
