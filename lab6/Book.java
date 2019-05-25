package Books;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookYear;
    private int bookPages;

    public Book(String title, String author, int year, int pages) {
        bookTitle = title;
        bookAuthor = author;
        bookYear = year;
        bookPages = pages;

    }

    public Book(int BookYears, String BookTitle, String BookAuthor, int Pages) {
    }

    public int getYear() {
        return bookYear;
    }

    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return bookAuthor;
    }

    public int getPages() {
        return bookPages;
    }

    public void setYear(int year) {
        bookYear = year;
    }

    public void setTitle(String title) {
        bookTitle = title;

    }

    public void setAuthor(String author) {
        bookAuthor = author;

    }

    public void setPages(int pages) {
        bookPages = pages;

    }
}
