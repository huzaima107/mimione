import java.util.Scanner;

public class Quest12 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 2; i <= 100; i += 2) {
      sum +=i;
    }
    System.out.println("The sum of all even numbers between 0 and 100 is " + sum);
  }
}
