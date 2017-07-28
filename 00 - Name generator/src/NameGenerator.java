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

    private static String mailGenerator(String firstname, String surname){
        String[] providers = {"yahoo.com", "gmail.com", "bing.com", "msn.com", "hotmail.com"};
        int rnd = new Random().nextInt(providers.length);
        String provider =  providers[rnd];
        int number = new Random().nextInt(100);
        return firstname.toLowerCase()+"."+surname.toLowerCase()+number+"@"+provider;
    }

    private static String passwordGenerator(){
        Random randomizer = new Random();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String numbers = "1234567890";
        String specialchars = "!@#$%^&*()";
        String password = Character.toString(alphabet.charAt(randomizer.nextInt(alphabet.length())));
        for (int i = 0; i < 4; i++) {
           password = password + alphabet.charAt(randomizer.nextInt(alphabet.length()));
        }
        for (int i=0; i<2; i++){
            password = password + specialchars.charAt(randomizer.nextInt(specialchars.length()));
        }
        for (int i=0; i<2; i++){
            password = password + numbers.charAt(randomizer.nextInt(numbers.length()));
        }

        return password;
    }

    private static void generator(String choice) throws IOException {
        try {
            String firstname = nameGenerator(choice);
            String surname = nameGenerator("sur");
            String email = mailGenerator(firstname, surname);
            String password = passwordGenerator();

            System.out.println("Name "+firstname);
            System.out.println("Surname: " + surname);
            System.out.println("Email: " + email);
            System.out.println("Password: "+ password);

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
