import java.util.Scanner;
public class L5E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a base number: ");

        int n = scanner.nextInt();

        for( int count=1; count<=12; count++){
            int multiple = count * n;


            System.out.println(n + "x" + count + "=" + multiple);
    }
}
}

