package CW_Day8;
import java.util.Scanner;

public class TrianglePerimeter {

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();
        
        System.out.println("Perimeter: " + calculatePerimeter(side1, side2, side3));
        
      
    }
}
