package Books;

import Books.Book;

public class Compilation extends Book {

    private int amountofPieces;

    public Compilation(String Title, String Author, int Year, int Pages, int amountofPieces) {
        super(Title, Author, Year, Pages);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Rouling", 1980, 7000);
        Book book2 = new Book("Kobsar", "Shevchenko", 1933, 4682);
        Compilation compilation1 = new Compilation("A Sound of Thunder.100", "BradBury", 1952, 15000, 99);

        book1.setAuthor("Rowling");
        book2.setTitle("Kobzar");
        compilation1.setAmountofPieces(100);

        System.out.println("This book is " + book1.getTitle() + "it author " + book1.getAuthor() + "it amout of Pages" + book1.getPages());
        System.out.println("This book is " + book2.getTitle() + "it author " + book2.getAuthor() + "it amout of Pages" + book2.getPages());
        System.out.println("This compilation is " + compilation1.getTitle() + "it author " + compilation1.getAuthor() + "it amout of Pages" + compilation1.getPages() + "it contain" + compilation1.getAmountofPieces() + "stories");

    }

    public int getAmountofPieces() {
        return amountofPieces;
    }

    public void setAmountofPieces(int amountofPieces) {
        this.amountofPieces = amountofPieces;
    }
}
