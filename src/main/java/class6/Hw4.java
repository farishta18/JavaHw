package class6;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your brith month");
        String birthMonth = scan.nextLine();

        if (birthMonth.equals("April") || birthMonth.equals("March") || birthMonth.equals("May")) {
            System.out.println("You were born in Spring");
        } else if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
            System.out.println("you were born in Summer");
        } else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
            System.out.println("You were born in Fall");
        } else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
            System.out.println("You were born in Winter");
        } else {
            System.out.println("Invalid birth month name");
        }
    }
}
