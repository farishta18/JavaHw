package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();

        while (number!=-1){
            System.out.println("try again");
            number=scan.nextInt();
        }
    }
}
