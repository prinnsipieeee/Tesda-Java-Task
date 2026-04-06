import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();

        list1.add("Hello");
        list1.add('1');
        list1.add(true);
        System.out.println(list1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(75);
        list2.add(78);
        list2.add(97);
        System.out.println(list2);
        Collections.sort(list2);
        list2.add(0,10);
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        List<Integer> nums2 = Arrays.asList(1,29,90,7,8,9,75,93,101,65,4,2);
        Collections.sort(nums2);
        List<Integer> list3 = new ArrayList<>(nums2);
        System.out.println(list3);
        Collections.shuffle(list3);
        System.out.println(list3);
        Collections.reverse(list3);
        System.out.println(list3);

        List<String> names1 = Arrays.asList
        ("Prince", 
        "Joseph", 
        "Carlo", 
        "Esmeralda", 
        "Jaylen");
        List<String> list4 = new ArrayList<>(names1);
        System.out.println(list4);
        Collections.sort(list4);
        System.out.println(list4);
        Collections.reverse(list4);
        System.out.println(list4);

        
    }
}