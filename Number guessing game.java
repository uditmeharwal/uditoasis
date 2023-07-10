// Number Guessing Game  for oasis company -Udit
import java.util.Scanner;
 public class udit{
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());
        int U = 5;
        int i, guess;
        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
        for (i = 0; i < U; i++){
        System.out.println("Guess the number:");
        guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!"+ " The number is correct.");
                break;
            }
            else if (number > guess && i != U - 1) {
                System.out.println("The number is "+ "greater than " + guess);
            }
            else if (number < guess && i != U - 1) {
                System.out.println("The number is"+ " less than " + guess);
            }
        }
 
        if (i == U) {
            System.out.println("You loose"+ " U trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    public static void
    main(String arg[])
    {

        guessingNumberGame();
    }
}