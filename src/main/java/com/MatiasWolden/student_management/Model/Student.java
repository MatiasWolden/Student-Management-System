package com.MatiasWolden.student_management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Matias Wolden
 * @version 1.1
 * Java klasse for student
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String firstName;
    private String lastName;
    private String studentID;
    private String courseName;


    public Student() {
    }

    /**
     * @param firstName  - Fornavn til studenten
     * @param lastName   -Etternavn til studenten
     * @param studentID  -Studenten sitt personlige id f.eks H184900
     * @param courseName -Hvilken linje f.eks Juss eller Byggingeniør
     */
    public Student(String firstName, String lastName, String studentID, String courseName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courseName = courseName;
    }

    /**
     * Henter fornavnet til studenten
     *
     * @return Fornavnet til studenten som en String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Oppdaterer fornavnet til studenten
     *
     * @param firstName er det nye fornavnet til studenten
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Henter etternavnet til studenten
     *
     * @return etternavnet til studenten som en String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Oppdaterer etternavnet til studenten
     *
     * @param lastName blir det nye etternavnet til studenten
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Henter studentID for studenten
     *
     * @return studenID for studenten som en String
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * Oppdaterer studentID for studenten
     *
     * @param studentID blir den nye studentID for studenten
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * Henter studiet studenten går på
     *
     * @return studiet studenten går på som en String
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Oppdatere studiet studenten går på
     *
     * @param courseName blir det nye studiet studenten går på
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Generer en tekst reprentasjon av Student-objektet
     *
     * @return En String som inneholder Studenten sine attributter
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID='" + studentID + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
