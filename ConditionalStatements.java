import java.util.*;

public class ConditionalStatements {

   public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    if(true){
        System.out.println("Prince Penaflor");
    } 
    System.out.println("You're not the father!");

    int x = 5;
    int y = 10;

    if(x > y) {
        System.out.println("The maximum is " + x);
    }
    if(y > x) {
        System.out.println("The maximum is " + y);
    }
    System.out.print("Enter a Integer: ");

    int n = sc.nextInt();

    if( n % 2 == 0) {
    System.out.println("This number is an Even Number " + n);
    }

    if(n % 2 == 1) {
        System.out.println("This number is an Odd Number: " + n);
    }

    System.out.println("Pick True or False.");
    
    boolean j = sc.nextBoolean();

    if( j == true) {
        System.out.println("Bakla ka pala eh!");
    } else {
        System.out.println("Ay hindi pala");
    }

    System.out.print("Enter a number: ");
    int k = sc.nextInt();

    if (k % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }

    System.out.print("Enter a number: ");
    int l = sc.nextInt();
    
    if( l > 10){
        System.out.println(l + " Is greater than 10");
    } else if( l == 10){
        System.out.println(l + " Is equal to 10");
    } else {
        System.out.println(l + " Is less than 10");
    }

    System.out.println("Enter your Pass: ");

    int why = sc.nextInt();

    if( why == 109320){
        System.out.println("Welcome Back!");
    } else if (l == 0) {
        System.out.println("Back to work!");        
        }
    sc.close();
   }
}
