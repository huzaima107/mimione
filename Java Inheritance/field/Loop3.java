import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner khamis = new Scanner(System.in);
        

        int jumla = 0;
        int hasara = 0;
        int hakuna = 0;

        while(true){
            System.out.print("enter your number: ");
            int  number = khamis.nextInt();

            if(number==1){
                break;
            }else{
                if(number>0){
                    jumla++;
                }else if(number<0){
                    hasara++;
                }else{
                    hakuna++;
                }
            }
        }
        System.out.println("faida ni : "+jumla);
        System.out.println("hasara ni :"+hasara);
        System.out.println("hakuna ni :"+ hakuna);
    }
}
