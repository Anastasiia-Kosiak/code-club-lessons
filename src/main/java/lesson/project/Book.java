package lesson.project;

// клас Book
public class Book {
    // поля класу Book: title, author, year та genre
    private String title;

    private String author;

    private int year;

    private String genre;

    // головна ціль конструктора - ініціалізація об'єкта
    public Book() { // дефолтний конструктор без параметрів

    }

    // конструктор із параметрами
    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    // гетер для поля title
    public String getTitle() {
        return title;
    }

    // сетер для поля title
    public void setTitle(String title) {
        this.title = title;
    }

    // гетер для поля author
    public String getAuthor() {
        return author;
    }

    // сетер для поля author
    public void setAuthor(String author) {
        this.author = author;
    }

    // гетер для поля year
    public int getYear() {
        return year;
    }

    // сетер для поля year
    public void setYear(int year) {
        this.year = year;
    }

    // гетер для поля genre
    public String getGenre() {
        return genre;
    }

    // сетер для поля genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // метод displayBookInfo для виводу інформацію про книгу на екран
    public void displayBookInfo() {
        System.out.println(this.title + " was published in " + this.year + " by " + this.author);
    }
}
