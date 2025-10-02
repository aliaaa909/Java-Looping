import java.util.Scanner;

public class CashierApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("          CASHIER DISCOUNT PROGRAM          ");
        System.out.println("===========================================");

        // Request input for total purchase from user
        System.out.print("Enter Total Purchase: Rp. ");
        double totalPurchase = input.nextDouble();

        // Create transaction object from ShoppingDiscount class
        ShoppingDiscount transaction = new ShoppingDiscount(totalPurchase);

        // Display receipt result
        transaction.printReceipt();
        
        input.close();
    }
}
