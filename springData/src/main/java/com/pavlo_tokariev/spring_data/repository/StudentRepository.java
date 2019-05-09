package com.pavlo_tokariev.spring_data.repository;

import com.pavlo_tokariev.spring_data.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByAverageMarkGreaterThanEqual(float average_mark);
}
