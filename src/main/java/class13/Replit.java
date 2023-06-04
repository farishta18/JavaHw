package class13;


import java.util.Scanner;

public class Replit {


    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names:");

        char ch;
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
            for (String name : names) {
                System.out.println(name);

            }


                //for (String name : names) {
                //System.out.println(name.substring(0, 3));
                // System.out.println(name.substring(4, 8));
                //System.out.println(name.substring(9, 13));
                // System.out.println(name.substring(16, 19));
                // System.out.println(name.substring(21, 24));


                // break;

            }

        }
    }
