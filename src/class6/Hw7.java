package class6;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the 1st number");
        int num1=input.nextInt();

        System.out.println("please enter the 2nd number");
        int num2=input.nextInt();

        System.out.println("choose any operator +,-,*,/ ");
        char op=input.next().charAt(0);

        if (op=='/'){
            System.out.println(num1/num2);
        }else if (op=='+'){
            System.out.println(num1+num2);
        }else if (op=='*'){
            System.out.println(num1*num2);
        }else if (op=='-'){
            System.out.println(num1-num2);

        }
    }
}
