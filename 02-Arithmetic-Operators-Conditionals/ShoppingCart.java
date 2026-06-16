
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
    
        System.out.print("What item would you like?: ");
        item = scanner.nextLine();
        
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would like?: ");
        quantity = scanner.nextInt();
        scanner.nextLine();

        total = price * quantity;
        System.out.println("\nThe total for your "+ quantity + " " + item + "(s)" + " is "+ currency + total);


        scanner.close();
    }
}
