package class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Adam");
        names.add("Jack");
        names.add("Lily");
        names.add("Hunderson");
        names.add("Lovely");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Lily"));
        System.out.println(names.size());
        

    }
}
