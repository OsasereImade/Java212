package project1;

import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;

public class VowelGUI extends JFrame{
   
    public static void printVOWELtoJFrame(vowelGUI myGUI, String[] list) {

        myGUI=new vowelGUI();
        myGUI.setSize(400, 200);
        myGUI.setLocation(100, 100);
        myGUI.setTitle("Vowels");
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.setVisible(true);
        Container myContentPane = myGUI.getContentPane();
        TextArea myVowels = new TextArea();
        TextArea mySubscripts = new TextArea();
        myContentPane.add(mySubscripts);
        myContentPane.add(myVowels);
         }

}