package class4;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese Entr First Name");
        String name = scan.nextLine();
        System.out.println("your name is " + name);

        System.out.println("Plese Enter Last Name");
        String lastName = scan.nextLine();
        System.out.println("your last name is " + lastName);
        System.out.println(name+" "+lastName);
    }
}
