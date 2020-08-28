/*  Created by IntelliJ IDEA.
 *  User: Aman Kumar (amankumar 2509)
 *  Date: 25/08/20
 *  Time: 6:30 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] bookIssued;

    public Book[] getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Library(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    public Library() {
        this.bookIssued = new Book[5];
        for (int i = 0; i < bookIssued.length; i++) {
            bookIssued[i] = new Book("Book " + (i + 1));

        }
    }

    @Override
    public String toString() {
        return "Library{" + "bookIssued=" + Arrays.toString(bookIssued) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Library library = (Library) o;
        return Arrays.equals(bookIssued, library.bookIssued);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bookIssued);
    }

    /**
     * This method helps us to issue new book
     *
     * @param name The name of the book you want to issue
     */

    public void addBookName(String name) {
        System.out.println("The book" + " " + name + " has been issued to you");
    }

    /**
     * This method returns the previously issued book
     *
     * @param name The name of book you want to returned
     */
    public void returnPreviousBook(String name) {
        System.out.println("Your book :" + " " + name + " has been return");
    }

    public void list() {
        for (Book book : bookIssued) {
            System.out.println(book);

        }
    }


}
