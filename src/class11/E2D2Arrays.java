package class11;

public class E2D2Arrays {
    public static void main(String[] args)

    {String[][] names={
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j <names[i].length ; j++) {

                System.out.print(names[i][j]+" ");

            }
            System.out.println();
        }
    }
}
