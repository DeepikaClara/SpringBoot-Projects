package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.models.X_StudentsScores;
import com.example.services.X_StudentsScoresService;

@Controller
public class ScoresController {
	@Autowired
	private X_StudentsScoresService service1;
	@GetMapping("/scores")
	public String getAllStudentsScores(Model model)
	{
	List<X_StudentsScores> scores =service1.getAllStudentsScores();	
	model.addAttribute("scores",scores);
	return "scores";
	}
}
