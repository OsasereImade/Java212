package project2;

/**
 * 
 * @author Osasere
 * Creates a class WordList with data of Strings
 *
 */
public class WordList {
	// creating instance variables and being able to change the value
	protected WordNode first = null;
	protected WordNode last = null;
	protected int length = 0;
	
	public WordList() { // constructor
		first = null;
		last = null;
		length = 0;
	}
	
	public String toString() { //overriding toString() method to return string value of WordList class
		String str = ""; // initializing str to an empty string
		WordNode node = first;
		while (node !=  null) {
			str += node.data + "\n"; // puts in the data of node into str 
			node = node.next;  // putting next node into node
		}// while
		
		return str; 
	} // toString () method
} // WordList
