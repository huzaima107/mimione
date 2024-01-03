public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;

    public Invoice(String pn,String pd,int q,double pr){
        partNumber=pn;
        partDescription=pd;
        quantity=q;
        price =pr ;

    }
    public void setpartNumber(String pN){
        partNumber=pN;
    }
    public String getpartNumber(){
        return partNumber;
    }
    public void setpartDescription(String pD){
        partDescription=pD;
    }
    public String getpartDescription(){
        return partDescription;
    }
    public void setquantity(int q){
        quantity = q;
    }
    public int getquantity(){
        return quantity;
    }
    public void setprice(double pr){
        price = pr;
    }
    public double getprice(){
        return price;
    }
    public double getInvoiceAmount(){
        return quantity * price;

    }

    public static void main(String[]args){

    }
}
