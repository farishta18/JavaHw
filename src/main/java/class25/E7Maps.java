package class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
        HashMap<String, Double> grocery=new HashMap<>();
        grocery.put("Apple",2.5);
        grocery.put("Soap",3.1);
        grocery.put("Eggs",3.5);
        grocery.put("Milk",2.5);
        grocery.put("Apple",2.5);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsValue("Eggs"));
        System.out.println(grocery.containsValue(3.5));
        System.out.println(grocery.isEmpty());


    }
}
