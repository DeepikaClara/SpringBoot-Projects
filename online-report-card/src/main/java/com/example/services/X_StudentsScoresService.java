package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.X_StudentsScores;
import com.example.repositories.X_StudentsScoresRepository;

@Service
public class X_StudentsScoresService {
@Autowired
public X_StudentsScoresRepository repo;
public List<X_StudentsScores> getAllStudentsScores()
{
	List<X_StudentsScores>scores=new ArrayList<>();
	repo.findAll().forEach(score->scores.add(score));
	return scores;
}
public X_StudentsScores getStudentsScores(long studentId)
{
	return repo.findById(studentId).get();
}
public void save(X_StudentsScores scores)
{
	repo.save(scores);
	
}
public void update(long studentId,X_StudentsScores scores)
{
	repo.save(scores);
}
public void delete(long studentId)
{
	repo.deleteById(studentId);
}
}
