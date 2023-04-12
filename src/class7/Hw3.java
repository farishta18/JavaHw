package class7;

public class Hw3 {
    public static void main(String[] args) {

        //Print even numbers from 20 to 1 (2 ways)

        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        int counter = 20;
        System.out.println();
        while (counter >= 1) {
            System.out.print(counter + " ");
            counter -= 2;
        }


        int i = 20;
        System.out.println();
        do {
            System.out.print(i + " ");
            i -= 2;
        } while (i >=1 );
    }
}
