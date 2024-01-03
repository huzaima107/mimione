import java.util.Scanner;

public class Ques15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of gallons of gas in the tank: ");
    double gallons = scanner.nextDouble();

    System.out.print("Enter the number of miles per gallon: ");
    double mpg = scanner.nextDouble();

    System.out.print("Enter the price of gas per gallon: ");
    double pricePerGallon = scanner.nextDouble();

    // Calculate the distance that the car can travel.
    double distance = gallons * mpg;

    // Calculate the cost of traveling 250 miles.
    double cost = 250 / mpg * pricePerGallon;

    // Print the results.
    System.out.println("The car can travel " + distance + " miles with the gas.");
    System.out.println("The cost of traveling 250 miles is $" + cost + ".");
  }
}
