package com.MatiasWolden.student_management.Controller;

import com.MatiasWolden.student_management.Model.Student;
import com.MatiasWolden.student_management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Matias Wolden
 * Controller som håndterer HTTP forespørsler
 * @version 1.0
 */

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired StudentService studentService;

    /**
     *
     * @return alle studenter via metoden i serivce
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}


