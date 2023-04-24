package class13;

public class E7 {
    public static void main(String[] args) {
        /*
        ou have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?

         */
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] stArr=str.split("[?]");
        System.out.println(stArr.length);
    }
}
