package class8;

public class E5BreakKeyword {
    public static void main(String[] args) {
         int sum=0;

        for (int i = 0; i < 10; i++) {
            if (i>5){
                break;
            }
            System.out.println(i);
        }
       for (int i = 0; i < 50; i++) {
            sum=sum+i;
            if (sum>300){
                System.out.println(i);
                break;
            }

        }
    }
}
