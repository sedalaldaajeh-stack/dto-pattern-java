package com.example.dto;

import java.time.LocalDate;

/**
 * Domain / Entity class.
 * This represents the FULL internal object, exactly as it is stored
 * in the database. It contains sensitive or irrelevant fields
 * (like passwordHash and internalNotes) that should NEVER be sent
 * directly to a client application.
 */
public class Student {

    private int id;
    private String fullName;
    private String email;
    private String passwordHash;      // sensitive - must never leave the server
    private double gpa;
    private LocalDate enrollmentDate;
    private String internalAdvisorNotes; // internal use only

    public Student(int id, String fullName, String email, String passwordHash,
                   double gpa, LocalDate enrollmentDate, String internalAdvisorNotes) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.gpa = gpa;
        this.enrollmentDate = enrollmentDate;
        this.internalAdvisorNotes = internalAdvisorNotes;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPasswordHash() { return passwordHash; }
    public double getGpa() { return gpa; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public String getInternalAdvisorNotes() { return internalAdvisorNotes; }
}
