package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
@AllArgsConstructor
public class StudentController {

    private  final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
//        throw new IllegalStateException("oops error");
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@Valid @RequestBody Student  student)
    {
        studentService.addStudent(student);


    }
    @DeleteMapping(path = "studentId")
    public void deleteStudent(
            @PathParam("studentId") Long studentId
    ){
        studentService.deleteStudent(studentId);
    }
}
