package project2;

/**
 * 
 * @author  - This class extends WordList with an append method
 *
 */
public class UnsortedWordList extends WordList {
	/**
	 * 
	 * @param s - passing s as a string argument
	 */
	public void append (String s) {
		
		//creating a new node and passing argument s and null
		WordNode node = new WordNode(s, null);
		
		//list is not empty, reference and set the last node to new node
		if (first != null) {
			//first.next = node;
			last.next = node;
			last = node;
		}
		
		//list is empty, reference first and last to new node
		if (first == null) {
			first = node;
			last = node;
		}
		length++; // increase the length
	} // append method

}// UnsortedWordList
