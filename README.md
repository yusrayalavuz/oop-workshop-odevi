# Proje README Dosyası

Bu proje, kitap ve kullanıcı verilerini yöneten basit bir kütüphane sistemi uygulamasını içerir. Projede bulunan sınıflar `Book` ve `User` olarak adlandırılmıştır ve her biri ilgili nesnelerin özelliklerini içermektedir. Ayrıca, bu nesnelerle ilgili işlemleri gerçekleştiren `BookService` ve `UserService` sınıfları da bulunmaktadır.

## Book Sınıfı

```java
public class Book {
    private int id;
    private String name;
    private String authorName;
    private int page;

    // Metotlar...
}
```

**BookService Sınıfı**
```java
public class BookService {
    private Book[] books;
    private int bookCount;

    public BookService(){
        //...
    }

    // Metotlar...
}

```
Metotlar:
- addBook(Book book): Yeni bir kitap ekler.
- updateBook(Book book, int id): Var olan bir kitabı günceller.
- getBooks(): Tüm kitapları döndürür.
- deleteBook(int id): Kitabı siler.
- getBookById(int id): ID'ye göre kitabı getirir.
- getBooksByAuthorName(String authorName): Yazar adına göre kitapları getirir.

**User Sınıfı**
```java
public class User {
    private int id;
    private String tc;
    private String name;
    private String lastName;

    // Metotlar...
}
```

**UserService Sınıfı**
```java
import java.util.List;

public class UserService {
    private final BookService bookService;
    private User[] users;
    private int userCount;

    public UserService(BookService bookService){
        //...
    }

    // Metotlar...
}
```

Metotlar:
- addUser(User user): Yeni bir kullanıcı ekler.
- updateUser(User user, int id): Var olan bir kullanıcıyı günceller.
- deleteUser(int id): Kullanıcıyı siler.
- getUserByTC(String tc): TC kimlik numarasına göre kullanıcıyı getirir.
- assignBookToUser(int userId, int bookId): Kitabı kullanıcıya atar.
