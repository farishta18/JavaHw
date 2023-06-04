package class13;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr={10, 20, 45, 89};
        int[] arr1={101, 202, 45, 899};
        int[] arr2={120, 202, 5, 889};

        int number=89;
        int number1=10;
        int number2=10;

        ArrayUtil ivana=new ArrayUtil();
        ivana.searchArray(arr,number);
        ivana.searchArray(arr,number1);
        ivana.searchArray(arr,number2);


    }
    void searchArray(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== number){
                System.out.println("yes");
                break;
            }

        }
    }
}
