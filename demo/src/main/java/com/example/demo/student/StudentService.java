package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    // List that stores `Student Data`
    List<StudentsData> students = new ArrayList<>();

    // Returns the list of students
    public List<StudentsData> getStudents() {
        return students;
    }

    // Add a new student in the students list
    public void addStudent(StudentsData student) {
        students.add(student);
    }
}
