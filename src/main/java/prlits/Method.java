package prlits;

public class Method {
    static int sum2D(int[][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];

            }

        }
        return sum;
    }
}
