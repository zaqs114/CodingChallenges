import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Hubert on 28.07.2017.
 */
public class NameGenerator {
    /* Names taken from http://imiona.nazwiska-polskie.pl/
    Surnames taken from: https://www.familyeducation.com/baby-names/browse-origin/surname/polish
     */

    private static String nameGenerator(String choice) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(choice.toLowerCase()+"names.txt"));
        List<String> list = new LinkedList<String>();
        try{
         /* loading database to list*/
        String line = null;
        while ((line = reader.readLine()) != null) {
            list.add(line);
        }
        }catch(IOException e){
            System.out.println("Something with yor file is wrong. Try again.");

        }

        int length = list.size();
        Random randomGenerator = new Random();
        int randomValue = randomGenerator.nextInt(length);

        return list.get(randomValue);


    }

    private int birthGenerator(){
        int birthDay;
        int minDay=1;
        int maxDay;
        int birthMonth;
        int minMonth=1;
        int maxMonth=12;
        int birthYear;
        int minYear=1950;
        int maxYear=2017;

        Random randomizer = new Random();
        birthMonth = randomizer.nextInt(maxMonth+1 - minMonth) + minMonth;

    }

    private static void generator(String choice) throws IOException {
        try {
            String firstName = nameGenerator(choice);
            String surname = nameGenerator("sur");
            System.out.println("Imie: " + firstName + " " + "Nazwisko: " + surname);
        } catch (IOException e) {
            System.out.println("Something with yor file is wrong. Try again.");

        }

    }

    public static void main(String[] args) throws IOException{
        String choice;
        System.out.println("Male or Female?");
        Scanner read = new Scanner(System.in);
        choice = read.nextLine();
        if (choice.equalsIgnoreCase("male")){
            generator(choice);

        }else if (choice.equalsIgnoreCase("female")){
            generator(choice);
        }else{
            System.out.println("You choose wrong option. Try again.");
        }
    }
}
