import java.util.Scanner;

public class reguler_ex2 {

    public static void main(String[] args) {

        String[] groceryItems = {
                "Milk", "Bread", "Eggs", "Cheese", "Butter",
                "Rice", "Pasta", "Flour", "Sugar", "Salt",
                "Pepper", "Vegetables (e.g., tomatoes, onions, potatoes, carrots)",
                "Fruits (e.g., apples, bananas, oranges, grapes)",
                "Chicken", "Beef", "Fish", "Yogurt",
                "Cereal", "Juice", "Snacks (e.g., chips, cookies, crackers)"
        };

        System.out.println("Grocery Items:");
        for (String item : groceryItems) {
            System.out.println("- " + item);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any first items out of the list : ");
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        String d = scanner.next();
        String e = scanner.next();

    }

}