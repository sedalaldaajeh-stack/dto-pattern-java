package com.example.dto;

/**
 * Mapper (Assembler).
 * Converts a Student (Entity) into a StudentDTO and vice versa.
 * Keeping this conversion logic in one place follows the
 * Single Responsibility Principle.
 */
public class StudentMapper {

    public static StudentDTO toDTO(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getFullName(),
                student.getEmail(),
                student.getGpa()
        );
    }
}
