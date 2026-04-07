import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        sc.close();
    }
}
