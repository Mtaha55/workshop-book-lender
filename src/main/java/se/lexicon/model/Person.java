package se.lexicon.model;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int sequencer = 1;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> booksOnLoan;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.booksOnLoan = new ArrayList<>();
    }

    private static int getNextId() {
        return sequencer++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void loanBook(Book book) {
        booksOnLoan.add(book);
        book.setBorrower(this);
    }

    public void returnBook(Book book) {
        booksOnLoan.remove(book);
        book.setBorrower(null);
    }

    public String getPersonInformation() {
        return "Person ID: " + id + ", Name: " + firstName + " " + lastName;
    }
}