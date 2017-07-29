import java.util.Scanner;

/**
 * Created by zaqs on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("What do you want to play?");
        System.out.println("1 - Higher/Lower");
        System.out.println("2 - Heads or Tails");
        System.out.println("3 - Exit");

        String choice;
        Scanner read = new Scanner(System.in);
        while (true) {
            choice = read.nextLine();
            if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                break;
            } else {
                System.out.println("You chose wrong. Try again.");
            }
        }
        switch (choice){
            case "1":
                HigherLower higherLower = new HigherLower();
                higherLower.startGame();
                break;
            case "2":
                HeadsOrTails headsOrTails = new HeadsOrTails();
                headsOrTails.startGame();
                break;
            case "3":
                System.exit(0);
                break;
        }
    }
}
