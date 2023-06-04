package class18;

public class D {
    static void printF(){
        System.out.println("hey");
    }
}

class F extends D {

}
class Etester{
    public static void main(String[] args) {
        F.printF();
    }
}