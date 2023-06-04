package class17;

public class Task1 {

        String name;

        Task1(String task1Name){
            name=task1Name;
            System.out.println(task1Name);
        }
    Task1(){
        System.out.println("I don't know");
    }


        public static void main(String[] args) {
            Task1 task1=new Task1("Jack");
            Task1 task=new Task1();
        }
    }


