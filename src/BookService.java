import java.util.ArrayList;
import java.util.List;

public class BookService {
    private Book[] books;
    private int bookCount;
    public BookService(){
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book){
        books[bookCount] = book;
        bookCount++;
    }

    public void updateBook(Book book,int id){
        boolean isBookFound = false;
        for(int i=0;i<bookCount;i++){
            if(books[i].getId()==id){
                book.setId(books[i].getId());
                book.setPage(books[i].getPage());
                books[i] = book;
                isBookFound = true;
                break;
            }
        }

        if(isBookFound){
            System.out.println("Kitap gucellenmistir...");
        }else {
            System.out.println("Kitap bulunamadi...");
        }

    }
    public Book[] getBooks(){
        return books;
    }

    // delete
    public void deleteBook(Book book,int id){
        boolean isBookFound = false;
        for(int i=0;i<bookCount;i++){
            if(books[i].getId()==id){
                //silinen indexi null olarak ayarladım. bundan sonraki tüm indexleri bir kaydırmam gerekirdi. Nasıl yapacağımı bilemedim
                books[i] = null;
                bookCount--;
                isBookFound = true;
                break;
            }
        }

        if(isBookFound){
            System.out.println("Kitap silinmiştir...");
        }else {
            System.out.println("Kitap bulunamadi...");
        }

    }



    // getBookById
    public Book getBookById(Book book, int id) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }


    // getBooksByAuthorName
    public Book[] getBooksByAuthorName(String authorName) {
        List<Book> authorBooks = new ArrayList<>();
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthorName().equals(authorName)) {
                authorBooks.add(books[i]);
            }
        }
        return authorBooks.toArray(new Book[0]);
    }

}
