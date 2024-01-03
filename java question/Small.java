import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        Scanner larg = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int number;

        System.out.println("Enter a number");
        number=larg.nextInt();

        while(number!=0){
            if(number > largest){
                largest = number;
            }else if(number<small){
               small = number;
            }

            System.out.println("Enter a number ");
            number=larg.nextInt();
        }

        System.out.println("the lagest number is : "+largest);
        System.out.println("the smallest number is : "+small);
        

    }
}
