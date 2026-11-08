package com.example.dto;

/**
 * Data Transfer Object (DTO).
 *
 * Only carries the fields that are safe and relevant to expose to
 * the outside world (e.g., a REST API response or a UI screen).
 * Notice:
 *   - No passwordHash
 *   - No internalAdvisorNotes
 *   - No business logic / behavior, only data + getters/setters
 */
public class StudentDTO {

    private int id;
    private String fullName;
    private String email;
    private double gpa;

    public StudentDTO() {
    }

    public StudentDTO(int id, String fullName, String email, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.gpa = gpa;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
