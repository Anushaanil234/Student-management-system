package studentmanagementsystem.springbootdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import studentmanagementsystem.springbootdemo.entity.Student;
import studentmanagementsystem.springbootdemo.repository.StudentRepository1;
import studentmanagementsystem.springbootdemo.service.Studentservice;

@Service
public class StudentserviceImpl implements Studentservice{

	private StudentRepository1 studentRepository;
	
	public StudentserviceImpl(StudentRepository1 studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
