import java.util.Scanner;

public class LargestNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        
        // Find the largest number
        double largest = Math.max(num1, Math.max(num2, num3));
        
        // Display the sum of the largest number
        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the largest number is: " + largest);
        
        scanner.close();
    }
}
