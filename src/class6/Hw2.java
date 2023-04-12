package class6;

import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number from 1 - 1000");
        int number=scan.nextInt();

        if(number>=1 && number<=10){
            System.out.println("Small");
        }else if(number>=11 && number<=100){
            System.out.println("medium");
        }else if(number>=101 && number<=1000){
            System.out.println("Large");
        }
    }
}
