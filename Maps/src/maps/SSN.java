package maps;
/**
 * Social security number
 */
public class SSN {
    /** the number itself */
    private String SSNumber;

    /**
     * Constructs a SSN based on a string, if the string is a social security
     * number
     * 
     * @param s
     *            the number as a string
     * @throw IllegalArgumentException if the input is not a social security
     *        number
     */
    public SSN(String s) {
        // if the number is not valid, throw an exception
        if (!isValidSSN(s))
            throw new IllegalArgumentException(invalidReason(s));

        // save the number
        SSNumber = s;
    }

    public String toString() {
        // It's already a string, so just return the internal string
        return (SSNumber);
    }

    /* Tip: This method isn't recognized as a "real" compareTo for Java's
     * built-in libraries and methods, like Arrays.sort(), because SSN does not
     * implement the Comparable<SSN> interface.
     * However, this compareTo basically fits the interface, and you just have
     * to declare that this class "implements Comparable<SSN>" to get it to work.
     * 
     * Reference:
     * http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html#compareTo%28T%29
     */
    public int compareTo(SSN other) {
        return (SSNumber.compareTo(other.toString()));
    }

    public boolean equals(Object other) {
        return (other != null // make sure it's not null
                && getClass() == other.getClass()
                    // make sure they're the same type
                && SSNumber.equals(((SSN) other).SSNumber));
                    // compare the underlying strings
        /*
         * Note that the order matters: - If other is null, you can't ask for
         * its class (will get an exception) - If other is NOT the right class,
         * you can't cast it to an SSN (will get an exception)
         */
    }

    /**
     * A helper method to check that a string can be interpreted as a SSN. A
     * valid social security number is a string of nine digits.
     * 
     * @param s
     *            the string to validate
     * @return true if valid
     */
    private static boolean isValidSSN(String s) {
        // Check if the string matches "digit (repeated exactly nine times)"
        // Uses String#matches(String regex), which checks the string against the given regex.
        // http://docs.oracle.com/javase/1.4.2/docs/api/java/lang/String.html#matches%28java.lang.String%29
        return (s.matches("\\d{9}"));
    } // isValidSSN

    /**
     * Checks that this object represents a valid social security number.
     * 
     * Since this is checked in the constructor, and there's no other way to
     * change this object, this version of the class should always return true
     * (but it may be useful for a future version).
     * <p>
     * A valid social security number is a string of nine digits.
     * 
     * @param s
     *            the string to validate
     * @return true if valid
     */
    public boolean isValidSSN() {
        return (isValidSSN(SSNumber));
    } // isValidSSN

    /**
     * Check why a string can't be interpreted as a social security number. This
     * method should only be called on strings that fail {@link
     * isValidSSN(String)}.
     * <p>
     * Used for debugging purposes.
     * 
     * @param s
     *            a string that isn't a social security number
     * @return a printable error message
     */
    private static String invalidReason(String s) {
        // First, check that the number of digits is correct
        if (s.length() != 9)
            return ("An SSN length must be 9");

        // Then check each digit
        for (int i = 0; i < 9; i++)
            if (!Character.isDigit(s.charAt(i)))
                return ("SSN must have only digits.");

        // Otherwise, the string is a valid SSN and we shouldn't be here.
        return ("There is a serious error if this is printed!");
    }
}