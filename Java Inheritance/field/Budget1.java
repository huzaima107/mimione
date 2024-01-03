import java.util.Scanner;

public class Budget1 {
    public static void main(String[] args) {
        Scanner bad = new Scanner(System.in);
        System.out.print("enter your monthl budget");


        int budget = bad.nextInt();
        int expense = bad.nextInt();
        int total =0;

        while(expense>0){
            total=total+expense;

            System.out.println("enter your expence");
            expense =bad.nextInt();
        }if(budget>total){
            System.out.println("over budget" + total);
        }else{
            System.out.println("under the budget"+total);
        }
    }
}
