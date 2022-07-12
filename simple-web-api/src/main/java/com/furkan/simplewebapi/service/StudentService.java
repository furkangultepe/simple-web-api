package com.furkan.simplewebapi.service;

import com.furkan.simplewebapi.model.Student;
import com.furkan.simplewebapi.payload.CreateStudentRequest;
import com.furkan.simplewebapi.payload.UpdateStudentRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static int idIndex = 0;
    private static List<Student> studentList = new ArrayList<>();

    public List<Student> getAll() {
        return studentList;
    }

    public Student create(CreateStudentRequest request) {
        Student student = new Student();
        student.setId(idIndex++);
        student.setName(request.getName());
        student.setLastName(request.getLastName());
        student.setAge(request.getAge());
        studentList.add(student);
        return student;
    }

    public Student update(int id, UpdateStudentRequest request) {
        Student student = null;
        for (int x = 0; x < studentList.size(); x++) {
            if (studentList.get(x).getId() == id) {
                student = studentList.get(x);
                student.setName(request.getName());
                student.setLastName(request.getLastName());
                break;
            }
        }
        return student;
    }

    public boolean deleteById(int id) {
        return studentList.removeIf(student -> student.getId() == id);
    }
}
