/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long univRollNo;
    private int issuedBookNumbers;
    private Book[] booksIssued;

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

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

    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long univRollNo, int issuedBookNumbers) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.univRollNo = univRollNo;
        this.issuedBookNumbers = issuedBookNumbers;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Student(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    public Book[] getBooksIssued() {
        return booksIssued.clone();
    }

    @Override
    public String toString() {
        return "Student{" + "studentFirstName='" + studentFirstName + '\'' + ", studentMiddleName='" + studentMiddleName + '\'' + ", studentLastName='" + studentLastName + '\'' + ", univRollNo=" + univRollNo + ", issuedBookNumbers=" + issuedBookNumbers + ", booksIssued=" + Arrays.toString(booksIssued) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return univRollNo == student.univRollNo &&
                issuedBookNumbers == student.issuedBookNumbers &&
                Objects.equals(studentFirstName, student.studentFirstName) &&
                Objects.equals(studentMiddleName, student.studentMiddleName) &&
                Objects.equals(studentLastName, student.studentLastName) &&
                Arrays.equals(booksIssued, student.booksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentFirstName, studentMiddleName, studentLastName, univRollNo, issuedBookNumbers);
        result = 31 * result + Arrays.hashCode(booksIssued);
        return result;
    }
}
