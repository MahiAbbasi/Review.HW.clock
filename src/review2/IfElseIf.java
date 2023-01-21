package review2;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more conditions to test
         if (boolean condition){
         code A;
         }else if (boolean condition){
         code B;
         }else if (boolean condition)}
         code C;
         }
         */
        /*Check homework
        if you completed more than 25-> great job
        if you completed more than >20 -> good job
        if you completed more than >10 -> ok job
        if you completed more than >5 -> not good job
         */

        int homework = 30;
        if (homework > 25) {
            System.out.println("Great job!!");
        } else if (homework > 20) {
            System.out.println("good job!!");
        } else if (homework > 10) {
            System.out.println("ok job!!");
        } else if (homework > 5) {
            System.out.println("not good job!!");

        }
        System.out.println("------------------------");

        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("Test case executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test case executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test case executed on firefox browser");

        }
    }
}