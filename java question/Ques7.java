import java.util.Scanner;

public class Ques7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize the variables.
    int sum = 0;
    int number;

    // Prompt the user to enter a series of positive numbers.
    System.out.print("Enter a series of positive numbers. Enter a negative number to signal the end of the series: ");
    while (true) {
      number = scanner.nextInt();

      // If the number is negative, break out of the loop.
      if (number < 0) {
        break;
      }

      // Add the number to the sum.
      sum += number;
    }

    // Print the sum of the positive numbers.
    System.out.println("The sum of the positive numbers is " + sum);
  }
}
