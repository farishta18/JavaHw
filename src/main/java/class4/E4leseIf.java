package class4;

public class E4leseIf {
    public static void main(String[] args) {
        String fruit="Apple";
        if (fruit.equals("Orange")){
            System.out.println("you have to pay $123");
        }
        else if(fruit.equals("Banana")){
            System.out.println("you have to pay $5");
        }
        else if (fruit.equals("Apple")){
            System.out.println("you have to pay $4");
        }
        else {
            System.out.println("This fruit is not available");
        }
    }
}
