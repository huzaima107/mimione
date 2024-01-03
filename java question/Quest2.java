import java.util.Scanner;

public class Quest2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize the variables.
    int number;
    int count = 0;
    int sum = 0;

    // Find all integers between 100 and 200 which are divisible by 9.
    for (number = 100; number <= 200; number++) {
      if (number % 9 == 0) {
        count++;
        sum += number;
      }
    }

    // Print the results.
    System.out.println("The number of integers divisible by 9 is " + count);
    System.out.println("The sum of the integers divisible by 9 is " + sum);
  }
}
