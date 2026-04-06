import java.util.Scanner;

public class TaskSheet113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        
        System.out.println("\nNumbers from " + start + " to " + end + " and their classification:");
        System.out.println("========================================");
        
        // Count odd and even numbers
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " → EVEN");
                evenCount++;
            } else {
                System.out.println(i + " → ODD");
                oddCount++;
            }
        }
        
        System.out.println("========================================");
        System.out.println("Total ODD numbers: " + oddCount);
        System.out.println("Total EVEN numbers: " + evenCount);
        
        scanner.close();
    }
}
