import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingDiscount {
    // Attribute to store the initial total purchase
    private double totalPurchase;

    // Constructor to create object with purchase total data
    public ShoppingDiscount(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    // Method to calculate discount amount based on criteria
    private double calculateDiscount() {
        double discount;
        if (this.totalPurchase < 50000) {
            // 5% discount if purchase is less than 50,000
            discount = 0.05 * this.totalPurchase;
        } else {
            // 20% discount if purchase is 50,000 or more
            discount = 0.20 * this.totalPurchase;
        }
        return discount;
    }

    // Method to calculate the total payment
    private double calculateTotalPayment() {
        return this.totalPurchase - calculateDiscount();
    }

    // Method to display the receipt with Rupiah currency format
    public void printReceipt() {
        // Create formatter for Rupiah currency format
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        double discountAmount = calculateDiscount();
        double totalPayment = calculateTotalPayment();

        System.out.println("-------------------------------------------");
        // Print output in the requested format
        System.out.println("Total Purchase       : " + formatter.format(this.totalPurchase));
        System.out.println("Discount Amount      : " + formatter.format(discountAmount));
        System.out.println("Total Payment        : " + formatter.format(totalPayment));
        System.out.println("-------------------------------------------");
    }
}
