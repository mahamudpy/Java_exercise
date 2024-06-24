import java.util.Scanner;

public class taxable_income {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Yearly income  : ");
        double income = scanner.nextDouble();

        if (income <= 300000) {
            System.out.println("Congratulations ! You do not need to pay tax this year ");
        } else if (income >= 400000 && income < 400001) {
            double a = 100000 * .05;
            System.out.print("You need to pay " + a + "for this tax year ");
        } else if (income >= 700000 && income < 700001) {
            double b = 300000 * .10;
            System.out.print("You need to pay " + b + "for this tax year ");

        } else if (income >= 1100000 && income < 1100001) {
            double c = 300000 * .15;
            System.out.print("You need to pay " + c + "for this tax year ");
        } else if (income >= 1600000 && income < 1600001) {
            double d = 300000 * .20;
            System.out.print("You need to pay " + d + "for this tax year ");
        }else if (income > 1600000){
            double e = income * .25;
            System.out.print("You need to pay " + e + "for this tax year ");
        }
    }
}