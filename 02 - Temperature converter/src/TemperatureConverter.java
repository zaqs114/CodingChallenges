import java.util.Scanner;

/**
 * Created by zaqs114 on 30.07.2017.
 */
public class TemperatureConverter {
    public static double converter(int temperature, double ratio){
        double converted=0;
        converted=temperature+ratio;
        return converted;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        String unit;
        int temperature=0;

        System.out.println("Type the temperature that you want to convert (number).");
        try{
            temperature=Integer.parseInt(read.nextLine());
        }catch(Exception e){
            System.out.println("You typed wrong number. Try again");
            main(null);
        }
        System.out.println("Type the unit of that temperature that you just typed (Celsius/Kelvin/Fahrenheit)");
        unit= read.nextLine();

        while(true){
            if(unit.equalsIgnoreCase("celsius")|| unit.equals("kelvin")||unit.equals("fahrenheit")) {
                unit=unit.toLowerCase();
                break;
            }else{
                System.out.println("You typed wrong unit. Try again.");
            }
        }
        System.out.println("Your temperature is "+temperature +" of "+ unit);
        switch(unit){
            case "kelvin":
                System.out.println("This is: " + converter(temperature, -272.15) + " of Celsius.");
                System.out.println("This is also "+ converter(temperature, -457.87)+ " of Fahrenheit");
                break;
            case "celsius":
                System.out.println("This is: " + converter(temperature, 274.15) + " of Kelvin.");
                System.out.println("This is also "+ converter(temperature, 33.8)+ " of Fahrenheit");
                break;
            case "fahrenheit":
                System.out.println("This is: " + converter(temperature, 255.927778) + " of Kelvin.");
                System.out.println("This is also "+ converter(temperature, -17.2222222)+ " of Celsius");
                break;
        }
    }
}