package lesson.project;

// impl - implementation
// GameMangerImpl
// MovieManagerImpl
// implements - реалізує, виконує
//    override - перевизначити

//
import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements BookManager {
    private List<Book> books; // список книг
    // колекції - динамічні структури даних

    public BookManagerImpl() { // конструктор
        books = new ArrayList<>(); // створили список
    }

    // @ - анотація
    @Override
    public void addBook(Book book) {
        books.add(book);
        // games.add(newGame);
        //ladybugs.add(ladybug);
    }

    @Override
    public void deleteBook(String title) {

    }

    @Override
    public void readBook(String title) {

    }

    @Override
    public void showAll() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }
    }




}
