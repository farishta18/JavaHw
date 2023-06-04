package class10;

public class E5D2Array {
    public static void main(String[] args) {

        int[][] matrix= {
                {10, 20, 30, 50},
                {20, 50, 65, 20},
                {10, 20, 30},
                {20, 50}
        };

        for (int  rows= 0; rows < matrix.length; rows++) {
            for (int Colums = 0; Colums <matrix[rows].length; Colums++) {
                System.out.print(matrix[rows][Colums]);

            }
            System.out.println();
        }
    }
}
