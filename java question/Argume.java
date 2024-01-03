public class Argume {
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        int num = 10;

        System.out.println(isEven(num));

        num=11;
        System.out.println(isEven(num));
    }
}
