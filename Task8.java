public class Task8 {

    public static void main(String[] args) {
        // Example usage as per the prompt instructions (4, 5, 10)
        int totalSum = calculateCumulativeSums(4, 5, 10);
        
        System.out.println("\n----------------------------------");
        System.out.println("Grand Total of all cumulative sums: " + totalSum);
    }

    public static int calculateCumulativeSums(int... numbers) {
        int grandTotal = 0;

        System.out.println("Processing Parameters:");
        
        for (int n : numbers) {
            int currentCumulativeSum = 0;
            
            // Calculate sum from 1 to n
            for (int i = 1; i <= n; i++) {
                currentCumulativeSum += i;
            }
            
            System.out.println("Parameter: " + n + " -> Cumulative Sum (1 to " + n + "): " + currentCumulativeSum);
            
            grandTotal += currentCumulativeSum;
        }

        return grandTotal;
    }
}

