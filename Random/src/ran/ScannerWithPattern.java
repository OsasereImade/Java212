package ran;

import java.util.Scanner;
import java.util.regex.*;
public class ScannerWithPattern {
/*
 * Match words in a String delimited by ";"
 */
   public static void main(String[] args) {
      String matchMe = "Hello;Goodbye;Testing123";
      Scanner scan = new Scanner(matchMe);
      // declare the delimiter to be used by Scanner object
      scan.useDelimiter(";");
      Pattern pattern = Pattern.compile("[A-Za-z]*");
      while(scan.hasNext()){
         if(scan.hasNext(pattern))
            System.out.println(scan.next());
         else
            scan.next();
      }
      scan.close();
   }
}
