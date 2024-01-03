public class Employee{
    int id;
    int salary;
    String name;
    Address address;

    public void setid(int id){
        this.id=id;
    }

    public int getid(){
        return id;
    }

    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return salary;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public Address getaddress(){
        return address;
    }

    void Tokenizing(){
        
    }
}

public class Address {
    String streetname;
    String housenumber;
    String city;
}