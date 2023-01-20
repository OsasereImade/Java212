package project3;
/**
 * 
 * @author Osasere
 * A program that checks for error and throws an exception
 * when necessary.
 *
 */
public class WordLine implements Comparable<WordLine> {
	private String word;
	private int lineNumber;
	/**
	 * 
	 * @param w sets the instance variable word.
	 * @param l sets the instance variable lineNumber.
	 */
	public WordLine (String w, int l) { //constructor that throws an exception
		if(l < 1) 
		throw new IllegalWordLineException ("Line number has to be greater than one");
		lineNumber = l;
		word = w;
	}
	@SuppressWarnings("serial")
	public class IllegalWordLineException
		extends IllegalArgumentException {
			public IllegalWordLineException (String message) { // extending an exception
				super(message);
			}
		}
	
	public String toString() { // converts to string
		return lineNumber + "\t"  + word;
	}
	
	public int compareTo(WordLine wl) { // comparing with the collection sort
		return word.compareToIgnoreCase(wl.word);
	}
}
