import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberTries = 0;
        int numberGuess = 0;
        String name= "";

        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);

        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Well, "+ name + "! I am thinking of number between 1 - 100!");
        System.out.println("Take a guess");

        while(true){
            numberTries++;
            numberGuess = sc.nextInt();

            if (numberGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + numberTries + " tries");
                System.out.println("Congrats " + name + "!!");
                break;
            }
            else if (randomNumber > numberGuess){
                System.out.println("Nope! The number is higher. Guess again.");
            }
            else {
                System.out.println("Nope! The number is lower. Guess again.");
            }

        }
    }
}