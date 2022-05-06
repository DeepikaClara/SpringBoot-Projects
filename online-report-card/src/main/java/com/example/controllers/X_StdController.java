package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.X_Std;
import com.example.services.X_StdService;

@RestController
public class X_StdController {
@Autowired
private X_StdService service;
//@GetMapping("/exams")
//public String getAllExamDetails(Model model)
//{
//	List<X_Std> exams=service.getAllExamDetails();
//	model.addAttribute("exams", exams);
//	return "exams"; 
//}
@GetMapping("/exams/{examName}")
private X_Std getExamDetails(@PathVariable ("examName")String examName)
{
	return service.getExamDetails(examName);
	
}
@PostMapping("/exams")
private String create(@RequestBody X_Std x_Std)
{
	service.save(x_Std);
	return x_Std.getExamName();
}
@PutMapping("/exams/{examName}")
private void update(@PathVariable ("examName") String examName,@RequestBody X_Std x_Std)
{
service.save(x_Std);	
}
@DeleteMapping("/exams/{examName}")
private void delete(@PathVariable ("examName")String examName )
{
	service.delete(examName);
}
}
