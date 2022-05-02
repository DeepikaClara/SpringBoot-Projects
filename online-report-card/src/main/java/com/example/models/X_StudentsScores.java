package com.example.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class X_StudentsScores {
	@Id
	@Column(name="ID")
private long studentId;
	@Column(name="Tamil")
private int tamilMarks;
	@Column(name="English")
private int englishMarks;
	@Column(name="Maths")
private int mathsMarks;
	@Column(name="Science")
private int scienceMarks;
	@Column(name="Social Science")
private int socialScienceMarks;
	@Column(name="Total")
private int totalMarks;
	@Column(name="Result")
private String result;
//	@ManyToOne(fetch=FetchType.LAZY,optional=false)
//	@JoinColumn(name="examName",nullable=false)
//	@OnDelete(action=OnDeleteAction.CASCADE)
//	@JsonIgnore
//	private X_Std x_Std;
}
