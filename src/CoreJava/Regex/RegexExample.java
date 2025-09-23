package CoreJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A guide to the components of regular expressions, also known as regex.
 *
 * <h3>Components:</h3>
 * <ul>
 * <li><strong>Literals:</strong> Characters that match themselves directly. For example, the pattern "a" will match the string "a".</li>
 * <li><strong>Metacharacters:</strong> Special characters that represent other characters or patterns. Key metacharacters include:
 * <ul>
 * <li><code>.</code> : Matches any single character except for a newline.</li>
 * <li><code>^</code> : Matches the beginning of a line.</li>
 * <li><code>$</code> : Matches the end of a line.</li>
 * <li><code>*</code> : Matches zero or more occurrences of the preceding character.</li>
 * <li><code>+</code> : Matches one or more occurrences of the preceding character.</li>
 * <li><code>?</code> : Matches zero or one occurrence of the preceding character.</li>
 * <li><code>[]</code>: Matches any single character that is inside the brackets. For example, `[abc]` matches 'a', 'b', or 'c'.</li>
 * <li><code>|</code> : Acts as a logical OR. For example, `a|b` matches either 'a' or 'b'.</li>
 * <li><code>()</code>: Groups multiple characters together to form a sub-expression and captures the matched content.</li>
 * </ul>
 * </li>
 * </ul>
 */
public class RegexExample {
    /**
     * Demonstrates a basic example of using Java's regular expression API
     * to find a whole word in a string.
     * <p>
     * The example breaks down the three core steps:
     * <ul>
     * <li><strong>Pattern Compilation:</strong> Compiles a regular expression into a {@link java.util.regex.Pattern} object.
     * For instance, {@code Pattern.compile("\\bcat\\b")} creates a pattern to find the word "cat". The {@code \b}
     * is a word boundary, ensuring "cat" is matched as a complete word and not part of a larger word like "caterpillar".</li>
     *
     * <li><strong>Matcher Creation:</strong> Creates a {@link java.util.regex.Matcher} object from the compiled pattern.
     * This object is the engine used to perform match operations against a specific input string,
     * such as {@code pattern.matcher(input)}.</li>
     *
     * <li><strong>Finding Matches:</strong> Iterates through the input string to find all occurrences of the pattern
     * using the {@link java.util.regex.Matcher#find()} method. The loop {@code while (matcher.find())}
     * searches for and prints every match.</li>
     * </ul>
     */
    public static void main(String[] args) {
        // Define a regular expression pattern
        String regex = "\\bcat\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Define an input string
        String input = "The cat sat on the mat.";

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);

        // Check if the pattern matches
        boolean found = matcher.find();

        if (found) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found.");
        }

        // Print all matches
        matcher.reset(); // Reset matcher to start from the beginning
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group());
        }
    }
}
