package class17;

public class Dog {
    private String name;
    private String color;
    private String breed;
    private int age;

    Dog(String dogName, String dogColor, String dogBreed, int dogAge) {


        name = dogName;
        color = dogColor;
        breed = dogBreed;
        age = dogAge;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }
    // create 5 objects of this dog class provide initial values and for each
    // object call the printInfo method.
}

        /*Dog dog1=new Dog();
        dog1.name="Jack";
        dog1.color="black";
        dog1.breed="German";
        dog1.age=8;

        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Lazy";
        dog2.color="Brown";
        dog2.breed="American";
        dog2.age=7;

        dog2.printInfo();

        Dog dog3=new Dog();
        dog3.name="YoYo";
        dog3.color="White";
        dog3.breed="Itlan";
        dog3.age=10;

        dog3.printInfo();

        Dog dog4=new Dog();
        dog4.name="jakson";
        dog4.color="Orange";
        dog4.breed="Russain";
        dog4.age=3;

        dog4.printInfo();

        Dog dog5=new Dog();
        dog5.name="Jake";
        dog5.color="black";
        dog5.breed="Persian";
        dog5.age=5;

        dog5.printInfo();*/





