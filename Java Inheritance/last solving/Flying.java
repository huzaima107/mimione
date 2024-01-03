public interface Flying {
    void fly();
}

abstract Animal{
    void move(){
        System.out.println("the animal is move forward");
    }
    void speak(){
        System.out.println("the animal speak");
    }
}
class Goose extends Animal implement Flying{
    @Override
    public void speak(){
        System.out.println(" the goose speaks");
    }

    @Override
    public void fly(){
        System.out.println("the goose flies");
    }
}
class Lynx extends Animal{
    @Override
    void speak(){
        System.out.println("the lynx speak");
    }

    void move (){
        System.out.println("the lynx move");
    }
    void fly(){
        System.out.println("the Lysnx fly");
    }
}
class Aeroplane implement Flying{
    void fly(){
        System.out.println("the Aerop fly")
    }
}

public class Main {
    public static void main (String[] args){
        Goose goose = new Goose();
        Lynx lynx = new Lynx();
        Aeroplane Aerop = new Aeroplane();


        goose.Flying();
    }
}