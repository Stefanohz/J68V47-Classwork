import java.util.Scanner;
public class L6E2 {
    public static void main(String[] args) {
        int ans;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Choose one of the following options: ");
            System.out.println("1. Say Hello\n12. Tell me the time\n3. Tell me a joke\n4. Quit");
            ans = scanner.nextInt();

            if (ans == 1) {
                System.out.println("Hello!");
            } else if (ans == 2) {
                System.out.println("14:48");
            } else if (ans == 3) {
                System.out.println("Your code T.T");


            }

        } while (ans != 4);
        scanner.close();
    }
}



