package class18;

public class Person {
    String name;
    void sleep(){
        System.out.println("zzzzzZZZzzz.....");
    }
}
    class Employee extends Person{

    }
    class Tester extends Person{

    }
class PersonTester{
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.name="Sarah";
        System.out.println(tester.name="Sarah");
        tester.sleep();

    }

}
