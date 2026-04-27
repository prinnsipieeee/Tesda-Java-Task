import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Math Operations with Static Import ===");
        
        // Pagkuha ng input mula sa user
        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.println("\n--- Calculating Results ---");
        
        // Paggamit ng ating static methods
        try {
            System.out.println("Addition (Exact):       " + add(a, b));
            System.out.println("Subtraction (Exact):    " + subtract(a, b));
            System.out.println("Multiplication (Exact): " + multiply(a, b));
            
            if (b != 0) {
                System.out.println("Floor Division:         " + divide(a, b));
            } else {
                System.out.println("Floor Division:         Error (Cannot divide by zero)");
            }
        } catch (ArithmeticException e) {
            // Ito ay mag-ti-trigger kung mag-overflow ang integer values
            System.out.println("Error: Math operation resulted in an integer overflow!");
        }

        scanner.close();
        System.out.println("---------------------------");
    }

    // Addition gamit ang Math.addExact()
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction gamit ang Math.subtractExact()
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication gamit ang Math.multiplyExact()
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division gamit ang Math.floorDiv()
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }
}

