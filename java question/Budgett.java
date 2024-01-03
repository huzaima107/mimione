import java.util.Scanner;

public class Budgett {
    public static void main(String[] args) {
        Scanner bud=new Scanner(System.in);

        System.out.print("Enter your budget : ");
        int budget=bud.nextInt();

        int total = 0;

        System.out.print("Enter your expences: ");
        while(true){
            int expences=bud.nextInt();

            if (expences ==0){
                break;
            }

            total += expences;
        }
        int difference = total-budget;

        if(difference>0){
            System.out.println("over budget by : "+ difference);
        }else if(difference< 0){
            System.out.println("Under budget" +(-difference));
        }else{
            System.out.println("you are on budget.");
        }
    }
}
