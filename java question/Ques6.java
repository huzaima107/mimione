public class Ques6 {

  public static void main(String[] args) {
    int i = 1;

    // Print the header.
    System.out.println("1. 1 x 6 = 6");

    // Print the multiplication table.
    while (i <= 12) {
      System.out.println(i + ". " + i + " x 6 = " + (i * 6));
      i++;
    }
  }
}
