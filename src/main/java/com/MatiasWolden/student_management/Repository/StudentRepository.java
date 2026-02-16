package com.MatiasWolden.student_management.Repository;

import com.MatiasWolden.student_management.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface for databasetilgang til Student-entiteter.
 * * @author Matias Wolden
 *
 * @version 1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}