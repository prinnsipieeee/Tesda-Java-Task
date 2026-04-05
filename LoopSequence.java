import java.util.Scanner;

public class LoopSequence {
    public static void main(String[] args) {
        Scanner bog =  new Scanner(System.in);
    
    int f = bog.nextInt();
    while(f < 1 || f > 10){
        System.out.println(f + "is not between 1 & 10. \nTry Again: ");
        f = bog.nextInt();
    }
    System.out.println( f + "is between 1 & 10!");
    }
}
