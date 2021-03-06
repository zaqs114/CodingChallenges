import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zaqs114 on 30.07.2017.
 */
public class TemperatureConverter {
    private static double kelvinToCelsius(double temperature){
        temperature = temperature - 273.15;
        return temperature;
    }

    private static double kelvinToFahrenheit(double temperature){
        temperature = temperature * 9/5 -459.67;
        return temperature;
    }

    private static double celsiusToKelvin(double temperature){
        temperature=temperature+273.15;
        return temperature;
    }

    private static double celsiusToFahrenheit(double temperature){
        temperature= temperature*9/5+32;
        return temperature;
    }

    private static double fahrenheitToKelvin(double temperature){
        temperature= (temperature+459.67)*5/9;
        return temperature;
    }

    private static double fahrenheitToCelsius(double temperature){
        temperature=(temperature-32)*5/9;
        return temperature;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        String unit;
        double temperature=0;

        System.out.println("Type the temperature that you want to convert (number).");
        try{
            temperature=Double.parseDouble(read.nextLine());
        }catch(NumberFormatException e){
            System.out.println("You typed wrong number. Try again");
            main(null);
        }
        System.out.println("Type the unit of that temperature that you just typed (Celsius/Kelvin/Fahrenheit)");

        while(true){
            unit= read.nextLine();
            if(unit.equalsIgnoreCase("celsius")|| unit.equals("kelvin")||unit.equals("fahrenheit")) {
                unit=unit.toLowerCase();
                break;
            }else{
                System.out.println("You typed wrong unit. Try again.");
            }
        }
        System.out.println("Your temperature is "+temperature +" "+ unit+" degrees.");
        switch(unit){
            case "kelvin":
                System.out.println("This is: " + new DecimalFormat("##.##").format(kelvinToCelsius(temperature)) + " celsius degrees.");
                System.out.println("This is also "+ new DecimalFormat("##.##").format(kelvinToFahrenheit(temperature))+ " fahrenheit degrees.");
                break;
            case "celsius":
                System.out.println("This is: " + new DecimalFormat("##.##").format(celsiusToKelvin(temperature))+ " kelvin degrees.");
                System.out.println("This is also "+ new DecimalFormat("##.##").format(celsiusToFahrenheit(temperature))+ " fahrenheit degrees.");
                break;
            case "fahrenheit":
                System.out.println("This is: " + new DecimalFormat("##.##").format(fahrenheitToKelvin(temperature))+ " kelvin degrees.");
                System.out.println("This is also "+ new DecimalFormat("##.##").format(fahrenheitToCelsius(temperature))+ " celsius degrees.");
                break;
        }
        System.exit(0);
    }
}