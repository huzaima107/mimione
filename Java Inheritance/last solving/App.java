import java.util.*;
public class App{
    public static void main(String [] args){
        Scanner last = new Scanner(System.in);

        System.out.println("enter 1st num");
        int num1=last.nextInt();

        System.out.println("enter 2st num");
        int num2=last.nextInt();

        System.out.println("enter 3st num");
        int num3=last.nextInt();

        if(num1 > num2 ){
            System.out.println("num one is greater");
        }else if (num2 > num3){
            System.out.println("num 2 is greater ");
        }else{
            System.out.println("num 3 is greater");
        }
    }
}