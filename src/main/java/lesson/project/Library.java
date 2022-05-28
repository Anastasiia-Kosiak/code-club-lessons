package lesson.project;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Book book = getBook("American Gods", "Neil Gaiman", "Novel", 2001);

//        book.displayBookInfo(); // виклик методу displayBookInfo() для об'єкту book

        // створення об'єкту book2 класу Book із використанням конструктору із параметрами
        Book book2 = getBook("Orlando", "Virginia Woolf", "Novel", 1928);

//        book2.displayBookInfo(); // виклик методу displayBookInfo() для об'єкту book2
        Book book3 = getBook("Persopolis", "Virginia", "Comics", 2017);

        Book book4 = getBook("Joker", "Woolf", "Comic", 2022);

        // GameManagerImpl gameManager = new GameManagerImpl();
        // MovieManagerIMpl movieManager = new MovieManagerImpl();
        BookManagerImpl bookManager = new BookManagerImpl();
        bookManager.addBook(book);
        bookManager.addBook(book2);
        bookManager.addBook(book3);
        bookManager.addBook(book4);
//         gameManager.showAll()
//         movieManager.showAll()
//        bookManager.showAll();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number (fot 1 to 9): ");
//        int num = sc.nextInt();
//        if (num == 1) {
//            book.displayBookInfo();
//        }
//        sc.nextLine();
//        System.out.println("Genres: role game,sandbox");
//        System.out.println("Enter genre: ");
//        String genre = sc.nextLine();
//
//        bookManager.searchByGenre(genre);
        bookManager.sortByTitle();

    }

    public static Book getBook(String title, String author, String genre, int year) {
        return new Book(title, author, genre, year);
    }

}

//        String tableName = "table"; // SQL injection
//        Query = "select * from 1 sort by 2"; //
//        query.setParameter("table");
//        query.setParameter("name");
//
// query - запит
//        SELECT * FROM run_summary
//        WHERE run_status = 'Timeout';
//        -- запит - query
//                -- join - об'єднання
//
//                -- SQL - Sequence Query Language
