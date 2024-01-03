import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner bas = new Scanner(System.in);

        System.out.println("enter the number of tour");
        int tour=bas.nextInt();

        int revenue = tour*2500;

        System.out.println("the revenue generated is :"+revenue+"Tsh");
    }
}
