import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zaqs114 on 31.07.2017.
 */
public class AgeCalculator {

    private static boolean ifLeapYear(int year){
        if (year%4==0 && year%100!=0){
            return true;
        }else if (year%400==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws InputMismatchException{
        Scanner read = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();

        int leapYear=366;
        int normalYear=365;

        int currentDay=currentDate.getDayOfMonth();
        int currentMonth=currentDate.getMonthValue();
        int currentYear=currentDate.getYear();

        int birthDay=0;
        int birthMonth=0;
        int birthYear=0;

        int numberOfDays=0;


        try{
            System.out.println("Type your birth day (DD)");
            birthDay=Integer.parseInt(read.nextLine());
            System.out.println("Type your birth month (MM)");
            birthMonth=Integer.parseInt(read.nextLine());
            System.out.println("Type your birth year (YYYY)");
            birthYear=Integer.parseInt(read.nextLine());

        }catch(InputMismatchException e){
            System.out.println("You typed something wrong. Try again");
            main(null);
        }

        for(int i=birthYear; i<currentYear; i++){
            if(ifLeapYear(i)){
                numberOfDays=numberOfDays+leapYear;
            }else{
                numberOfDays=numberOfDays+normalYear;
            }
        }




    }
}
