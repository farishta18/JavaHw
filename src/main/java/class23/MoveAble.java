package class23;

public interface MoveAble {
    void move();


}
interface WashAble{
    void wash();
}
class Dog implements MoveAble,WashAble{

    @Override
    public void move() {
        System.out.println("Moving......");
    }

    @Override
    public void wash() {

    }
}
class Cat implements MoveAble{
    @Override
    public void move() {
        System.out.println("Cat can also move");
    }
}
class Horse{
    public void move(){
        System.out.println("Cats can also move");
    }
}