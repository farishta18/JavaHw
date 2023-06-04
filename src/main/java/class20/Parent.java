package class20;

public class Parent {
    void getMarry(){
        System.out.println("Marr to the girl of our choice");
    }
}
class Axel extends Parent{
    void getMarry(){
        System.out.println("I want to marry karol and want 10 kids");
    }
}
class ParentTeste{
    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();
    }
}