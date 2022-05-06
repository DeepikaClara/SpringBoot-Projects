package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.X_Std;
import com.example.models.X_StudentsScores;
import com.example.services.X_StdService;
import com.example.services.X_StudentsScoresService;

@Controller
public class ApplicationController {
@GetMapping("/index")
private String viewHome()
{
return "index";	
}
@Autowired
private X_StdService service;
@GetMapping("/exams")
public String getAllExamDetails(Model model)
{
	List<X_Std> exams=service.getAllExamDetails();
	model.addAttribute("exams", exams);
	return "exams"; 
}
//@Autowired
//private X_StudentsScoresService service1;
//@GetMapping("/studentsScores")
//private String getAllStudentsScores(Model model)
//{
//List<X_StudentsScores> studentsScores =service1.getAllStudentsScores();	
//model.addAttribute("studentsScores",studentsScores);
//return "studentsScores";
//}

//@Autowired
//private X_StudentsScoresService service;
//@GetMapping("/xscores")
//private List<X_StudentsScores> getAllStudentsScores()
//{
//	return service.getAllStudentsScores();
//}
//@Autowired
//private X_StdService service;
//@GetMapping({"/exams", "/"})
//public ModelAndView getAllExams() {
//	ModelAndView mav = new ModelAndView("list-exams");
//	mav.addObject("list-exams", service.getAllExamDetails());
//	return mav;
//}
//@GetMapping({"/exams","/"})
//private String getExams(Model model)
//{
//	model.addAttribute("list-exams",service.getAllExamDetails());
//	return "list-exams";
//}
}
