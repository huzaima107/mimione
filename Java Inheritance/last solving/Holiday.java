public class Holiday{
    private String name;
    private int day;
    private String month;

    public Holiday(String name,int day ,String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public boolean inSameMonth(){
        if(month==name){
            return true;
        }else{
            return false;
        }
    }
    public double AvgDate(){
        
    }
}