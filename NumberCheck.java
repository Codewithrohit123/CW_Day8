package CW_Day8;
import java.util.*;

public class NumberCheck {

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
      
        checkNumber(num);
        
    }
}

