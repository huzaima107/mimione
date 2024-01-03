public class Kabisa {

    // instance method

    // Non return type method

    public void asha(){
        System.out.println("Asha anapenda kuchungulia");
    }
    
    public String message(){

        return "Mwanayamu kachoka";
    }
    
    public int myArea(){
        int le = 5;
        int wi = 2;
        return le * wi;
    }
    public static void main(String[] args) {

        // calling instance method 
            // 1 Create object
        
        Kabisa leo = new Kabisa();

        // leo.asha();

        
        System.out.println(leo.message());
        //System.out.println(leo.myArea());


        
    }
}
