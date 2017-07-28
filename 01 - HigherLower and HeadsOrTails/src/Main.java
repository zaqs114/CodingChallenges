import java.util.Scanner;

/**
 * Created by Hubert on 28.07.2017.
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
            if (choice == "1" || choice == "2" || choice == "3") {
                break;
            } else {
                System.out.println("You chose wrong. Try again.");
            }
        }
        if (choice == "1") {

        } else if (choice == "2") {

        } else if (choice == "3") {
            System.exit(0);
        }
    }
}
