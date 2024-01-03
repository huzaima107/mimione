
import java.util.*;

public class Las{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number :");
      int  a =input.nextInt();
     int   b = 1;

        while(b <= 12){
            System.out.println(a +" x "+ b +" = "+ a * b);
            b++;
        }
    }
}