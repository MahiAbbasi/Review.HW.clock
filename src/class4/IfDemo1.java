package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {

            System.out.println("lets buy an Iphone");

            if (money > 2000) {

                System.out.println("lets also buy a Macbook");


                boolean mothersDay = true;

                if (mothersDay) {
                    System.out.println("Happy Mothers day");

                    String name = "Sardar";

                    if (name.equals("sardar")) {
                        System.out.println("I love football");
                    }
                }
            }
        }
    }
}