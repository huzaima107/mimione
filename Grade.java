import java.util.Scanner;
public class Grade{
    public static void main(String[]args){
        Scanner uu = new Scanner (System.in);

        System.out.print("Quiz score: ");
        int a = uu.nextInt();
        System.out.print("Mid-term score: ");
        int b = uu.nextInt();
        System.out.print("Final score: ");
        int f = uu.nextInt();

         int Average_score= (a + b + f)/3;

         if(Average_score >= 90){
            System.out.println("Your grade is A");
         }else if( Average_score >=70 && Average_score<90){
            System.out.println("Your grade is B");
         }else if(Average_score >=50 && Average_score<70){
            System.out.println("Your grade is C");
         }else{
            System.out.println("Your grade is F");
         }


    }
}