import java.util.Scanner;

public class mul_extra {

    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : " );
        a = scanner.nextInt();

        System.out.println("Enter the Second number : " );
        b = scanner.nextInt();

        a*=b;

        System.out.println("\n");

        System.out.println("The Multiplication is : "  + a);



    }

}


