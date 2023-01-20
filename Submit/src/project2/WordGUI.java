package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WordGUI extends JFrame {
	
	public WordGUI() {
		
	}
	
	public static void printWORDtoJFrame(WordGUI myGUI, String[] originalText, String unSortedWords, String sortedWords) {

        myGUI = new WordGUI();
        myGUI.setSize(1500, 1500);
        myGUI.setLocation(2, 2);
        myGUI.setTitle("LinkedLists");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = myGUI.getContentPane();
        TextArea mySortedWords = new TextArea();
        TextArea myOriginalText = new TextArea();
        TextArea myUnsortedWords = new TextArea();
        myContentPane.add(myOriginalText, BorderLayout.WEST);
        myContentPane.add(mySortedWords, BorderLayout.EAST);
        myContentPane.add(myUnsortedWords, BorderLayout.CENTER);
        for (int i=0;i<originalText.length;i++) {
            myOriginalText.append(originalText[i] + "\n"); // this is to print out "input.txt" row by row
        }
        myUnsortedWords.append(unSortedWords + "\n"); // this is to print out "input.txt" row by row
        mySortedWords.append(sortedWords + "\n"); // this is to print out "input.txt" row by row        

        myGUI.setVisible(true);
        
	}

}
