import java.util.*;
public class L2E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = input.nextLine();

        System.out.print("What is your hobby? ");
        String hobby = input.nextLine();

        System.out.println("Hello " + firstName + ", glad you like " + hobby);

    }
}
