import java.util.Scanner;

public class L7E1 {
    private static void showMenu(){
        System.out.println("Menu\n1. Say Hello\n2. Tell me the time\n3. Tell me a joke\n4. Quit");
    }

    public static String getOption() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }




        public static void main(String[] args) {
        int option = 0;
        do {
            showMenu();
            getOption();


        }while (option != 4);
    }
}
