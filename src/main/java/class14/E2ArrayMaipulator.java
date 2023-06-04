package class14;

import java.util.Scanner;

public class E2ArrayMaipulator {


    int sumArr(int [] arr){
    int sum=0;
        for (int i=0; i<arr.length;i++) {
            sum=sum+arr[i];

        }

        return sum;
    }

    public static void main(String[] args) {

        E2ArrayMaipulator obj=new E2ArrayMaipulator();
        int [] array={10,20,39};
        int results=obj.sumArr(array);
        System.out.println(results);


    }
}
