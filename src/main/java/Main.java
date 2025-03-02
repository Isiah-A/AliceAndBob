import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        String name = " ";
        // call the compute() method on that new object
        compute(name);
    }

    public static void compute(String names) {
        // Get input string of name from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        // Create conditional to check name against Alice and Bob
        if(name.equals("Alice")) {

            // Print greeting to screen if Alice or Bob are true
            System.out.println("Hello, " + name + "!");
        }
        else if(name.equals("Bob")){

            System.out.println("Hello, " + name + "!");
        }
        else {
            // Print "You are neither Alice nor Bob." otherwise
            System.out.println("You are neither Alice nor Bob.");
        }
    }
}
