package class8;

import java.util.Scanner;

public class HomeWork82 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <=10; i++) {
        System.out.println("apply for credit card");
        boolean CreditCard= scanner.hasNextBoolean();
        if (CreditCard){
          break;
            }
       }
    }
}
