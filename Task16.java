interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// 1. Create a gorilla class which implements the Animal interface
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // Add comment: put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // Add comment: lather, rinse, repeat
        System.out.println("Grooming the gorilla's fur.");
    }

    @Override
    public void pet() {
        // Add comment: pet at your own risk
        System.out.println("Attempting to pet the gorilla...");
    }
}

// Main class para ma-test mo ang code
public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        
        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}