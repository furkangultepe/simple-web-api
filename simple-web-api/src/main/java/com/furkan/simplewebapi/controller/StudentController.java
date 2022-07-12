package com.furkan.simplewebapi.controller;

import com.furkan.simplewebapi.model.Student;
import com.furkan.simplewebapi.payload.CreateStudentRequest;
import com.furkan.simplewebapi.payload.UpdateStudentRequest;
import com.furkan.simplewebapi.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> get() { 
        return studentService.getAll();
    }

    @PostMapping
    public Student create(@Valid @RequestBody CreateStudentRequest request) {
        return studentService.create(request);
    }

    @PatchMapping("/{id}")
    public Student update(@PathVariable int id,
                          @Valid @RequestBody UpdateStudentRequest request) {
        return studentService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return studentService.deleteById(id);
    }
}
