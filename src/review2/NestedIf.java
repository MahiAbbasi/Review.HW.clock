package review2;

public class NestedIf {
    public static void main(String[] args) {

        /*nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another

         */
        boolean vaccine=true;
        int dose=2;
        if(vaccine){
            System.out.println("how many doses you have?");

            if (dose==1) {
                System.out.println("you are fully vaccinated");
            }else{
                System.out.println("you are fully vaccinated");


            }

        }
    }
}
