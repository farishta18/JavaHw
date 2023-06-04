package class8;

public class E6WhileAndBreak {
    public static void main(String[] args) {

        boolean summer=true;
        int tem=85;
       while (summer){
           if (tem<100){
               System.out.println("It good I enjoy summber");
           }else {
               System.out.println("it is very hot");
               break;
           }
           tem=tem+3;

       }
    }
}
