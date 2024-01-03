import java.util.Scanner;

public class Ques1{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize the variables.
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
    int number;

    // Prompt the user to enter numbers.
    System.out.print("Enter a number (0 to exit): ");
    number = scanner.nextInt();

    while (number != 0) {
      // Update the counters.
      if (number > 0) {
        positiveCount++;
      } else if (number < 0) {
        negativeCount++;
      } else {
        zeroCount++;
      }

      System.out.print("Enter a number (0 to exit): ");
      number = scanner.nextInt();
    }

    // Print the results.
    System.out.println("The number of positive numbers is " + positiveCount);
    System.out.println("The number of negative numbers is " + negativeCount);
    System.out.println("The number of zeros is " + zeroCount);
  }
}
