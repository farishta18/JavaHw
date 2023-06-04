package class20;

public class Animal {
    String name;
    String breed;
    int age;

    public Animal(String name, String breed, int age) {
        this.name=name;
        this.breed=breed;
        this.age=age;
    }

    void sleep() {
        System.out.println("zzzzZZZZzzz");
    }
    void eat() {
        System.out.println("eating");
    }
    void speek() {
        System.out.println("speaking");
    }
}

class Dog extends Animal {
    Dog(String name, String breed, int age) {
        super(name, breed, age);
    }
    @Override
    void sleep() {
        System.out.println("I like to sleep 8.9 hrs");
    }
}
    class Cat extends Animal {
        Cat(String name, String breed, int age) {
            super(name, breed, age);
        }

    }

   class Horse extends Animal {
       Horse(String name, String breed, int age) {
           super(name, breed, age);
       }

   }


