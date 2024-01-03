public class Book{
    String name;
    String year;
    String publisher;
    Author author;

    public Book(String name,String year,String publisher,Author author){
        this.name=name;
        this.year=year;
        this.publisher=publisher;
        this.author=author;
    }
    public void bookInfo(){
        System.out.println("Book info is "+ "name of book: "+name+"year:"+year+"publisher: "+ "Author: "+author.name);
        
    }

}