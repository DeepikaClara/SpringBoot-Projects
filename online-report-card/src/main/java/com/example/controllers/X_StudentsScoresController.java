package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.X_StudentsScores;
import com.example.services.X_StudentsScoresService;

@RestController
public class X_StudentsScoresController {
@Autowired
private X_StudentsScoresService service;
@GetMapping("/scores")
private List<X_StudentsScores> getAllStudentsScores()
{
	return service.getAllStudentsScores();
}
@GetMapping("/scores/{studentId}")
private X_StudentsScores getStudentsScores(@PathVariable("studentId")long studentId)
{
return service.getStudentsScores(studentId);	
}
@PostMapping("/scores")
private long create(@RequestBody X_StudentsScores scores)
{
	service.save(scores);
	return scores.getStudentId();
}
@PutMapping("/scores/{studentId}")
public void update(@PathVariable("studentId") long studentId,@RequestBody X_StudentsScores scores)
{
	service.save(scores);
}
@DeleteMapping("/scores/{studentId}")
public void delete(@PathVariable("studentId") long studentId)
{
	service.delete(studentId);
}
}
