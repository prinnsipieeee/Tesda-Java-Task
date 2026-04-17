import java.util.*;
import java.util.function.*;

public class LambdaLesson {
    
    // Ginawa nating static at inayos ang variable name mula 'check' papuntang 'checker'
    static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal : animals){
            // Dati: check.test(animal) -> Mali dahil 'checker' ang parameter name mo
            if(checker.test(animal)){ 
                System.out.print(animal + ", ");
            }
        }
        System.out.println("\n*********"); // Nilagyan ko ng \n para malinis tignan
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // Ginamit ang Diamond Operator <>
        animals.add(new Animal("Fish", false, true, 1));
        animals.add(new Animal("Kangaroo", true, false, 5));
        animals.add(new Animal("Rabbit", true, false, 2));
        animals.add(new Animal("Turtle", false, true, 10)); // Fixed typo: Trutle -> Turtle
        animals.add(new Animal("Frog", true, true, 2));
        animals.add(new Animal("Koala", false, false, 6)); // Fixed typo: Kaola -> Koala
        
        System.out.println("Swimmers:");
        print(animals, a -> a.canSwim());
        
        System.out.println("Hoppers:");
        print(animals, a -> a.canHop());
        
        System.out.println("Both Hop and Swim:");
        print(animals, a -> (a.canHop() && a.canSwim()));
        
        System.out.println("Neither Hop nor Swim:");
        print(animals, a -> (!a.canHop() && !a.canSwim()));
        
        System.out.println("Older than 3:");
        print(animals, a -> a.getAge() > 3);

        // Functional Interfaces
        NumberiInterface ni = (a, b, z) -> { return a + b; };
        NumberiInterface ni2 = (a, b, z) -> a * b + 100;
        
        System.out.println("Addition (4+5): " + ni.aPlusB(4, 5, false));
        System.out.println("Math (8*9+100): " + ni2.aPlusB(8, 9, false));

        DiscountItems tenPercent = (a) -> a - (a * 0.10);
        DiscountItems twentyPercent = (a) -> a - (a * 0.20);
        DiscountItems fiftyPercent = (a) -> a - (a * 0.50);

        int itemTotal = 1000;
        System.out.println("10% Discount: " + tenPercent.dc(itemTotal));
        System.out.println("20% Discount: " + twentyPercent.dc(itemTotal));
        System.out.println("50% Discount: " + fiftyPercent.dc(itemTotal));
    }
}

// NILABAS ANG MGA ITO SA LambdaLesson CLASS (dapat nasa labas sila ng closing brace ng main class)

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;

    public Animal(String speciesName, boolean hopper, boolean swimmer, int age) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
        this.age = age;
    }

    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public int getAge() { return age; }

    @Override
    public String toString() { 
        return species + "(age is " + getAge() + ")";
    }
}

interface NumberiInterface {
    int aPlusB(int a, int b, boolean t);
}

interface DiscountItems {
    double dc(double q);
}

// Optional interfaces kung gagamitin mo sa ibang part:
interface CheckTrait {
    boolean test(Animal a);
}