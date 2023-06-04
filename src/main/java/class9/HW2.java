package class9;

public class HW2 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group. Then print your name
        from that array. (use 2 different ways of creating an array).
         */

        String[] groupN={"Mary","Diana","Corey","Alex","Farishta","Akrem","Boris"};
        System.out.println(groupN[4]);

        String[] groupn=new String[7];
        groupn[0] = "Mary";
        groupn[1] = "Diana";
        groupn[2] = "Corey";
        groupn[3] = "Alex";
        groupn[4] = "Farishta";
        groupn[5] = "Akrem";
        groupn[6] = "Boris";
        System.out.println(groupn[4]);

    }
}
