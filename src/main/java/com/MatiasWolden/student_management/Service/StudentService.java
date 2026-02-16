package com.MatiasWolden.student_management.Service;

import com.MatiasWolden.student_management.Model.Student;
import com.MatiasWolden.student_management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class StudentService {

    @Autowired StudentRepository studentRepository;

    /**
     *
     * @return alle studenter vi har lagret som en lsite
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     *  Lagrer en ny student i studentRepository
     * @param student
     */
    public void saveStudent(Student student){
        studentRepository.save(student);
    }


}
