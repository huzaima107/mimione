import java.util.Scanner;
public class Budget {
    public static void main(String[]args){
         Scanner user= new Scanner(System.in);

         System.out.println("Enter your budget");
         int budget = user.nextInt();
         System.out.println("Enter your Expenses");
         int expenses = user.nextInt();
         int total = 0 ;


         while(expenses>0){
            total = total + expenses;
            expenses = user.nextInt();
            System.out.println(total);
         }
           if (budget>total){
                System.out.println("The Amount is under the budget");
            }else{
                System.out.println("The Amount is over the budget");
            }


         
    }
   
    
}
