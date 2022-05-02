package com.schoolmanagement.kvgschoolapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolmanagement.kvgschoolapp.models.X_Score;
import com.schoolmanagement.kvgschoolapp.repositories.X_ScoreRepository;
@Service
public class X_ScoreServices {
	@Autowired
	private X_ScoreRepository repo;

	public List<X_Score> getAllStudentsScores() {
	List<X_Score> scores =new ArrayList<>();
	repo.findAll().forEach(scores1->scores.add(scores1));
	return(scores);
		
	}

	public X_Score getStudentsScores(int studentId) {
		
		return repo.findById(studentId).get();
	}

	public void save(X_Score scores) {
	repo.save(scores);
		}

	public void update(int studentId, X_Score scores) {
		
		repo.save(scores);
	}

	public void delete(int studentId) {
		repo.deleteById(studentId);
			
		}
}
