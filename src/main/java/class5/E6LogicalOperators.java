package class5;

public class E6LogicalOperators {
    public static void main(String[] args) {

        System.out.println(true ||true||false);
        String gender="F";
        int age=17;

        if(age<18 || age>60){
            System.out.println("you will get a discount");
        }
        if(gender.equals("F") || age>60){
            System.out.println("you will get discound");
        }

    }
}
