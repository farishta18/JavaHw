package class5;

public class E8LogicalOperators {
    public static void main(String[] args) {

            boolean a, b, c;
            a = b = c = true;

            if( !a || ( b && c ) ) {
                System.out.println("If executed");
            } else {
                System.out.println("else executed");
            }

        }
    }


