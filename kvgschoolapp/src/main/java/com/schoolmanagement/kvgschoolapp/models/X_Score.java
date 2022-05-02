package com.schoolmanagement.kvgschoolapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class X_Score {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	@Column(name="Tamil")
	private int tamil;
	@Column(name="English")
	private int english;
	@Column(name="Maths")
	private int maths;
	@Column(name="science")
	private int science;
	@Column(name="SocialScience")
	private int socialScience;
	@Column(name="Total")
	private int total;
	@Column(name="Result")
	private String result;
	
	
}
