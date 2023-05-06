package class13;

import java.util.Scanner;

public class replit99 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        if(isPalindrome(givenString)){
            System.out.println(true);

        } else {
            System.out.println(false);}
    }
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

