import java.util.*;
public class Cal{
    public static void main(String [] args){
        Scanner ha = new Scanner(System.in);
        System.out.println("enter number");
        int a =ha.nextInt();
        int b =1;

        while(b<=100){
            System.out.println(a+"x"+b+" = "+a*b);
            b++;
        }
    }
}