public class Kitty{
    String name;
    String owner;
    int age;

    public Kitty(String name,int age,String owner){
        this.name=name;
        this.owner=owner;
        age=34;
    }

    public int getAge(){
        return age;
    }

    public void haveBirthday(){
        age++;
    }

    public String toString(){
        return name +"is "+age+"belong to"+owner;
    }

    public static void main(String [] args){
        Kitty one =new Kitty("juma",34,"asha");


        System.out.println(one.toString());
    }
}