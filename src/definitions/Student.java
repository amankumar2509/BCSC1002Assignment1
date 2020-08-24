/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;

    private long univRollNo;
    private int issuedBookNumbers;
    private Book[] booksIssued;

    public long getUnivRollNo() {
        return univRollNo;
    }

    public void setUnivRollNo(long univRollNo) {
        this.univRollNo = univRollNo;
    }

    public int getIssuedBookNumbers() {
        return issuedBookNumbers;
    }

    public void setIssuedBookNumbers(int issuedBookNumbers) {
        this.issuedBookNumbers = issuedBookNumbers;
    }

    public Book[] getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }


}
