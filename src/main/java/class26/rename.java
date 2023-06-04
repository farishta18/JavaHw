package class26;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rename {


    public static void main(String[] args){
        List<Map<String,Object>> dataList= new ArrayList<>();

        Map<String,Object> appleMap= new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);


        Map<String,Object> orangeMap= new HashMap<>();
        orangeMap.put("Items", "Apple");
        orangeMap.put("Price", 20.00);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        for(var a:dataList){
            String items = (String) a.get("Items");
            double price = (double) a.get("Price");
            int quantity = (int) a.get("Quantity");

            double subtotal=price*quantity;

            System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subtotal);
        }


        double totalPurchase = 0.0;
        for(var map:dataList){
            double price = (double) map.get("Price");
            double quantity = (double) map.get("Quantity");
            totalPurchase += price * quantity;
        }

        System.out.println("Your Purchase total: " + totalPurchase);
    }
}

