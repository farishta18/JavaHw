package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();

        if (name.equals("Elana")) {
            System.out.println("Mac user");
        }else if(name.equals("Safyan")){
            System.out.println("Naughty");
        }else if (name.equals("Halima")){
            System.out.println("best");
        }else if (name.equals("Axel")){
            System.out.println("Bad boy");
        }

    }
}