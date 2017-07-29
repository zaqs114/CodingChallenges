import java.util.Scanner;

/**
 * Created by zaqs on 29.07.2017.
 */
public abstract class Initialization {
    public void startGame() {
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
                game();
                break;
            case "no":
                Main.main(null);
                break;
        }
    }
    public abstract void game();
}
