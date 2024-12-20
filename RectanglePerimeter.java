package CW_Day8;
import java.util.Scanner;

public class RectanglePerimeter {

    static void calculatePerimeter(int length, int width) {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();

        calculatePerimeter(length, width);

        sc.close();
    }
}

