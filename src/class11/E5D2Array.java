package class11;

public class E5D2Array {
    public static void main(String[] args) {
        int [][] arr2D={
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2},
        };

        int count=0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j]%2==0)
                count++;

            }

        }
        System.out.println(count);
        System.out.println("____________");
        int count1=0;
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                if (anInt%2==0){
                    count1++;
                }
                
            }
        }
        System.out.println("count = " + count1);
    }

}
