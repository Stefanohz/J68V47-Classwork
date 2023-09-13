import java.util.Scanner;

public class L3E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = "Stefano";
        System.out.print(firstname );

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your year of birth YYYY: ");
        String yearofbirth = input.nextLine();


        System.out.print("Mazzuka " + surname);
        System.out.print("1996 " + yearofbirth );



    }
}
