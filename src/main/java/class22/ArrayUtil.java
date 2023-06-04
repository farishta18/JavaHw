package class22;

public interface ArrayUtil {

    public boolean searchArr(int [] array, int number);

    double getAvg(double[] arr);
}

class Main implements ArrayUtil {

    @Override
    public boolean searchArr(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;

    }

    @Override
    public double getAvg(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
return sum;
    }
}
