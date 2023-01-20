package project4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import project4.WordGUI;
/**
 * 
 * @author Osasere
 * This program sets the characteristics of a JFrame
 * that is- size, location title etc. Also, adds specific
 * requirements to create the JFrame for this program.And to
 * handle necessary events.
 *
 */
@SuppressWarnings("serial")
public class WordGUI extends JFrame {
	public static WordGUI myGUI;
    static TextArea mySortedWords = new TextArea();
    static TextArea myOriginalText = new TextArea();
	
	public WordGUI() {
	}
	
	/**
	 * 
	 * @param myGUI filled in with various characteristics of a JFrame.
	 */
	
	private static void createMenu(WordGUI myGUI) {
		   JMenuBar menuBar  = new JMenuBar();
		   JMenu fileMenu = new JMenu("File");
		   JMenu listMenu = new JMenu("List");
		   JMenuItem item;
		   FileMenuHandler fmh  = new FileMenuHandler(myGUI);
		   item = new JMenuItem("Open"); 
		   fileMenu.add( item );
		   item.addActionListener(fmh);
		   fileMenu.addSeparator(); 
		   item = new JMenuItem("Quit"); 
		   item.addActionListener(fmh);
		   fileMenu.add( item );
		   item = new JMenuItem("A"); 
		   item.addActionListener(fmh);
		   listMenu.add( item );
		   item = new JMenuItem("E"); 
		   item.addActionListener(fmh);
		   listMenu.add( item );
		   item = new JMenuItem("I");
		   item.addActionListener(fmh);
		   listMenu.add( item );
		   item = new JMenuItem("O"); 
		   item.addActionListener(fmh);
		   listMenu.add( item );
		   item = new JMenuItem("U"); 
		   item.addActionListener(fmh);
		   listMenu.add( item );
		   myGUI.setJMenuBar(menuBar);
		   menuBar.add(fileMenu);
		   menuBar.add(listMenu);
	} //createMenu
	
	public static void printWORDtoJFrame() {
		myGUI = new WordGUI();
        myGUI.setSize(1000, 1400);
        myGUI.setLocation(2, 2);
        myGUI.setTitle("Working with GUI's");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = myGUI.getContentPane();
        myContentPane.add(myOriginalText, BorderLayout.WEST);
        myContentPane.add(mySortedWords, BorderLayout.EAST);
        
        createMenu(myGUI);
        myGUI.setVisible(true);
		
	}
	
	// this is to print out "input.txt" row by row
	public static void appendTextAreaText() {
        for (int i=0;i<Project4.originalText.length;i++) {
            myOriginalText.append(i+1 + "\t" + Project4.originalText[i] + "\n");
        }
	}
	
	//to construct a word line and store to an array list
	public static void appendTextAreaList() {
		// go over each wordLine and text area, get the current number 
		// and concatenate into an empty string
		String str = "";
		for (int i = 0; i < Project4.b.size(); i++) {
			str += Project4.b.get(i) + "\n";
		}
		System.out.println(str);
		
        mySortedWords.append(str + "\n"); // adding the current line to the sorted words       
	}
	
}
