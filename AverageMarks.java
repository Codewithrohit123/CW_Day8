package CW_Day8;
import java.util.*;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for subject 1: ");
        float subject1 = sc.nextFloat();
        
        System.out.print("Enter marks for subject 2: ");
        float subject2 = sc.nextFloat();
        
        System.out.print("Enter marks for subject 3: ");
        float subject3 = sc.nextFloat();
        
        float average = (subject1 + subject2 + subject3) / 3;
        
        System.out.println("Average marks: " + average);
        
    }
}
