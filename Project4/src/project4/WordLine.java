package project4;
import java.util.*;
/**
 * 
 * @author Osasere
 * A program that checks for error and throws an exception
 * when necessary.And also, orders objects of each class that implements it.
 *
 */
public class WordLine implements Comparable<WordLine> {
	private String word;
	private ArrayList<Integer>lineNumber = new ArrayList<> ();
	/**
	 * 
	 * @param w sets the instance variable word.
	 * @param l sets the instance variable lineNumber.
	 */
	public WordLine (String w, int l) { //constructor that throws an exception
		if(l < 1) 
		throw new IllegalWordLineException ("Line number has to be greater than one");
		lineNumber.add(l);
		word = w;
	}
	/**
	 * 
	 * @param l The number to be added.
	 */
	public void add(int l) {
		lineNumber.add(l);
	}
	
	public String getWord() {
		return word;
	}
	
	@SuppressWarnings("serial")
	public class IllegalWordLineException
		extends IllegalArgumentException {
			public IllegalWordLineException (String message) { // extending an exception
				super(message);
			}
		}
	
	public String toString() { // converts to string
		String str =  word + ":\t";
		str += lineNumber.get(0); // print the first line number
		for (int i = 1; i < lineNumber.size(); i++) {
			str += ", " + lineNumber.get(i);
		}
		return str;
	}
	
	public int compareTo(WordLine wl) { // comparing with the collection sort
		return word.compareToIgnoreCase(wl.word);
	}
}
