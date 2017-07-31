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

    private static int checkMotnhDays(int month, int year){
        if (month == 1 || month == 3 || month==5 || month == 7 || month==8||month==10||month==12){
            return 31;
        }else if(month==4||month==6||month==9||month==11){
            return 30;
        }else if (ifLeapYear(year)){
            return 29;
        }else
            return 28;
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

        for(int i=birthYear+1; i<currentYear; i++){
            if(ifLeapYear(i)){
                numberOfDays=numberOfDays+leapYear;
            }else{
                numberOfDays=numberOfDays+normalYear;
            }
        }




    }
}
