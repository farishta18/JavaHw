package class20;

public class Grandpa {
    double money;

}

class Father extends Grandpa{
    double money=100;

}
class Child extends Father{
    void printMoney(){
        System.out.println(money);
    }


}