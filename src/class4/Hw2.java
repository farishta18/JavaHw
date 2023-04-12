package class4;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {

        /*
        2) You are a loan specialist and you need to ask user what is the amount of loan
        is needed. If loan is less or equal to 200,000 then you would lend the money
        otherwise you would reject the client.
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("How much loan do you need");
        int loan=scanner.nextInt();

        if (loan<=200000){
            System.out.println("I will lend you the money");
        }
        else{
            System.out.println("I can not lend you the money");
        }

    }
}
