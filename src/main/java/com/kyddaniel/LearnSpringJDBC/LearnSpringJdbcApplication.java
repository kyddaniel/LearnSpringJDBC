package com.kyddaniel.LearnSpringJDBC;

import com.kyddaniel.LearnSpringJDBC.model.Student;
import com.kyddaniel.LearnSpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LearnSpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearnSpringJdbcApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Alice");
		student.setMarks(69);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(student);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}


}
