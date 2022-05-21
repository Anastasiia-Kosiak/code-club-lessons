package lesson.project;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Book book = new Book(); // створення об'єкта класа Book

        book.setAuthor("Neil Gaiman"); // встановлюємо автора для об'єкту book
        book.setTitle("American Gods"); // встановлюємо назву для об'єкту book
        book.setGenre("Novel"); // встановлюємо жанр для об'єкту genre
        book.setYear(2001); // встановлюємо рік для об'єкту year

//        book.displayBookInfo(); // виклик методу displayBookInfo() для об'єкту book

        // створення об'єкту book2 класу Book із використанням конструктору із параметрами
        Book book2 = new Book("Orlando", "Virginia Woolf", "Novel", 1928);

//        book2.displayBookInfo(); // виклик методу displayBookInfo() для об'єкту book2
        Book book3 = new Book("Persepolis", "Virginia", "Comics", 2017);
        Book book4 = new Book("Joker", "Woolf", "Comics", 2022);

        // GameManagerImpl gameManager = new GameManagerImpl();
        // MovieManagerIMpl movieManager = new MovieManagerImpl();
        BookManagerImpl bookManager = new BookManagerImpl();
        bookManager.addBook(book);
        bookManager.addBook(book2);
        bookManager.addBook(book3);
        bookManager.addBook(book4);
        // gameManager.showAll()
        // movieManager.showAll()
      //  bookManager.showAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter genre: ");
        String genre = sc.nextLine();
        bookManager.searchByGenre(genre);
    }
}
