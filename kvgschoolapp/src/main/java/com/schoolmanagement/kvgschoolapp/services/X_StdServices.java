package com.schoolmanagement.kvgschoolapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.schoolmanagement.kvgschoolapp.models.X_Std;
import com.schoolmanagement.kvgschoolapp.repositories.X_StdRepository;


@Service
public class X_StdServices {
	@Autowired
	private X_StdRepository repo;

	public X_Std getExamDetails(String examName) {
		
		return repo.findById(examName).get();
	}

	public void save(X_Std x_Std) {
		repo.save(x_Std);
		}

	public void update(String examname, X_Std x_Std) {
		
		repo.save(x_Std);
	}

	public void delete(String examName) {
		repo.deleteById(examName);
			
		}

	public List<X_Std> getAllExams() {
		
			List<X_Std> x_Std  =new ArrayList<>();
			repo.findAll().forEach(exams->x_Std.add(exams));
			return(x_Std);
				
				
		
}
}
