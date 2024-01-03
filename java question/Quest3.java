import java.util.Scanner;

public class Quest3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize the variables.
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int number;

    // Prompt the user to enter numbers.
    System.out.print("Enter a number (0 to exit): ");
    number = scanner.nextInt();

    while (number != 0) {
      // Update the largest and smallest numbers if necessary.
      if (number > largest) {
        largest = number;
      } else if (number < smallest) {
        smallest = number;
      }

      System.out.print("Enter a number (0 to exit): ");
      number = scanner.nextInt();
    }

    // Print the largest and smallest numbers.
    System.out.println("The largest number is " + largest);
    System.out.println("The smallest number is " + smallest);
  }
}
