import java.util.Scanner;

public class L3E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstname = input.nextLine();
        System.out.print(firstname );

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your year of birth YYYY: ");
        String year = input.nextLine();

        String Username = firstname.substring(0, 1).toUpperCase() + surname.toLowerCase();
        String Password = surname.substring(0, 1).toLowerCase() + firstname.substring(0, Math.min(3, firstname.length())).toUpperCase() + year;

        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);

    }
}
