/**
 * Created by zaqs114 on 31.07.2017.
 */
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            if (result.isEmpty()) result += i;
            System.out.print(result+" ");
        }
    }
}
