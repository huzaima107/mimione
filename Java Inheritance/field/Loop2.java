import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner juma = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        while(true){
            System.out.println("enter your number: ");
            int number = juma.nextInt();

            if(number==1){
                break;
            }else{
                if(number>0){
                    positive++;
                }else if(number<0){
                    negative++;
                }else{
                    zero++;
                }
            }
        }

        System.out.println("postive is :" + positive +"negative is :" +negative+"zero is :"+ zero);
    }
}
