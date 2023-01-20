import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class SocialSecurityValidator{
 
     private Pattern pattern;
     private Matcher matcher;
     private static final String SSN_PATTERN = "^\\d{3}-*\\d{2}-*\\d{4}$";
 
     public SocialSecurityValidator(){
        pattern = Pattern.compile(SSN_PATTERN);
     }
 
     /**
      * Validate hex with regular expression
      * @param hex hex for validation
      * @return true valid hex, false invalid hex
      */
     public boolean validate(final String hex){
 
        matcher = pattern.matcher(hex);
        return matcher.matches();
     }
     
     public static void main (String[] args) {
        SocialSecurityValidator ssv = new SocialSecurityValidator();
        if (ssv.validate("999-99-9999")) System.out.println("OK");
     }
}