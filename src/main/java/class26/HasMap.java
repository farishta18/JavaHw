package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {
        // Step 1: Create a list of maps
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Step 2: Create appleMap and add pairs
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        // Step 3: Add appleMap to dataList
        dataList.add(appleMap);

        // Step 4: Create orangeMap and add pairs
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        // Step 5: Add orangeMap to dataList
        dataList.add(orangeMap);

        // Step 6: Loop through dataList
        for (Map<String, Object> map : dataList) {
            // Step 7: Retrieve each key
            String items = (String) map.get("Items");
            double price = (double) map.get("Price");
            double quantity = (double) map.get("Quantity");

            // Step 8: Calculate subtotal
            double subtotal = price * quantity;

            // Step 9: Print values for each iteration
            System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subtotal);
        }

        // Step 10: Calculate totalPurchase
        double totalPurchase = 0.0;
        for (Map<String, Object> map : dataList) {
            double price = (double) map.get("Price");
            double quantity = (double) map.get("Quantity");
            totalPurchase += price * quantity;
        }

        // Step 11: Print the value of totalPurchase
        System.out.println("Your Purchase total: " + totalPurchase);
    }
}

       /* Map<String, Integer> map = new HashMap<>();

        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

        display(map);

        public static void display (<Map< String, Integer >> map){

            if (map.empty) {
                System.out.println("map is empty");
            } else {
                for (var e : map.entrySet()) {
                    System.out.println(e.getKey() + e.getValue());


                }
            }
        }
    }
*/