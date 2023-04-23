package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDogobj= new Dog();
        actualDogobj.name="Jacky";
        actualDogobj.age=15;
        actualDogobj.breed="German";
        actualDogobj.color="Black";
        actualDogobj.weight=50;

        actualDogobj.bark();

        Dog obj=new Dog();
        /*obj.name="Jack";
        obj.age=11;
        obj.breed="American";
        obj.color="White";
        obj.weight=40;*/

    }
}
