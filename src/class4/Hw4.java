package class4;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {

        double temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the temperature in your city");

        temp=scanner.nextDouble();
        temp= ((temp-32)*5)/9;
        System.out.println("Temperature is "+temp+ "in Falls Church");
    }
}
