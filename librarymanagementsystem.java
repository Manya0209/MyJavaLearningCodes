import java.util.ArrayList;

class book{
    public String name, author;
}
class MyLibrary{
    public ArrayList<book> books;
    public MyLibrary(ArrayList<book> books){
        this.books= book;
    }
    public void addbook(book book){
        System.out.println("book has been added to library");
        this.books.add(book);
    }
    public void issuedbook(book b){
        System.out.println("book has been issued");
        this.books.remove(b);
    }
    public void returnbook(book b){
        System.out.println("book has been returned");
        this.books.add(b);
    }
}


public class librarymanagementsystem {
    public static void main(String[] args) {
        ArrayList<book> bk= new ArrayList<>();
        bk.add(new book("m", "n"));        
        bk.add(new book("p", "q"));
        MyLibrary l= new MyLibrary(bk);
        l.addbook(new book("r", "t"));
        System.out.println(l.books);
    }
}
