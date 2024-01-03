public class CheckAge {
    static void age( int ages){
        if (ages < 8){
            System.out.println("your are my young bro" + "and your age is :" + ages);
        }else{
            System.out.println("you are my brother" + "and your age is :" + ages );
        }
    }
    public static void main(String[] args) {
        age(7);
    }
}
