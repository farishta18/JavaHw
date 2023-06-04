package class5;



public class E4NestedIf {
    public static void main(String[] args) {

        String day = "Monday";
        int money = 50000;
        int money1 = 10000;

        if (money > 10000) {

            if (day.equals("Sunday")) {

                System.out.println("Lets go shopping");
            } else {
                System.out.println("lets wait for sunday");

            }

        } else {
            System.out.println("let's save more");

        }
    }
}
