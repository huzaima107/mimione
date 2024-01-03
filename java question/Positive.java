import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner pos = new Scanner(System.in);

        int sum = 0 ;
        int number ;

        System.out.print("Enter positive number");
        while(true){
            number = pos.nextInt();

            if(number<0){
                break;
            }

            sum += number;
        }

        System.out.println("sum is "+sum);
    }
}
