package class21;


public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name=name;
        this.color=color;
        this.breed=breed;
    }


    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
 }

class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
}




