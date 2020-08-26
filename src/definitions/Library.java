/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    /**
     * This method helps us to issue new book
     *
     * @param name The name of the book you want to issue
     */

    public void AddBookName(String name) {
        System.out.println("The book" + name + " has been issued to you");
    }

    /**
     * This method returns the previously issued book
     *
     * @param name The name of book you want to returned
     */
    public void returnPreviousBook(String name) {
        System.out.println("Your book has been return");
    }


}
