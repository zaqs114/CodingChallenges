import java.util.Random;
import java.util.Scanner;

/**
 * Created by zaqs on 28.07.2017.
 */
public class HigherLower extends Initialization {

    public void game(){
        Random randomizer = new Random();
        Scanner read = new Scanner(System.in);

        int number = randomizer.nextInt(10001);
        System.out.println("You have 10 chances to guess the number between 0 and 10000.");
        System.out.println("Type number to check if is it a right guess or if the number is higher or lower");
        for (int i=0; i<10; i++){
            System.out.println("Type your guessed number: ");
            String choice = read.nextLine();
            int guessedNumber = 0;
            try{
                guessedNumber = Integer.parseInt(choice); //try catch na mismatchargument czy tam format
            }catch(Exception e1){
                System.out.println("You didnt type a correct number. Try again");
                game();
            }

            if (guessedNumber<number){
                System.out.println("Higher!");
            }else if(guessedNumber>number){
                System.out.println("Lower!");
            }else{
                System.out.println("Congratulations, you won!");
                startGame();
            }
        }
        System.out.println("Sadly, you lost! Try again.");
        startGame();
    }
}
