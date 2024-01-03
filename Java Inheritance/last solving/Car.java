public abstract class Car {
    int year;
    double price;


    public Car(int year , double price){
        this.price = price;
        this.year = year;
    }

    public abstract double calculateSaleprice(){
        
    }
}
public class ClassicCar extends Car{
    
    public ClassicCar(double price,int year,int weight){
        super(price,year);
        
    }
    public double calculateSaleprice(){
        return price = 10000;
    }
}

class SportCar extends Car{
    public SportCar(int year,double price){
        super(year,price);
    }

    public double calculateSaleprice(){
        if(year > 2000){
            return price = 0.75 * 10000;
        }else if (year > 1995){
            return price = 0.5 * 10000;
        }else{
            return price = 0.5 * 10000;
        }
    }
}

public class CarExibition{
    public double CarExibition(){


        String [] car={"ClassicCar,"}


    }
    public double getPrice() {
        return car = 0.0;
    }
}