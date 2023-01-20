package project2;
/**
 * 
 * @author Osasere
 *
 */
public class SortedWordList extends WordList {
	/**
	 * 
	 * @param s - new string to add to sorted WordList
	 */
	public void add (String s) {
		WordNode node = new WordNode(s, null); // creating a new node and passing in argument s and null
		
		//list is empty, reference first and last to new node
		if (first == null) {
			first = node;
			last = node;
		} // if
		
		//list is not empty
		else { 
			WordNode nodeToCompare = first;
			WordNode previousNode = null;
			while (nodeToCompare != null) { // while there are more nodes to compare
				if (s.compareTo(nodeToCompare.toString()) < 0) { // if s < nodeToCompare
					node.next = nodeToCompare;
					if (first == nodeToCompare) { // there is no node in front of nodeToCompare
						first = node;
						break;
					}
					else { // if there is another node in front of where i am about to insert
						previousNode.next = node;
						break;
					}
				} 
				else { // if s is greater than nodeToCompare, s should be on the right
					if (nodeToCompare == last) { // if I am already comparing with the last node
						nodeToCompare.next = node;
						last = node;
						break;
					}
					else {
						previousNode = nodeToCompare;
						nodeToCompare = nodeToCompare.next;
					}
				}
			} // while 
		}
		length++;
	}

}//SortedWordList
