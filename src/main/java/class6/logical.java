package class6;

import java.util.Scanner;

public class logical {

        public static void main(String[]args){
            Scanner input=new Scanner (System.in);

            System.out.println("Enter your name");
            String name=input.next();

            System.out.println("Enter your mobile number");
            String mbNum=input.next();

            System.out.println("Enter your age");
            String age=input.next();

            System.out.println("Your name is "+name+" "+age+ " and your mobile number is "+mbNum);

        }

    }

