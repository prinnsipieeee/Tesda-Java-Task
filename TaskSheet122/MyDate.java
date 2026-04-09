package TaskSheet122;

 public class MyDate {
 
    public static void main(String[] args) {
        DateTask dt1 = new DateTask();
        DateTask dt2 = new DateTask();

        dt1.setDate(1, 1, 1978);
        dt2.setDate(9, 21, 1984);

        System.out.println(dt1.toString());
        System.out.println(dt2.toString());

        DateTask.leapYears();
    }
 }