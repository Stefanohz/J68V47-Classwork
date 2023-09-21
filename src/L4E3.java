import java.util.Scanner;
public class L4E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        double totalPurchase = scanner.nextDouble();

        double shipping = 0.0;
        if (totalPurchase < 50.0) {
            shipping = 10.0;
        }
        double finalTotal = totalPurchase + shipping;

        System.out.println("Shipping cost is: £" + String.format("%.2f", shipping));
        System.out.println("Your final total is: £" + String.format("%.2f", finalTotal));

       scanner.close();
    }
}
