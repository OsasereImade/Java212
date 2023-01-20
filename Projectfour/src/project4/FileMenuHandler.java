package project4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JFileChooser;
/**
 * 
 * @author Osasere 
 * A program that uses all the characteristics of a JFrame
 * createMenu(), FileMenuHandler, and handle events.
 * Also, makes use of interface.
 *
 */
public class FileMenuHandler implements ActionListener {
	JFrame jframe;
/**
 * 
 * @param jf To handle events.
 */
	public FileMenuHandler (JFrame jf) {
		   jframe = jf;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	      String  menuName;
	      menuName = e.getActionCommand();
	      if (menuName.equals("Open")) //opens the file when clicked
	         openFile(); 
	      else if (menuName.equals("Quit")) // exits the file when clicked
	         System.exit(0);
	      else if (menuName.equals("A")) {
	    	  Project4.appendVowel("A");
	    	  WordGUI.appendTextAreaList();
	      }
	      else if (menuName.equals("E")) {
	    	  Project4.appendVowel("E");
	    	  WordGUI.appendTextAreaList();
	      }
	      else if (menuName.equals("I")) {
	    	  Project4.appendVowel("I");
	    	  WordGUI.appendTextAreaList();
	      }
	      else if (menuName.equals("O")) {
	    	  Project4.appendVowel("O");
	    	  WordGUI.appendTextAreaList();
	      }
	      else if (menuName.equals("U")) {
	    	  Project4.appendVowel("U");
	    	  WordGUI.appendTextAreaList();
	      }
	}

	//grants access to the file that wants to be opened.
	private void openFile() {
		  int status;
		  JFileChooser chooser = new JFileChooser( );
		  status = chooser.showOpenDialog(null);
		  Project4.readFile(chooser.getSelectedFile().getAbsolutePath());
		  WordGUI.appendTextAreaText();
		} //openFile

} // FileMenuHandler
