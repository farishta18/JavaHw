package class7;

public class Hw4 {
    public static void main(String[] args) {
        // Print odd numbers between 20 and 50 (2 ways)


        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }

        }

        int counter = 20;
        System.out.println();
        while (counter <= 50) {
            if (counter % 2 == 1) {
                System.out.print(counter + " ");
            }
            counter++;
        }

    }
}
