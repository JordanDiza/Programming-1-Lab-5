import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private HashMap<String, String> wordResponses;
    private String lastDefaultResponse = "";
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()

    {
    
    wordResponses = new HashMap<>();
    wordResponses.put("hello", "Hi there!");
    wordResponses.put("help", "Sure, I can help you.");
    wordResponses.put("problem", "Can you explain the problem?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(Set<String> words)
    {
         for (String word : words) {
            if (wordResponses.containsKey(word)) {
                return wordResponses.get(word);
            }
        }

        
        String[] defaultResponses = {"I see.", "Can you tell me more?", "Interesting..."};
        String response;
        do {
            response = defaultResponses[new Random().nextInt(defaultResponses.length)];
        } while (response.equals(lastDefaultResponse));

        lastDefaultResponse = response;
        return response;
    }
}

