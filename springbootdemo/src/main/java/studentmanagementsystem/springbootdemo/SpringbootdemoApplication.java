package studentmanagementsystem.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import studentmanagementsystem.springbootdemo.entity.Student;
import studentmanagementsystem.springbootdemo.repository.StudentRepository1;

@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	
	@Autowired
	private StudentRepository1 studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		Student student1 = new Student("Anusha", "Anilkumar", "anusha@gmail.com");
		studentRepository.save(student1);
		  
		Student student2 = new Student("Retish", "Pandu", "cherry@gmail.com");
		studentRepository.save(student2);
		 
		Student student3 = new Student("Nithin", "sai", "sai344@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("Latha", "Anil", "anil334@gmail.com");
		studentRepository.save(student4);
		
	}

}
