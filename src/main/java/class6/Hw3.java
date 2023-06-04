package class6;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the curent time");
        int time=input.nextInt();

        if(time>=1 && time<=11){
            System.out.println("Morning");
        }else if(time>=12 && time<=15){
            System.out.println("Afternoon");
        }else if(time>=16 && time<=20){
            System.out.println("Evening");
        }else if(time>=21 && time<=24){
            System.out.println("Night");
        }else {
            System.out.println("Invalid hr number");
        }
    }
}
