package class13;

public class E6 {
    public static void main(String[] args) {
        String alphn="abcd2335$#&*";
        String alphn2=alphn.replaceAll("^a-zA-Z","");
        System.out.println(alphn2);
        System.out.println(alphn2.length());

    }
}
