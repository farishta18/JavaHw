package class4;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for a drivers license");
        } else {
            System.out.println("You are eligible for learners permit not drivers license");
        }

    }
}
