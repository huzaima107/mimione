import java.util.Scanner;

public class Gross {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many eggs do you have? ");
    int eggs = scanner.nextInt();

    // Calculate the number of gross.
    int gross = eggs / 144;

    // Calculate the number of dozens.
    int dozens = eggs % 144 / 12;

    // Calculate the number of leftover eggs.
    int leftoverEggs = eggs % 12;

    // Print the results.
    System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + leftoverEggs + ".");
  }
}
