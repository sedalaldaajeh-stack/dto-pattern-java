package com.example.dto;

import java.util.List;

/**
 * Demonstration of the Data Transfer Object (DTO) pattern.
 * The "client" (this Main class) only ever sees StudentDTO objects,
 * never the internal Student entity with its sensitive fields.
 */
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        List<StudentDTO> students = service.getAllStudents();

        System.out.println("Students returned to the client (safe data only):");
        for (StudentDTO dto : students) {
            System.out.println(dto);
        }
    }
}
