package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("students")
public class StudentController {

	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@PostMapping("saveStudent")
	public Student addStudent(@RequestBody Student student) {
		
		
		return studentRepository.save(student);
	}
	
	@PatchMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		
		return studentRepository.save(student);
	}
	


}
