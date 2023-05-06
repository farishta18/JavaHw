package class14;

public class E5Tester {
    public static void main(String[] args) {
        {
            int[] array = {10, 20, 45};
            int number = 20;
            E5ArrayUtils obj = new E5ArrayUtils();
            boolean resul = obj.contains(array, number);
            System.out.println(resul);
        }
    }
}
