package class26;

import java.util.HashMap;
/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> store=new HashMap<>();
        store.put(7664847,"Gagles");
        store.put(9654806,"Shoes");
        store.put(8880218,"dress");
        store.put(2183926,"flowers");
        store.put(3302214,"Charger");
       // var entrySet=store
        for (var e:store.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
