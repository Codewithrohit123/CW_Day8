package CW_Day8;
import java.util.*;

public class SquareAndCube {
   
    static void printSquare(int num) {
        System.out.println("Square: " + (num * num));
    }
    static void printCube(int num) {
        System.out.println("Cube: " + (num * num * num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printSquare(num);
        printCube(num);

      
    }
}
