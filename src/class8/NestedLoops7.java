package class8;

public class NestedLoops7 {
    public static void main(String[] args) {
         /* 0 1 2 3 4 5
            1 2 3 4 5
            2 3 4 5
          */

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}





