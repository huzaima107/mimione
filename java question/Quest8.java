import java.util.Scanner;

public class Quest8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize the variables.
    int counter = 0;
    int number;
    int largest = Integer.MIN_VALUE;

    // Prompt the user to enter 10 integers.
    while (counter < 10) {
      System.out.print("Enter an integer: ");
      number = scanner.nextInt();

      // Update the largest integer if necessary.
      if (number > largest) {
        largest = number;
      }

      counter++;
    }

    // Print the largest integer.
    System.out.println("The largest integer is " + largest);
  }
}
