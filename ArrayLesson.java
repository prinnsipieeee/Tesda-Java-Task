import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int[][] diffsize = {{1,2},{3,4},{4}};
        System.out.println(diffsize[1][0]);
    String[][] name = 
    {{"Prince","Patrick"}, 
    {"Jupet", "Jacob"},
    {"Nice", "Oploks"}};

    System.out.println(Arrays.deepToString(name));
    System.out.println(name[2][0]);
    
    int i = 1;
    while(i <= 5){
    System.out.println(name[2][0]);
    i++;
    }
    
    int s = 1;
    while(s <= 5){
        System.out.println("hello");
    break;
    }
    }
}