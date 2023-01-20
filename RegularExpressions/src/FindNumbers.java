/*
 * Find words (one or more letters) in a string.
 */
import java.util.regex.*;

public class FindNumbers {
    public static void main(String[] args)  {
       String myString = "hello, this 123 is 5643 testz w123ith 5 words";
        // Create a pattern to match breaks
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(myString);
        
        while (m.find()) {
           System.out.println(m.group());
        }
    }
}