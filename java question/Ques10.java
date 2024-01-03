import java.util.Scanner;

public class Ques10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the quiz score: ");
    int quizScore = scanner.nextInt();

    System.out.print("Enter the mid-term score: ");
    int midtermScore = scanner.nextInt();

    System.out.print("Enter the final score: ");
    int finalScore = scanner.nextInt();

    // Calculate the average score.
    double averageScore = (quizScore + midtermScore + finalScore) / 3;

    // Determine the grade.
    String grade;
    if (averageScore >= 90) {
      grade = "A";
    } else if (averageScore >= 70) {
      grade = "B";
    } else if (averageScore >= 50) {
      grade = "C";
    } else {
      grade = "F";
    }

    // Print the grade.
    System.out.println("Your grade is " + grade);
  }
}
