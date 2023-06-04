package class17;

public class Zabra {
    String name;
    String color;
    int age;
    double weight;


    public Zabra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    void speak(){
        System.out.println("mooooooo boahhhhhh");


    }

}
