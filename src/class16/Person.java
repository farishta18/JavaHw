package class16;

public class Person {

    //String name=
    String SSN="1234567899";
    private String password;

    private static double bankBalance=12000;
    private void printPassword(){
        System.out.println(password);
    }
    private void bankBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);
    }
}
