public class Book{
    String bname;
    String Author;
    int ISBN;
    String publisher;


    public Book(String bname , String Author , int ISBN , String publisher ){
        this.bname=bname;
        this.Author=Author;
        this.ISBN=ISBN;
        this.publisher=publisher;
    }

    public void getBookinf(){
        System.out.println("your book information is : "+"book name is : "+bname+"Author is : "+Author+"isbn is : "+ISBN+ " And publisher is : "+publisher);

    }
    public void setbname(String bname){
        this.bname=bname;
    }
    public String getbname(){
        return bname;
    }
    public void setAuthor(String Author){
        this.Author=Author;
    }
    public String getAuthor(){
        return Author;
    }
    public void setISBN(int ISBN){
        this.ISBN=ISBN;
    }
    public int getISBN(){
        return ISBN;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher; 
    }
    public String getpublisher(){
        return publisher;
    }

    public static void main(String[] args) {
        Book one = new Book("physics", "juma", 0454, "suza");


        one.getBookinf();
    }
}