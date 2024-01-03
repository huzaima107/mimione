import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        System.out.println("enter your quiz :");
        int quiz=marks.nextInt();

        System.out.println("enter your midterm :");
        int midterm=marks.nextInt();


        System.out.println("inter your final score :");
        int finalScore=marks.nextInt();

        int average = midterm+quiz+finalScore/3;

        if(average>=90){
            System.out.print("midterm is :  "+midterm+"  quiz is : "+quiz+"  final score is : "+finalScore+"  your grade is A");
        }else if(average >=70 || average<90){
            System.out.print("midtem is :  "+midterm+"  quiz is : "+quiz+"  final score is : "+finalScore+"  your grade is B");
        }else if(average >=50 || average <70){
            System.out.print("midterm is : "+midterm+"  quiz is : "+quiz+"  final score is : "+finalScore+"  your grade is C");
        }else{
            System.out.print("midterm is : "+midterm+"  quiz is : "+quiz+"  final score is : "+finalScore+"  your grade is F");
        }


    }
}
