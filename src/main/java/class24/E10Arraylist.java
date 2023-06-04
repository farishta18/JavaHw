package class24;

import java.util.ArrayList;

public class E10Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("coffee");
        names.add("Bye");
        names.add("water");
        names.add("Listen");

        names.removeIf(x->x.endsWith("e"));

      /*  Iterator<String> iterator=names.iterator();
        while (iterator.hasNext()){
            String word=iterator.next();
            if (word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(names);*/
    }
}