package class5;

import java.util.Scanner;

public class E3IFElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("How old are you?");
        int age=input.nextInt();

        if(age<8){
            System.out.println("you can't drive");
        }else{
            System.out.println("you can drive");
        }
    }
}
