import java.util.Scanner;
public class Multi {
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = obj.nextInt();
        int b = 1;

        while(b<=12){
            System.out.println(a+"x" + b + "="+ a*b);
            b= b + 1;

        }

    }
    
}
