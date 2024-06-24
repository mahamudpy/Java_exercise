import java.util.Scanner;


public class hexagon_15 {

    public static void main(String[] args) {

        double s,  area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length : ");
        s = scanner.nextDouble();

        area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));


        System.out.println("The area of the hexagon is : " + area);

    }

}