public class Students{
    String name;
    String email;
    String address;
    int age;
   
    public Students(String name,String email,String address,int age){
        this.name=name;
        this.email=email;
        this.address=address;
        this.age=age;
    }

    public void viewInfo(){
        System.out.println("your name is "+name  +"email is: "+ email+ "address:  "+ address  +"and yuor age is "+ age );
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public static void main (String[]args){
        Students stu1=new Students("Safia","safia@gmail.com","Fuoni",23);
        Students stu2=new Students("Abuu","abuu@gmail.com","Tunguu",24);
        stu1.viewInfo();
        stu2.viewInfo();
        stu1.setAddress("maungani");

        

        
    }
}