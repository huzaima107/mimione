public class Method{
    public int myAge( ){
        int age=50;
        return age;
    }
    public static void main(String[]args){
        Method obj= new Method();
        obj.myAge();
        System.out.println(obj.myAge());

    }
}