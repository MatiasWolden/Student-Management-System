package com.MatiasWolden.student_management.Service;

import com.MatiasWolden.student_management.Model.Student;
import com.MatiasWolden.student_management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Matias Wolden
 * @version 1.3
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    /**
     * Lister opp alle studenter vi har lagret i StudentRepository
     *
     * @return alle studenter vi har lagret som en liste
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Lagrer en ny student i studentRepository
     *
     * @param student er studenten som blir lagret
     */
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    /**
     *  Henter en spesifikk student basert på ID
     * @param id er den som nøkkelen som blir automatisk generet når vi lager en
     *           ny student som vi bruker får å bestemme hvem vi leter etter
     * @return her retunerer vi studenten (student objektet) og hvis den ikke finnes så får vi null
     */
    public Student getStudentByID(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Sletter en student basert på ID
     * @param id er den som nøkkelen som blir automatisk generet når vi lager en
     *           ny student som vi bruker her for å bestemem hvem som skal fjerne fra
     *           studenRepository
     */
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
