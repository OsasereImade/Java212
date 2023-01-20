package javatwotwelve;

import javax.swing.JOptionPane;

public class Question3 {
   public static void main (String[] args) {
      String message = JOptionPane.showInputDialog(null, "Enter a string: ");
      int count = 0;
      for(int i = 0; i < message.length(); i++) {
         if(Character.isDigit(message.charAt(i))) count++;
      }
         JOptionPane.showMessageDialog(null, "There are "+ count + " digits.");
   }
}
