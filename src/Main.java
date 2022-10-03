import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

       Scanner kb = new Scanner(System.in);

       double length = 0;
       double width = 0;
       double area = 0;
       double perimeter = 0;
       double diagonal = 0;

        System.out.println("Input length: ");
        if (kb.hasNextDouble()) {
            length = kb.nextDouble();
            if (!(length > 0))
            {
                System.out.println("Number must be greater than zero.");
                System.exit(0);
            }
        }
        else {
            System.out.println("That's not  valid input.");
            System.exit(0);
        }

        System.out.println("Input width: ");
        if (kb.hasNextDouble()) {
            width = kb.nextDouble();
            if (!(width > 0))
            {
                System.out.println("Number must be greater than zero.");
                System.exit(0);
            }
        }
        else {
            System.out.println("That's not  valid input.");
            System.exit(0);
        }

        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2)));

        System.out.println("The area is " + area + " and the perimeter is " + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);





    }
}