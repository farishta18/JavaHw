package class25;

import java.util.TreeSet;

public class task2 {
    public static void main(String[] args) {
        // Create a Set in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.

        TreeSet<String> listOfCountries = new TreeSet<>();
        listOfCountries.add("USA");
        listOfCountries.add("Argentina");
        listOfCountries.add("China");
        listOfCountries.add("Pakistan");
        listOfCountries.add("India");
        listOfCountries.add("Brazil");
        listOfCountries.add("Spain");
        listOfCountries.add("Netherlands");
        listOfCountries.add("United Kingdom");
        listOfCountries.add("Belgium");
        System.out.println(listOfCountries);

    }

}
