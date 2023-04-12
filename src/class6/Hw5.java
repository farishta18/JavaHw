package class6;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz, mid term, and final scores");
        int Quiz = input.nextInt();
        int midTerm = input.nextInt();
        int averageSc = input.nextInt();
        if (averageSc >= 90) {
            System.out.println("Grade=A");
        } else if (averageSc >= 70 && averageSc < 90) {
            System.out.println("Grade=B");
        } else if (averageSc >= 50 && averageSc < 70) {
            System.out.println("Grade=C");
        } else if (averageSc < 50) {
            System.out.println("Grade=F");
        } else {
            System.out.println("Wrong average score");
        }
    }
}
