/*
 * Find words (one or more letters) in a string.
 */
import java.util.regex.*;

public class GetWords {
    public static void main(String[] args)  {
       String myString = "hello, this is a test with 5 words";
        // Create a pattern to match breaks
        Pattern p = Pattern.compile
         //     ("\\w+");
              ("[a-zA-Z]+");
        Matcher m = p.matcher(myString);
        
        while (m.find()) {
           System.out.println(m.group());
        }
    }
}