/*public class Animal {
    private String name;
    private String color;
    private String breed;
    private int age;
    private double weight;

    public Animal(String name, String color, String breed, int age, double weight) {

        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }


}

class Dog extends class18.Animal {
    double price;

    public Dog(String name, String color, String breed, int age, double weight, double price) {
        super(name, color, breed, age, weight);
        this.price = price;
    }
    void printInfo(){
        super.printInfo();
        System.out.println(price);
    }
}

class Cat extends class18.Animal {

    public Cat(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class Horse extends class18.Animal {

    public Horse(String name, String color, String breed, int age, double weight) {
        super(name, color, breed, age, weight);
    }
}

class AnimalTester{



    public static void main(String[] args) {
        Dog dog=new Dog("Tom","Black","persian",10,20,200);
        dog.printInfo();
    }
}*/