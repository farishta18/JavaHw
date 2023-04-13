package class10;

public class E4D2Array {
    public static void main(String[] args) {

        int[][] matrix= {
                {10, 20, 30},
                {10, 20, 30},
                {10, 20, 30}


        };
        for (int j = 0; j < 3; j++) {
            int [] arr1=matrix[j];
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+" ");
            }

            System.out.println();
        }


    }
}
