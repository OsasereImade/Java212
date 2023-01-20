import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.*;

public class RegexTester {
//
// Adapted from   http://download.oracle.com/javase/tutorial/essential/regex/
//
    public static void main(String[] args){
    String regularExpression, patternToMatch;
        
       while (true) {
           regularExpression = JOptionPane.showInputDialog(null,"Enter your regex");
           if (regularExpression == null || regularExpression .equals("")) break;
           Pattern pattern = 
              Pattern.compile(regularExpression);
           
           while (true) {
              patternToMatch = JOptionPane.showInputDialog(null,
                                "Enter your input string to search using \n"+regularExpression); 
              if (patternToMatch == null || patternToMatch.equals("")) break;
              Matcher matcher = 
                 pattern.matcher(patternToMatch);
            
              boolean found = false;
               
              while (matcher. find()) {
                 System.out.println("I found the text "+matcher.group()+" starting at index " +
                                   matcher.start()+" and ending at index "+ matcher.end());
                 System.out.println("Number of groups in the expression: "+matcher.groupCount());
                 for (int i=0;i<= matcher.groupCount();i++)
                    System.out.println("Group "+i+": "+matcher.group(i));
            
                 found = true;
              }
            if(!found){
               System.out.println("No match found.");
            }
           }
        }
    }
}

