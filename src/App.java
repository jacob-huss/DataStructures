import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// specific imports

public class App {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int i = 0;
        int product = 0;

        ArrayList<Integer> array = new ArrayList<Integer>();

    



        Scanner input = new Scanner(System.in);

        for (i = 0; i < 5; ++i) {

            System.out.println("Enter 5 numbers");
            num = input.nextInt();
            array.add(num);

        }

        sum += num;

        if (num > max) {
            max = num;
        }

        if (num < min) {
            min = num;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Product: " + product);
    }
}
