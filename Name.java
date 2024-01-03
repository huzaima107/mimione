import java.util.Scanner;
public class Name{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = obj.nextLine();

        System.out.println("Enter your age: ");
        String age = obj.nextLine();

        System.out.println("Welcome "+name + "you "+ "are " +age+ "years " + "old");


    }
}