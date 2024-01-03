import java.util.Scanner;

public class Positive {
    public static void main (String[]args){

          Scanner obj =new Scanner(System.in);
          System.out.println("Please Enter intiger number:");

          int x = obj.nextInt();
          int y=1;
    
     
          while(y<=12){

        
              x=obj.nextInt();

              System.out.print(x + "x" +y+"="+x*y);
              y= y +1;
        

     }
 
    }
    
    

    
    
}
