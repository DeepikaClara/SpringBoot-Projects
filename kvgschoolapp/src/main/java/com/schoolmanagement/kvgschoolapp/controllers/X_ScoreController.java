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

import com.schoolmanagement.kvgschoolapp.models.X_Score;
import com.schoolmanagement.kvgschoolapp.services.X_ScoreServices;

@Controller
public class X_ScoreController {
	@Autowired
	private X_ScoreServices service;
	@GetMapping("/scores")
	private List<X_Score> getAllStudentsScores()
	{
		return service.getAllStudentsScores();
	}
	@GetMapping("/scores/{studentId}")
	private X_Score getStudentsScores(@PathVariable("StudentId") int studentId)
	{
		return service.getStudentsScores(studentId);
	}
	@PostMapping("/scores")
	private void create(@RequestBody X_Score scores)
	{
		service.save(scores);
		//return scores.getStudentId();
		
	}
	@PutMapping("/scores/{studentId}")
	private void update(@PathVariable("StudentId") int studentId,@RequestBody X_Score scores)
	{
	service.update(studentId,scores);
	
	}
	@DeleteMapping("/scores/{studentId}")
	private void delete(@PathVariable("StudentId") int studentId)
	{
		service.delete(studentId);
	}
}
