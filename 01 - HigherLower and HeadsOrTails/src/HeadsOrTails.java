import java.util.Random;
import java.util.Scanner;

/**
 * Created by zaqs on 28.07.2017.
 */
public class HeadsOrTails extends Initialization {

    public void game(){
        String[] options = {"heads", "tails"};
        Random randomizer = new Random();
        Scanner read = new Scanner(System.in);

        int index = randomizer.nextInt(options.length);
        String winningside = options[index];
        String choice;
        System.out.println("Heads or Tails?");

        while (true){
            choice = read.nextLine();
            if(choice.equalsIgnoreCase("heads")||choice.equalsIgnoreCase("tails")){
                choice = choice.toLowerCase();
                break;
            }else {
                System.out.println("You chose wrong. Try again.");
            }
        }
        if (choice.equals(winningside)){
            System.out.println("Congratulations, you won!");
            startGame();

        }else {
            System.out.println("Sadly, you lost.");
            game();
        }
    }
}
