import java.util.Scanner;
public class Float{
    public static void main(String[]args){
        Scanner mm = new Scanner(System.in);

        System.out.print("Enter value a: ");
        float a = mm.nextFloat();

        System.out.println("The value of a before adding is "+ a);

        System.out.print("Enter value b: ");
        float b = mm.nextFloat();

        System.out.println("The value of a after adding is "+ (a+b));
    }
}