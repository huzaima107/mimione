public class Box extends Pill {
    public void method2(){
        System.out.println("Box 2");
    }

    public void method3(){
        method2();
        System.out.println("Box 3");
    }
}
