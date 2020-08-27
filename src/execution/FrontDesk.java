/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_BOOK = 2;
    public static final int ISSUED_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help ypu today?");
        System.out.println("Issue a new book for me");
        System.out.println("Return previously issuesd book for me.");
        System.out.println("Show me all my isuue book");
        System.out.println("Exit");
        studentInput = scanner.nextInt();
        Library myBook = new Library();
        String bookName;
        do {
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Enter the name of the book you want to issue");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.AddBookName(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of book you want return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.returnPreviousBook(bookName);
                    break;
                case ISSUED_BOOK:
                    System.out.println("list of books that have been issued");
                    myBook.myIssueBook(myBook);
            }
        }


    }
}
