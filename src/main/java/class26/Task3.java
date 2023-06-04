package class26;
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop
 */

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("Washington DC","America");
        countries.put("Landon","Uk");
        countries.put("New Delhi","India");
        countries.put("Moscow","Russia");
        countries.put("Madrid","Spain");


        for (String c: countries.keySet()) {
            System.out.println(c);

        }

        System.out.println("******************");


        for (String V: countries.values()) {
            System.out.println(V);
        }

        System.out.println("******************");

        for (var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
