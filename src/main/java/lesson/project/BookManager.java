package lesson.project;
//GameManager
public interface BookManager { // інтерфейс - всі методи є public
    public void addBook(Book newBook); // додавати книгу
    void deleteBook(String title); // видаляти книгу зі списку за назвою
    void readBook(String title); // читати книгу
    // playGame(String title)
    // watchMovie(String title)
    // useWeapon(String name)

    void showAll(); // показати всі книги
}
