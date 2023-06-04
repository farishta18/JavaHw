package prlits;

public class Main {
    public static void main(String[] args) {
        Method method=new Method();
        int[][] arr = {

                { 1, 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9 }
        };
        int sum=method.sum2D(arr);
        System.out.println(sum);
    }
}

