import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class L9E2 {

    public static void exception1() {
        // ArithmeticException: Divide by zero
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // ArithmeticException: Integer overflow
        int exception2 = Integer.MAX_VALUE + 1;
    }

    public static void exception3() {
        // ArrayIndexOutOfBoundsException
        int[] myArray3 = new int[5];
        int exception3 = myArray3[5];
    }

    public static void exception4() {
        // NullPointerException
        int[] myArray4 = null;
        int exception4 = myArray4[0];
    }

    public static void exception5() {
        // FileNotFoundException
        try {
            File exception5 = new File("exception5.txt");
            Scanner scanner = new Scanner(exception5);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public static void exception6() {
        // NumberFormatException
        try {
            String thisString = "Hello";
            int exception6 = Integer.parseInt(thisString);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

    public static void exception7() {
        // NullPointerException
        try {
            String exception7 = null;
            System.out.println(exception7.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();
    }
}
