package com.example.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Service layer.
 * Simulates fetching data from a database (the internal Student objects)
 * and returns only StudentDTO objects to the outside layer (e.g., a
 * controller or a UI). This is exactly where the DTO pattern is applied:
 * the conversion happens at the boundary between layers.
 */
public class StudentService {

    private final List<Student> database = new ArrayList<>();

    public StudentService() {
        // Simulated database records (with sensitive data included)
        database.add(new Student(1, "Student One", "student1@example.org",
                "REDACTED_SAMPLE_HASH", 3.8,
                LocalDate.of(2023, 9, 1), "Sample advisor note"));

        database.add(new Student(2, "Student Two", "student2@example.org",
                "REDACTED_SAMPLE_HASH", 3.4,
                LocalDate.of(2022, 9, 1), "Excellent participation in labs"));
    }

    /** Returns safe DTOs only — never exposes the raw Student entity. */
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> result = new ArrayList<>();
        for (Student s : database) {
            result.add(StudentMapper.toDTO(s));
        }
        return result;
    }
}
