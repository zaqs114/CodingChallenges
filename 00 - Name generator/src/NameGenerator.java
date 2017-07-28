import java.util.Scanner;

/**
 * Created by Hubert on 28.07.2017.
 */
public class NameGenerator {
    /* Names taken from http://imiona.nazwiska-polskie.pl/
    Surnames taken from: https://www.familyeducation.com/baby-names/browse-origin/surname/polish
     */


    public static void main(String[] args) {
        String choice;
        System.out.println("Male or Female?");
        Scanner read = new Scanner(System.in);
        choice = read.nextLine();
        if (choice.equalsIgnoreCase("male")){


        }else if (choice.equalsIgnoreCase("female")){

        }else{
            System.out.println("You choose wrong option. Try again.");
        }
    }
}
