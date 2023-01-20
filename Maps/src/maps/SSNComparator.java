package maps;

import java.util.Comparator;

/* See also:
 * http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html
 */

/**
 * A class that compare two social security numbers.
 * 
 * Each object of this class does the exact same thing, but
 * you can't pass methods as parameters to other methods in Java.
 * You can, however, pass objects, and objects have their own methods... 
 * 
 */
public class SSNComparator implements Comparator<SSN> {

    public int compare(SSN num1, SSN num2) {
        //Social security numbers know how to compare, so just let them do it
        return num1.compareTo(num2);
    }

}
