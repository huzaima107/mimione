import java.time.Year;
import java.util.Scanner;
public class Loop {
    public static void main(String[]args){

        Scanner ask = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        while(true){
            System.out.print("Please enter number: ");
            int number = ask.nextInt();

            if(number == 1){
                break;
            }else{
                if(number > 0){
                    positive++;
                }else if(number < 0){
                    negative++;
                }else{
                    zero++;
                }
            }

        }

            System.out.println("{Positive} "+positive);
            System.out.println("Negative "+negative);
            System.out.println("Zero "+zero);
        
        
        // for(int x = 1; x<=10; x++){
        //     if(x==2 || x==3){
        //         continue;
        //     }
        //     System.out.println(x);
   

            // if(x%2==0){
            //     System.out.println(x);
            // }
        // }

    
    }
}
