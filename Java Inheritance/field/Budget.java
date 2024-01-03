import java.util.*;

public class Budget{
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Enter your month budget : ");

        
        int budget =money.nextInt();
        int expense = money.nextInt();
        int total = 0;

        while(expense>0){
            total = total + expense;
            expense = money.nextInt();
        }
        if(budget>total){
            System.out.println("The amount is under the budget "+total);
        }else{
            System.out.println("The amount is over the budget "+total);
        }

        

        // while(budget>=0){
        //     amount=budget/amount;

        //     System.out.println("Enter your month expences");
        //     int expences=money.nextInt();
        // }
        // //System.out.println(amount);
    }
}