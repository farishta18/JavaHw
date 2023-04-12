package class6;

import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int num1=scanner.nextInt();

        System.out.println("Please enter any operator +,-,*,/");
        char op=scanner.next().charAt(0);

        System.out.println("Please enter the 2nd number");
        int num2=scanner.nextInt();

        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }
    }
}
