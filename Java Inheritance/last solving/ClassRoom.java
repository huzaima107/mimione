public class ClassRoom extends Room{
    private int numStudent;


    public ClassRoom(int firstInt , double largeDouble , double smallDouble,int secondInt){
        super(largeDouble,smallDouble,secondInt);
        numStudent=firstInt;

    }

    @Override
    public String toString(){
        return "capacity"+"="+numStudent;
    }
}