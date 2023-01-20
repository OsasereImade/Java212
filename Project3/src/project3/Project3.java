package project3;
import java.util.StringTokenizer;
import java.util.*;

/**
 * 
 * @author Osasere
 * A program that works with LinkedList and sorting an original text.
 *
 */
public class Project3 {
	
	public static String[] originalText;
	public static LinkedList<WordLine> b;
	/**
	 * 
	 * @param filename The file to be read and sorted.
	 */
	public static void readFile(String filename) {
		String line;
	    TextFileInput in = new TextFileInput(filename);
	    
	    // read the whole file to know how many lines are in this file 
	    int size = 0;
		line = in.readLine();
	    while (line != null) {
	    	size++;
			line = in.readLine();
	    }// close while
		in.close();
		
		originalText = new String[size]; //putting the originalText in a string size array
		b = new LinkedList<WordLine>(); //creating an object of LinkedList
		
	    // read text line by line
	    in = new TextFileInput(filename);
		line = in.readLine();
		int count = 0;
		while(line != null) {
			originalText[count]= line;
			count++;
			StringTokenizer myTokens = new StringTokenizer(line," ");// read a line separated by tokens with spaces
			while (myTokens.hasMoreTokens()) {
				String str = myTokens.nextToken();
				b.add(new WordLine(str, count));
			}//while

			line = in.readLine();// reads the next line
		} // while line		
		in.close(); // close file.
		Collections.sort(b); // sorting LinkedList
	} // readFile
	/**
	 * 
	 * @param vowel Sorting the vowels in the original text
	 *        and separating using string tokenizer
	 */
	public static void appendVowel(String vowel) {
		b = new LinkedList<WordLine>();
		for (int i = 0; i < originalText.length; i++) {
			String line = originalText[i];

			StringTokenizer myTokens = new StringTokenizer(line," ");// read a line separated by tokens with spaces
			while (myTokens.hasMoreTokens()) {
				String str = myTokens.nextToken();
				if (str.substring(0, 1).equalsIgnoreCase(vowel)) 
					b.add(new WordLine(str, i+1)); // break each token and add into sorted while numbered
			}//while loop
		}// close for loop
		
		Collections.sort(b); // to sort the LinkedList b
	} // appendVowel
	
	public static void main(String[] args) {		
		WordGUI.printWORDtoJFrame(); // //print to JFrame	
	}// close main
}
