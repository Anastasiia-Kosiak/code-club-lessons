package lesson.project;

// impl - implementation
// GameMangerImpl
// MovieManagerImpl
// implements - реалізує, виконує
//    override - перевизначити

//
import java.util.ArrayList;
import java.util.Collections;
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
        // ladybugs.add(ladybug);
    }

    @Override
    public void deleteBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
                // -> лямбда-функція
                // видалити, якщо title співпадає із переданим параметром
        //функція
    }

    @Override
    public void readBook(String title) {
        System.out.println("I'm reading a book " + title);
        // I am playing a game + title
        // I am watching a movie + title
    }

    @Override
    public void showAll() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }

    }

    @Override
    public void searchByGenre(String genre) {
        for (int i = 0; i < books.size(); i++) {
            // equals - дорівнює
            if (books.get(i).getGenre().equals(genre)) {
                books.get(i).displayBookInfo();
            }
        }
    }

    @Override
    public void sortByTitle() {
        Collections.sort(books, (t1, t2) -> t1.getTitle().compareTo(t2.getTitle()));
        for(Book book : books) {
            System.out.println(book.getTitle());
        }
    }

}
