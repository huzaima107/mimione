import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        int positive =0 ;
        int negative = 0;
        int zero = 0 ;
        while(true){
            System.out.print("please enter your number: ");
            int number = ask.nextInt();

            if(number == 1){
                break;
            }else{
                if(number >0){
                    positive++;
                }else if(number<0){
                    negative++;
                }else{
                    zero++;
                }
            }
        }
        System.out.println("{Positive}" +positive);
        System.out.println("Negative is :" +negative);
        System.out.println("Zero is : "+ zero);
    }
}
