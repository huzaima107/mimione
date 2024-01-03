import java.util.Scanner;

public class Gallon {
    public static void main(String[] args) {
        Scanner kham = new Scanner(System.in);

        System.out.print("Enter no of gallon");
        int gallon = kham.nextInt();

        System.out.print("Enter number of miles");
        int miles=kham.nextInt();

        System.out.print("Enter price of gas");
        int gas=kham.nextInt();

        int distance = gallon * miles;

        int cost = 250 / miles * gas;

        System.out.println("Car travel " + distance + "with the gas");
        System.out.println("the cost of 250 miles is " + cost );
    }
}
