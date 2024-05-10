
import java.util.Scanner;

public class basic_math {

    public static void main (String [] args){

        double n1,n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : " );
        n1 = scanner.nextDouble();

        System.out.println("Enter the Second number : " );
        n2 = scanner.nextDouble();

        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = n1 / n2;

        System.out.println("Here is the addition of n1 and n2 : " + add );

        if (n1 > n2) {
            sub = n1 - n2;
            System.out.println("Here is the subtraction of n1 and n2 : " + sub);
        }
        else {
            double sub1 = n2 - n1;
            System.out.println("Here is the subtraction of n1 and n2 : " + sub1);

        }

        System.out.println("Here is the multiplication of n1 and n2 : " + mul );
        System.out.println("Here is the Division of n1 and n2 : " + div );
    }
}
