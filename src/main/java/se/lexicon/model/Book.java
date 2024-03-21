package se.lexicon.model;

public class Book {
    private static int sequencer = 0;
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = "B" + getNextId();
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrower = null;
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        String status = available ? "Available" : "On loan";
        String borrowerInfo = borrower != null ? ", Borrower: " + borrower.getFirstName() + " " + borrower.getLastName() : "";
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Status: " + status + borrowerInfo;
    }
}
