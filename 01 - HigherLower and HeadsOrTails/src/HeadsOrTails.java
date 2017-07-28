import java.util.Random;
import java.util.Scanner;

/**
 * Created by Hubert on 28.07.2017.
 */
public class HeadsOrTails {
    public void game() {
        String choice;
        Scanner read = new Scanner(System.in);
        System.out.println("Do you want to start a new game? Type YES or NO.");

        while (true) {
            choice = read.nextLine();
            if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
                choice=choice.toLowerCase();
                break;
            } else {
                System.out.println("You chose wrong. Try again.");
            }
        }
        switch(choice){
            case "yes":
                    String[] options = {"heads", "tails"};
                    Random randomizer = new Random();

                    int index = randomizer.nextInt(options.length);
                    String winningside = options[index];

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
                        game();

                    }else {
                        System.out.println("Sadly, you lost.");
                        game();
                    }
                break;
            case "no":
                Main.main(null);
                break;
        }
    }
}
