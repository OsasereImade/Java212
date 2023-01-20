/*
 * Uses split to break up a string of input separated by
 * commas and/or whitespace.
 */
import java.util.regex.*;

public class Splitter {
    public static void main(String[] args)  {
        // Create a pattern to match breaks
        Pattern p = Pattern.compile("[,\\s]+");
        // Split input with the pattern
        String[] result = 
                 p.split("one,two, three   four ,  five");
  //      for (int i=0; i<result.length; i++)
  //          System.out.println(result[i]);
        for (String s : result)
           System.out.println(s);
    }
}