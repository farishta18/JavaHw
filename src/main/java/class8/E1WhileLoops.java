package class8;

import java.util.Scanner;

public class E1WhileLoops {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("please enter the starting point ending point and a step");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int step=scan.nextInt();// the step is just to give a user the gap between the numbers.

        int counter=start;
        while (counter<=end){
            System.out.print(counter+" ");
            counter+=step;// counter=counter+stem
        }
    }
}
