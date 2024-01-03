public class Computer{
    private int wordsize;
    private int memorysize;
    private int storagesize;
    private int speed;



    public Computer(){
        wordsize=0;
        memorysize=0;
        storagesize=0;
        speed=0;
   
    }
    
public Computer(int wordsize,int memorysize,int storagesize,int speed){
    this.wordsize=wordsize;
    this.memorysize=memorysize;
    this.storagesize=storagesize;
    this.speed=speed;
    }


    public void display(){
        System.out.println("wordsize"+wordsize+"bite");
        System.out.println("memorysize"+memorysize+"megabyte");
        System.out.println("Storage size"+storagesize+"megabyte");
        System.out.println("Speed"+speed+"megahertz");
    }
}
public class Laptop extends Computer{
    int length;
    int width;
    int height;
    int weight;

    public Laptop(){
        length=0;
        width=0;
        height=0;
        weight=0;
    }

    public Laptop(int length, int width,int height , int weight ,int wordsize,int memorysize,int storagesize,int speed){
super(wordsize,memorysize,storagesize,speed);

        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
    }

    public display(){
        System.out.println("lenth is "+length+ "width"+width+"height"+height+"weight is "+weight);
    }


}
