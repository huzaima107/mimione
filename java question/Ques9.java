import java.util.Scanner;

public class Ques9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the budget amount.
    System.out.print("Enter your budget amount: ");
    double budgetAmount = scanner.nextDouble();

    // Initialize the running total.
    double runningTotal = 0;

    // Prompt the user to enter their expenses.
    System.out.print("Enter your expenses: ");
    while (true) {
      double expense = scanner.nextDouble();

      // If the expense is 0, break out of the loop.
      if (expense == 0) {
        break;
      }

      // Add the expense to the running total.
      runningTotal += expense;
    }

    // Calculate the amount that the user is over or under budget.
    double difference = runningTotal - budgetAmount;

    // Print the result.
    if (difference > 0) {
      System.out.println("You are over budget by $" + difference);
    } else if (difference < 0) {
      System.out.println("You are under budget by $" + (-difference));
    } else {
      System.out.println("You are on budget.");
    }
  }
}
