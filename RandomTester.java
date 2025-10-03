import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand;
    private String number;
    private ArrayList <String> response;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand = new Random();
        response = new ArrayList<>();
        response.add("no");
        response.add("yes");
        response.add("maybe");
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        int number= rand.nextInt(0);
        System.out.println("Your number is" + " " + number);
        
        
        
    }
    public void printMultiRandom(int howMany)
    {
        int number = 0;
        while(number < howMany){
        System.out.println("Your number is" + " " + rand.nextInt(10));
        number++;
    }
    }
    
    public int throwDice()
    {
        int number = (rand.nextInt(6)+1);
        System.out.println("Dice number is" + " " + number);
        return number;
    }
    
    public void getResponse()
    {
       response = new ArrayList<>();
       response.add("no");
       response.add("yes");
       response.add("maybe");
       
       System.out.println(response);
       
       
       
    }
}    