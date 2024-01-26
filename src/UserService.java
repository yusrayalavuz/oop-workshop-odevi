import java.util.List;

public class UserService {

    private final BookService bookService;

    private User[] users;
    private int userCount;

    public UserService(BookService bookService) {
        this.bookService = bookService;
        this.users = new User[100];
        this.userCount = 0;
    }

    public void addUser(User user) {
        users[userCount] = user;
        userCount++;
    }
//update
    public void updateUser(User user, int id) {
        boolean isUserFound = false;
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                user.setId(users[i].getId());
                user.setName(users[i].getName());
                users[i] = user;
                isUserFound = true;
                break;
            }
        }

        if (isUserFound) {
            System.out.println("Kullanıcı gucellenmistir...");
        } else {
            System.out.println("Kullanıcı bulunamadi...");
        }


        // Delete, Update, getUserBYTC, assignBookToUser methodlariniz yaziniz.
    }
//delete
    public void deleteUser(User user, int id) {
        boolean isUserFound = false;
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                //silinen indexi null olarak ayarladım. bundan sonraki tüm indexleri bir kaydırmam gerekirdi. Nasıl yapacağımı bilemedim
                users[i] = null;
                userCount--;
                isUserFound = true;
                break;
            }
        }

        if (isUserFound) {
            System.out.println("Kullanıcı silinmiştir...");
        } else {
            System.out.println("Kullanıcı bulunamadi...");
        }

    }
    //getUserBYTC
    public User getUserByTC(String tc) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getTc()==tc) {
                return users[i];
            }
        }
        return null; // Kullanıcı bulunamadıysa null döndür
    }
//assignBookToUser ?



}
