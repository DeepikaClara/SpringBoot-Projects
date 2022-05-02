package com.schoolmanagement.kvgschoolapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.schoolmanagement.kvgschoolapp.models.X_Std;
import com.schoolmanagement.kvgschoolapp.services.X_StdServices;
@Controller
public class X_StdController {
	@Autowired
	private X_StdServices service;
//	@GetMapping("/index#")
//	public String goHome()
//	{
//		return "X_Std";
//	}
	@GetMapping("/X-Std")
	private List<X_Std> getAllExams()
	{
		return service.getAllExams();
	}
	@GetMapping("/X-Std/{examName}")
	private X_Std getExamDetails(@PathVariable("examName") String examName)
	{
		return service.getExamDetails(examName);
		
	}
	@PostMapping("/X-Std")
	private  String create(@RequestBody X_Std x_Std)
	{
		service.save(x_Std);
		return x_Std.getExamName();
	}
	@PutMapping("/X-Std/{examName}")
	private void update(@PathVariable("ExamName") String examName,@RequestBody X_Std x_Std)
	{
	service.update(examName,x_Std);
	}
	@DeleteMapping("/X-Std/{examName}")
	private void delete(@PathVariable("examName") String examName)
	{
		service.delete(examName);
	}
	
}
