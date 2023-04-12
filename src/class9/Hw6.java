package class9;

public class Hw6 {
    public static void main(String[] args) {
        /*

Create an array on integers and calculate the sum of all elements in an array

         */
        
        int[] integers={33,16,8,40,98,63,45,29};
        
        int sum=0;
        for (int i = 0; i < integers.length-1; i++) {
            sum=sum+integers[i];
            
        }
        System.out.println(sum);



    }
}
