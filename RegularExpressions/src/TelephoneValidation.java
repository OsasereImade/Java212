import java.util.regex.*;
public class TelephoneValidation {

   public static void main (String[] args) {
      Pattern p;
      Matcher m;
      String Telephone_Pattern = "^(\\d{3})-*\\d{3}-*\\d{4}$";
      p = Pattern.compile(Telephone_Pattern);
      m = p.matcher("718-997-3485");
      if(m.find()) {
         System.out.println(m.group(0));  //the whole pattern matched
         System.out.println(m.group(1));  //the first group matched
      }
   }
}
