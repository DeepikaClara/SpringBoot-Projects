package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.X_Std;
import com.example.repositories.X_StdRepository;

@Service
public class X_StdService {
@Autowired
public X_StdRepository repo;
public List<X_Std> getAllExamDetails()
{
	List<X_Std>exams=new ArrayList<>();
	repo.findAll().forEach(exam->exams.add(exam));
	return exams;
}
public X_Std getExamDetails(String examName)
{
return repo.findById(examName).get();	
}
public void save(X_Std x_Std)
{
	repo.save(x_Std);
}
public void update(String examName,X_Std x_Std)
{
	repo.save(x_Std);
}
public void delete(String examName)
{
	repo.deleteById(examName);
}
}
