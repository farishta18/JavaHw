package class9;

public class Hw7 {
    public static void main(String[] args) {
        /*
   From an array of integer elements find the largest number. */

        int[] a = {55, 23, 1000, 42, 00, 809, 33};

        int max= a [0];

        for (int i = 0; i < a.length; i++)
        {

            if (a[i] >max) {
                max = a[i];
            }

        }
        System.out.println(max);
    }
}
