package class16;

public class DogTester {

    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.breed="German";
        dog1.color="Black";
        dog1.name="Jack";

        Dog dog2=new Dog();
        dog2.breed="persian";
        dog2.color="White";
        dog2.breed="sam";

        dog1.printInfo();

        dog1.age=30;
        Dog.printInfo2();
        dog1.age=30;


    }
}
