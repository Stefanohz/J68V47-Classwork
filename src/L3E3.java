import java.util.Scanner;
public class L3E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan amount: £");
        double loanAmount = scanner.nextDouble();

        System.out.print("Interest rate (APR %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        int numberOfMonths = numberOfYears * 12;

        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths)));

        System.out.printf("Monthly payment for this loan: £%.2f%n", monthlyPayment);

        scanner.close();
    }
}

