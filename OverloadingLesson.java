public class OverloadingLesson {
    public void fly(int numMiles){
        System.out.println("int");
    }
    public void fly(short numfeet){
        System.out.println("Prince");
    }

    public boolean fly(){
        return false;
    }
    void fly(int numMiles, short numfeet){
        
    }

    public static void main(String[] args) {
        OverloadingLesson oll = new OverloadingLesson();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        System.out.println(oll.fly());
    }

}
