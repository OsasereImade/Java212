package project1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import javax.swing.JFrame;

@SuppressWarnings("serial")
// VowelGUI takes up all the
// characteristics of JFrame (inheritance)
public class VowelGUI extends JFrame{
   
   // default constructor making only the
   // class construct an object
   public VowelGUI() {

   }
   
   public static void printVOWELtoJFrame(VowelGUI myGUI, String[] originalText, String[] count) {
        // creating a JFrame and setting up all 
        // the characteristics in the JFrame
        myGUI = new VowelGUI();
        myGUI.setSize(900, 200);
        myGUI.setLocation(100, 100);
        myGUI.setTitle("Vowels");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myContentPane = myGUI.getContentPane();
        TextArea myVowels = new TextArea();
        TextArea mySubscripts = new TextArea();
        myContentPane.add(mySubscripts, BorderLayout.WEST);
        myContentPane.add(myVowels, BorderLayout.EAST);
       
        // looping through, adding original text and
        // count to mySubscripts and myVowels respectively 
        for (int i=0;i<originalText.length;i++) {
            mySubscripts.append(originalText[i] + "\n");
            myVowels.append(count[i] + "\n");
        } //end of for loop
        myGUI.setVisible(true);

    }//printVOWELtoJframe

}//class

