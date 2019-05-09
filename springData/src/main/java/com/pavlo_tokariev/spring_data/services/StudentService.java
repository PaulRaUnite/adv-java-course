package com.pavlo_tokariev.spring_data.services;

import java.util.List;

import com.pavlo_tokariev.spring_data.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pavlo_tokariev.spring_data.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
    StudentRepository studentRepository;

	@Transactional
    public List<Student> getBestStudents() {return studentRepository.findByAverageMarkGreaterThanEqual(4);}

	@Transactional
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Transactional
	public List<Student> findByName(String name) {
		return studentRepository.findByFirstName(name);
	}

	@Transactional
	public Student getById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	@Transactional
	public void deleteStudent(Long personId) {
		studentRepository.deleteById(personId);
	}

	@Transactional
	public boolean addStudent(Student student) {
		return studentRepository.save(student) != null;
	}

	@Transactional
	public boolean updateStudent(Student student) {
		return studentRepository.save(student) != null;
	}
}
