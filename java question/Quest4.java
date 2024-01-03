public class Quest4 {

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    int number = 10;

    // Test the isEven method.
    System.out.println(isEven(number)); // true

    number = 11;

    System.out.println(isEven(number)); // false
  }
}
