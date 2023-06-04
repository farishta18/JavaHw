package class26;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Double> drinks=new HashMap<>();
        drinks.put("Coke",2.0);
        drinks.put("Milk",5.0);
        drinks.put("Mango juice",5.0);
        drinks.put("Coffee",3.0);
        drinks.put("Tea",3.5);

        drinks.entrySet();
        System.out.println(drinks);

    }
}
