public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        UserService userService = new UserService(bookService);


    }
}