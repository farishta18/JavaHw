package class9;

public class Hw4 {
    public static void main(String[] args) {
  /*
   Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

 */

        String[] cars={"coupe","SUV","Sedan","hatchback","Mazda","Honda Civic"};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");


        }
        System.out.println();
            for (String x: cars){
                System.out.print(x+" ");

            }

        }

    }

