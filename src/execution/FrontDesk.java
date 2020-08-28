/*  Created by IntelliJ IDEA.
 *  User: Aman Kumar (dbc2201)
 *  Date: 26/08/20
 *  Time: 6:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUE_NEW_BOOK = 1;
    public static final int RETURN_BOOK = 2;
    public static final int ISSUED_BOOK = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println(".How may I help you today?");
            System.out.println("1.Issue a new book for me");
            System.out.println("2.Return previously issuesd book for me.");
            System.out.println("3.Show me all my isuue book");
            System.out.println("4.Exit");
            studentInput = scanner.nextInt();
            Library myBook = new Library();
            Student student = new Student();
            String bookName;

            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Student Detail");
                    student.studentDetails();
                    System.out.println("Enter the name of the book you want to issue");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.addBookName(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of book you want return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.returnPreviousBook(bookName);
                    break;
                case ISSUED_BOOK:
                    System.out.println("list of books that have been issued by you");
                    myBook.list();
                    break;
                case EXIT:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();


    }
}
