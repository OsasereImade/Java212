package project2;

/**
 * 
 * @author Osasere
 * This class contains the data and the next field
 *
 */
public class WordNode  {
		
	   String data; // data in string
	   WordNode next; // reference to next node
	   
	   /**
	    * 
	    * @param d - setting data to d
	    * @param ln - setting WordNode to ln
	    */
	   public WordNode(String d, WordNode ln)  { //creating a constructor and setting to declared variables
		   data = d;  
		   next = ln; 
	   }  // constructor
} // class wordNode
