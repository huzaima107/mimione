public class Room{
    private double width ;
    private double length;
    private int floor;

    public Room(){
        width=10;
        length=12.5;
        floor=1;

    }

    public void setfloor(int floor ){
        this.floor=floor;
    }
    public int getfloor(){
        return floor;
    }

    public void setwidth(double width){
        if(width < 0){
           
        }else{
            this.width=width;
        }
    }
    public double getwidth(){
        return width;
    }

    public void setlength(int length){
        if(length < 0){

        }else{
            this.length=length;
        }
    }

    public Room(double smallDouble, double largeDouble, int floor){
        width=smallDouble;
        length=largeDouble;
        this.floor=floor;
    }

    
    @Override
    public String toString(){
        return length * width  +"on floor"+floor;
    }

    public static void main(String [] args){
        Room zuchu = new Room();

       System.out.println(zuchu.toString());
      
    }
    
}



