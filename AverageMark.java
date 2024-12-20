package CW_Day8;
import java.util.Scanner;

public class AverageMark {
    
    public static float calculateAverage(float subject1, float subject2, float subject3) {
        return (subject1 + subject2 + subject3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter marks for subject 1: ");
        float subject1 = sc.nextFloat();
        
        System.out.print("Enter marks for subject 2: ");
        float subject2 = sc.nextFloat();
        
        System.out.print("Enter marks for subject 3: ");
        float subject3 = sc.nextFloat();
        
        float average = calculateAverage(subject1, subject2, subject3);
       
        System.out.println("Average marks: " + average);
        
      
    }
}
