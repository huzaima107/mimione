import java.util.Scanner;


public class Grade{
    public static void main(String [] args){
        Scanner meth = new Scanner(System.in);
        int grade;
        int totalgrade=0;
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        System.out.println("Enter grade between 0 - 100");

        while(true){
            grade =meth.nextInt();
            if(grade == -1){
                break;
            }
            if(grade >=0 && grade <=100){
                

                grade++;

                if(grade >=90 && grade <=100){
                    A++;
                }else if(grade >=80 && grade <=89){
                    B++;
                }else if(grade >=70 && grade <= 79 ){
                    C++;
                }else if(grade >=60 && grade <=69 ){
                    D++;
                }else if(grade >=0 && grade <=59){
                    F++;
                }
            }else{
                System.out.println("invalid input please enter correct number");
            }
        }

        System.out.println("Grade A is : " + A);
        System.out.println("Grade B is : " + B);
        System.out.println("Grade C is : " + C);
        System.out.println("Grade D is : " + D);
        System.out.println("Grade F is : " + F);
        System.out.println("The total Grade  is : " + totalgrade);
    }
}