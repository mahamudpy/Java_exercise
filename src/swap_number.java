
import java.util.Scanner;

public class swap_number {

    public static void main (String [] args){
        int a, b;
        int temp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : " );
        a = scanner.nextInt();

        System.out.println("Enter the Second number : " );
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("The numbers after the swap done : " + a + "and" + b );

    }
}