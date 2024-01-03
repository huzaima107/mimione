import java.util.Scanner;
public class Operation{
    public static void main(String[]args){
        Scanner op = new Scanner (System.in);

        System.out.print("Enter the value a: ");
        int a = op.nextInt();

        System.out.print("Enter the value b: ");
        int b = op.nextInt();

        System.out.println("The result of adding is "+ (a+b));
        System.out.println("The result of substracting is "+ (a-b));
        System.out.println("The result of mutliplying is "+ (a*b));
        System.out.println("The result of dividing is "+ (a/b));

}

}
