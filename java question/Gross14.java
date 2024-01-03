import java.util.Scanner;

public class Gross14 {
    public static void main(String[] args) {
        Scanner eg = new Scanner(System.in);

        System.out.println("how many no of egg you have ?");
        int egg=eg.nextInt();

        int gross = egg /144;

        int dozen = egg%144/12;

        int leftegg = egg % 12;

        System.out.println("your egg is " +gross+ "gross,"+dozen+"dozen, and "+leftegg+".");
    }
}
