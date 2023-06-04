package class6;

import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country=scan.next();
        System.out.println("You are from "+country+"and you speak Turkish");

        System.out.println("Please enter any grade from A to D");
        char grade=scan.next().charAt(0);

        if(grade=='A'){
            System.out.println("A-Excellent");
        }else if (grade=='B'){
            System.out.println("B-Good");
        }else if (grade=='C'){
            System.out.println("C-Average");
        }else if (grade=='D'){
            System.out.println("D-Bad");
        }else {
            System.out.println("Not acceptable");
        }
    }
}
