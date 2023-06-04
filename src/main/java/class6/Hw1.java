package class6;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {


        Scanner can = new Scanner(System.in);
        System.out.println("Please entry a day");

        int day = can.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is weekday");
        } else if (day >= 6 && day <= 7) {
            System.out.println("It's a weekend");
        } else {
            System.out.println("invalid day");
        }
    }
}