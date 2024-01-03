import java.util.*;

public class User{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the positive number :");
        int number=input.nextInt();
        int sum = 0;

        while(number>=0){
            sum =sum + number;
            System.out.println("enter the positive number :");
            number=input.nextInt();
           
        //      if(number<=0){
               
        //    }     
        
    }
    System.out.println(sum);

}
}