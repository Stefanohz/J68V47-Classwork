import java.util.Scanner;
public class L4E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter the total value of your order: £");
        double total = scanner.nextDouble();

        System.out.print("Enter the amount you wish to pay as deposit: £");
        double deposit = scanner.nextDouble();

        boolean freeToaster = total <= 500.0 && deposit <= 150.0;

        double remaining = total - deposit;

        System.out.println("\n== RECEIPT ==");
        System.out.println("Customer: " + firstname.charAt(0) + ". " + surname);
        System.out.println("Order Total: £" + total);
        System.out.println("Deposit Paid: £" + deposit);
        System.out.println("Remainder: £" + remaining);

        if (freeToaster) {
            System.out.println("You get a free toaster!");
        }

            System.out.println("\nHave a nice day!");

        scanner.close();
        }










    }


