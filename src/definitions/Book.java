/*  Created by IntelliJ IDEA.
 *  User: Aman Kumar ()
 *  Date: 23/08/20
 *  Time: 7:46 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return String.format("Book Name:%s,Author Name:%s,ISBN Number:%s", getBookName(), getAuthorName(), getIsbnNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(isbnNumber, book.isbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, isbnNumber);
    }
}
