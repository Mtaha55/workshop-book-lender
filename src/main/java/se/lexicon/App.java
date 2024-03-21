package se.lexicon;
import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // Creating persons
        Person person1 = new Person("John", "Hans");
        Person person2 = new Person("Alice", "Smith");

        // Creating books
        Book book1 = new Book("Python Programming", "Guido van Rossum");
        Book book2 = new Book("Introduction to Algorithms", "Thomas H. Cormen");

        // Loaning books
        person1.loanBook(book1);
        person2.loanBook(book2);

        // Returning books
        person1.returnBook(book1);

        // Getting information
        System.out.println(person1.getPersonInformation());
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
    }
}

