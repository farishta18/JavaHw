package class24;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>();
        words.add("coffee");
        words.add("Bye");
        words.add("water");
        words.add("Listen");

        for (int i = 0; i < words.size(); i++) {
            String word=words.get(i);
            if (word.endsWith("e")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
