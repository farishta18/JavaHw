package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your gender");
        char gender=scanner.next().charAt(2);
        System.out.println("You entered "+gender);
    }
}
