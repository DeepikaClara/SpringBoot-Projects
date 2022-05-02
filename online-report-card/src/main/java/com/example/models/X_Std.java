package com.example.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class X_Std {
	@Id
private String examName;
private String subject1;
private String subject2;
private String subject3;
private String subject4;
private String subject5;
@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@JoinColumn(name="Exam Name",referencedColumnName="examName")
private List<X_StudentsScores>scores;
}
