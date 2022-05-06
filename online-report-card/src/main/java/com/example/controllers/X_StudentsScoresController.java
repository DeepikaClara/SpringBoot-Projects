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
import org.springframework.web.servlet.ModelAndView;

import com.example.models.X_StudentsScores;
import com.example.services.X_StudentsScoresService;


@RestController
public class X_StudentsScoresController {
@Autowired
private X_StudentsScoresService service1;
//@GetMapping("/studentsScores")
//private String getAllStudentsScores(Model model)
//{
//List<X_StudentsScores> studentsScores =service.getAllStudentsScores();	
//model.addAttribute("students scores",studentsScores);
//return "studentsScores";
//}

@GetMapping("/scores/{studentId}")
private X_StudentsScores getStudentsScores(@PathVariable("studentId")long studentId)
{
 return service1.getStudentsScores(studentId);
 
}

@PostMapping("/scores")
private long create(@RequestBody X_StudentsScores scores)
{
	service1.save(scores);
	return scores.getStudentId();
}
@PutMapping("/scores/{studentId}")
public void update(@PathVariable("studentId") long studentId,@RequestBody X_StudentsScores scores)
{
	service1.save(scores);
}
@DeleteMapping("/scores/{studentId}")
public void delete(@PathVariable("studentId") long studentId)
{
	service1.delete(studentId);
}
}
