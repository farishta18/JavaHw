package class26;

import java.util.LinkedHashMap;
/*
Create a map of a building. Store floor number
 and its associated company name. (Example: 1= Google, 2=Syntax etc..).
  Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Building= new LinkedHashMap();
        Building.put(1,"Google");
        Building.put(2,"Google");
        Building.put(3,"Syntax");
        Building.put(4,"Alibaba");
        Building.put(5,"Alibaba");
        Building.put(6,"Nova");
        Building.put(7,"Roosevelt");
        System.out.println("Building size is "+Building.size());
        Building.replace(4,"Amazon");
        Building.remove(7,"Roosevelt");
        System.out.println(Building);
    }
}
