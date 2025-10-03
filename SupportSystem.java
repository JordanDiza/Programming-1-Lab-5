import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    private HashMap<String, String> responses;
    private String lastDefaultResponse;

    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
        responses = new HashMap<>();
        lastDefaultResponse = "";
        fillResponsesMap();
    }

    public void start()
    {
        boolean finished = false;

        printWelcome();

        while (!finished) {
            // Get input as a set of words
            HashSet<String> inputWords = reader.getInput();

            // Check if user wants to end the program
            if (inputWords.contains("bye")) {
                finished = true;
                System.out.println("Goodbye!");
                continue;
            }

            // Generate and print a response
            String response = responder.generateResponses(inputWords, responses, lastDefaultResponse);
            lastDefaultResponse = response;
            System.out.println(response);
        }

        printGoodbye();
    }

    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }

    private void fillResponsesMap()
    {
        responses.put("slow", "Have you tried restarting your computer?");
        responses.put("crash", "Does it happen when you open a specific program?");
        responses.put("blue", "Please update your drivers.");
        responses.put("internet", "Make sure cables are connected.");
        responses.put("password", "Try resetting your password.");
    }
}