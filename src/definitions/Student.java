/*  Created by IntelliJ IDEA.
 *  User: Aman Kumar (amankumar 2509)
 *  Date: 23/08/20
 *  Time: 7:30 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long univRollNo;
    private int issuedBookNumbers;
    private Book[] booksIssued;

    public Student() {

    }

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

    /**
     * This method are used for getting student detail
     */

    public void studentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        studentFirstName = scanner.nextLine();
        System.out.println("enter middle name");
        studentMiddleName = scanner.nextLine();
        System.out.println("enter last name");
        studentLastName = scanner.nextLine();
        System.out.println("enter the university roll number");
        univRollNo = scanner.nextLong();
        System.out.println("your full name is:" + " " + studentFirstName + " " + studentMiddleName + " " + studentLastName);
        System.out.println("your university roll number is:" + univRollNo);


    }
}
