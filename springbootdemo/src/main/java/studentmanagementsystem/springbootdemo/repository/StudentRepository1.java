package studentmanagementsystem.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentmanagementsystem.springbootdemo.entity.Student;

public interface StudentRepository1 extends JpaRepository<Student, Long>{

}
