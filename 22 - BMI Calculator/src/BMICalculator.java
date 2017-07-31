import java.util.Scanner;

/**
 * Created by zaqs114 on 31.07.2017.
 */
public class BMICalculator {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        double weight=0;
        double height=0;

        System.out.println("Type your weight (in kg): ");

        try {
            weight = Double.parseDouble(read.nextLine());
        }catch(NumberFormatException e){
            System.out.println("You typed something wrong. try again.");
            main(null);
        }

        System.out.println("Type your height (in cm): ");

        try {
            height = Double.parseDouble(read.nextLine());
        }catch(NumberFormatException e1){
            System.out.println("You typed something wrong. try again.");
            main(null);
        }

        height=height/100;

        System.out.println("Your BMI is "+(weight/(height*height)));
        System.exit(0);
    }
}
