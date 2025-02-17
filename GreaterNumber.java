package CW_Day8;
import java.util.Scanner;

public class GreaterNumber {

    static void findGreater(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        findGreater(num1, num2);

        sc.close();
    }
}
