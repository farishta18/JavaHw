package class25;

import java.util.LinkedHashSet;

//Mantans the order of inseration
public class Task3 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Atlanta");
        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);
}
}

