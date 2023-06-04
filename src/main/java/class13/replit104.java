package class13;

import java.util.Scanner;

public class replit104 {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        String name[]= new String [5];

        for (int i=0; i<5; i++){
            String names= scan.nextLine();
            name[i]=names;
        }
        for (int i=0; i<5; i++){
            System.out.println(" ");
            for(int j=0; j<3; j++){
                System.out.print(name[i].charAt(j));
            }
        }
    }
}

