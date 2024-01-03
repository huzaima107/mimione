public class Myclass{
private static int count = 0;
private int x;
public Myclass(int i){
x = i;
}
public void incrementCount(){
count++;
}
public void printX(){
System.out.println("Value of x is: " +x);
}
public static void printCount(){
System.out.println("Value of count is: " +count);
}
public static void main(String[]args){
Myclass myobject1 = new Myclass(5);
Myclass myobject2 = new Myclass(7);
  //myobject1.printX();
 //myobject1.incrementCount();
 //Myclass.incrementCount();
// myobject1.printCount();
  myobject2.printCount();
  myobject2.printX();
 //myobject1.setX(14);
  myobject1.incrementCount();
 myobject1.printX();
 myobject1.printCount();
 myobject2.printCount();
} }
