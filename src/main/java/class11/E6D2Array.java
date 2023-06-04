package class11;

public class E6D2Array {
    public static void main(String[] args) {
        int [][] arr2D={
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2},
        };

       /* int sum=0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
            }
        }*/
        int sum=0;
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                sum=sum+anInt;
            }
            System.out.println(sum);
            sum=0;
        }
    }

}
