package firstProject;

import javax.swing.JOptionPane;

public class Project0 {

	public static void main(String[] args) {
	    
		String inputWord; 
		char ch = 'e', cha = 'E'; //Whatever sentence the user inputs we want to look for lower and upper case character 'E'.
		                        
		while(true) { //While the condition is true, the while loop would keep asking for a sentence until the user decides to type in the key-word "Stop".
		    
		   // This would open an input window containing the message in string parameter
		   //asking the user for an input.
		   inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence.  "); 
			if(inputWord.equals("Stop"))  
			   System.exit(0); // If the user inputs the word "Stop", we want to make sure the program ends.
			                                                                           
			if(inputWord.equalsIgnoreCase("STOP"))  
			   System.exit(0);  // Also, this is  to make sure all upper and lower case character of the word "STOP" is ignored and the program ends.
			                                       
			int makeShift = 0, shortTerm = 0; // The program should start count from zero
				
			for(int i = 0; i <inputWord.length(); i++) // the for loop goes through each character in the sentence.The method "length()" returns the length of the string inputed. 
			   if(inputWord.charAt(i) == ch) // if the sentence inputed contains a lower-case 'e'
			   makeShift++; // when lower-case 'e' is found it increments from zero
			                                            
			for(int j = 0; j<inputWord.length(); j++) // the for loop goes through each character in the sentence.The method "length()" returns the length of the string inputed
			   if(inputWord.charAt(j) == cha) // if the sentence inputed contains an upper-case 'E'
			   shortTerm++; // when upper-case 'E' is found it increments from zero
			                                          
			 // Output the number of lower and upper case letter 'e' to a JOptionPane window using string concatenation.
			JOptionPane.showMessageDialog(null,  "Number of lower case e's: " + makeShift + "\nNumber of upper case e's: " + shortTerm); 
	
		}//while loop

	}// main
	
}//Project0
