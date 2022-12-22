package studentmanagementsystem.springbootdemo.service;


import java.util.List;

import studentmanagementsystem.springbootdemo.entity.Student;

public interface Studentservice {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
