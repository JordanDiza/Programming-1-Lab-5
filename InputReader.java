import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class InputReader
{
    private Scanner reader;
    
    public HashSet<String> getInput() 
    {
    String input = "hello  problem"; // multiple spaces handled
    String[] wordsArray = input.trim().split("\\s+"); // split by one or more spaces
    HashSet<String> wordsSet = new HashSet<>();
    for (String word : wordsArray) {
            wordsSet.add(word.toLowerCase());
        }
    return wordsSet;
    
    }
    public InputReader()
    {
        reader = new Scanner(System.in);
    }
}
