package class17;

public class Car {
    String make;
    String model;
    String color;
    int engineCC;

    Car(String make, String model, int engineCC, String color){
        this.make=make;
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","Civic Type R",100,"White");
        car.printInfo();
    }
}
