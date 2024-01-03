public class Number {
    public static void main(String[]args){

        int sum = 0;
        int number=0;
        for(number=100;number<=200;number++){
            sum = sum + number;
            if(number%9==0){
                System.out.println(number);
            }

        }System.out.println(sum);
    }
}
