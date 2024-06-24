import java.util.Scanner;

public class leapyear_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month  : ");
        int x = scanner.nextInt();

        int y = switch (x){
            case 1,3,5,7,8,10,12  -> 31;
            case 4,6,9,11 -> 30;
            case 2 ->{
                if ()
            }
        };

    }

}